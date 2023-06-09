package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import controller.AvailableDateCtrl;
import database.DataAccessException;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AvailabilityCalendar extends JPanel {
	private SlidingPanel slide;
	private Map<String, AvailabilityCalendarPanel> calendarPanels;
	private AvailabilityCalendarPanel currentPanel;
	private LocalDateTime dateTime;
	private AvailableDateCtrl availableDateCtrl;

	private JButton arrowBack;
	private JButton arrowForward;
	private JLayeredPane jLayeredPane1;
	private JPanel jPanel1;
	private JLabel lbDate;
	private JLabel lbMonthYear;
	private JLabel lbTime;
	private JLabel lbType;

	public AvailabilityCalendar(AvailableDateCtrl availableDateCtrl) throws DataAccessException {
		this.availableDateCtrl = availableDateCtrl;
		setBackground(Color.WHITE);
		dateTime = LocalDateTime.now();

		calendarPanels = new HashMap<>();
		initComponents();
		slide.show(new AvailabilityCalendarPanel(dateTime), SlidingPanel.AnimateType.TO_RIGHT);
		updateMonthYear();
		initializeThread();
		initializeButtons();

	}

	private void initComponents() throws DataAccessException {
		slide = new SlidingPanel();
		slide.setBackground(new Color(255, 255, 255));
		jPanel1 = new JPanel();
		jPanel1.setBackground(new Color(255, 255, 255));
		jLayeredPane1 = new JLayeredPane();
		lbMonthYear = new JLabel();
		lbTime = new JLabel();
		lbType = new JLabel();
		lbDate = new JLabel();

		lbMonthYear.setBackground(new Color(0, 128, 192));
		lbMonthYear.setFont(new Font("sansserif", Font.BOLD, 30));
		lbMonthYear.setForeground(new Color(0, 128, 192));
		lbMonthYear.setHorizontalAlignment(SwingConstants.CENTER);
		lbMonthYear.setText("Month - Year");

		jLayeredPane1.setLayer(lbMonthYear, JLayeredPane.DEFAULT_LAYER);

		arrowForward = new JButton();
		arrowForward.setIcon(
				new ImageIcon(AvailabilityCalendar.class.getResource("/icons/angle-double-small-left (1).png")));
		arrowForward.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		arrowForward.setContentAreaFilled(false);
		arrowForward.setCursor(new Cursor(Cursor.HAND_CURSOR));
		arrowForward.addActionListener(evt -> SwingUtilities.invokeLater(this::arrowForwardActionPerformed));

		arrowBack = new JButton();
		arrowBack.setIcon(new ImageIcon(AvailabilityCalendar.class.getResource("/icons/angle-double-small-left.png")));
		arrowBack.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		arrowBack.setContentAreaFilled(false);
		arrowBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
		arrowBack.addActionListener(evt -> SwingUtilities.invokeLater(this::arrowBackActionPerformed));

		jLayeredPane1.setLayer(arrowForward, JLayeredPane.DEFAULT_LAYER);
		jLayeredPane1.setLayer(arrowBack, JLayeredPane.DEFAULT_LAYER);

		lbTime.setFont(new Font("SansSerif", Font.BOLD, 30));
		lbTime.setForeground(new Color(0, 0, 0));
		lbTime.setHorizontalAlignment(SwingConstants.LEFT);
		lbType.setFont(new Font("sansserif", Font.BOLD, 25));
		lbType.setForeground(new Color(0, 0, 0));
		lbDate.setFont(new Font("sansserif", Font.PLAIN, 18));
		lbDate.setForeground(new Color(0, 0, 0));
		lbDate.setHorizontalAlignment(SwingConstants.CENTER);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(lbTime, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(lbType, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
						.addComponent(lbDate, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(67, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(lbTime, GroupLayout.PREFERRED_SIZE, 49,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lbType))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(lbDate)
								.addContainerGap(537, Short.MAX_VALUE)));

		GroupLayout jLayeredPane1Layout = new GroupLayout(jLayeredPane1);
		jLayeredPane1.setLayout(jLayeredPane1Layout);
		jLayeredPane1Layout.setHorizontalGroup(jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jLayeredPane1Layout.createSequentialGroup().addContainerGap()
						.addComponent(arrowBack, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(lbMonthYear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(arrowForward, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addGap(22)));
		jLayeredPane1Layout.setVerticalGroup(jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jLayeredPane1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jLayeredPane1Layout
										.createSequentialGroup()
										.addComponent(arrowBack, GroupLayout.PREFERRED_SIZE, 41,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(GroupLayout.Alignment.TRAILING,
										jLayeredPane1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addGroup(jLayeredPane1Layout
														.createParallelGroup(GroupLayout.Alignment.TRAILING)
														.addComponent(lbMonthYear, GroupLayout.PREFERRED_SIZE, 38,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(arrowForward, GroupLayout.PREFERRED_SIZE, 38,
																GroupLayout.PREFERRED_SIZE))
												.addGap(22)))));

		GroupLayout layout = new GroupLayout(this);
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLayeredPane1, GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
						.addComponent(slide, GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(13)
					.addComponent(jLayeredPane1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(slide, GroupLayout.PREFERRED_SIZE, 692, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
		);
		this.setLayout(layout);
		try {
			initializeButtons();
			initializeLabels();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	private void initializeButtons() throws DataAccessException {
		arrowForward.setIcon(
				new ImageIcon(AvailabilityCalendar.class.getResource("/icons/angle-double-small-left (1).png")));
		arrowForward.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		arrowForward.setContentAreaFilled(false);
		arrowForward.setCursor(new Cursor(Cursor.HAND_CURSOR));

		arrowBack.setIcon(new ImageIcon(AvailabilityCalendar.class.getResource("/icons/angle-double-small-left.png")));
		arrowBack.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		arrowBack.setContentAreaFilled(false);
		arrowBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	private void initializeLabels() throws DataAccessException {

		lbTime = new JLabel();
		lbTime.setFont(new Font("SansSerif", Font.BOLD, 30));
		lbTime.setForeground(Color.BLACK);
		lbTime.setHorizontalAlignment(SwingConstants.LEFT);

		lbType = new JLabel();
		lbType.setFont(new Font("SansSerif", Font.BOLD, 25));
		lbType.setForeground(Color.BLACK);

		lbDate = new JLabel();
		lbDate.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lbDate.setForeground(Color.BLACK);
		lbDate.setHorizontalAlignment(SwingConstants.CENTER);

		
	    JPanel registerPanel = new JPanel();
	    registerPanel.setBackground(Color.WHITE);
	    registerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

	    JLabel lbRegisterAvailability = new JLabel();
	    lbRegisterAvailability.setFont(new Font("SansSerif", Font.BOLD, 20));
	    lbRegisterAvailability.setForeground(Color.BLACK);
	    lbRegisterAvailability.setHorizontalAlignment(SwingConstants.CENTER);
	    lbRegisterAvailability.setBorder(BorderFactory.createEmptyBorder(100, 50, 0, 0)); 
	    lbRegisterAvailability.setText("<html>This is the calendar for<br>registering your availability</html>");

	  
	    registerPanel.add(lbRegisterAvailability);

	    // Add the existing labels and the register panel to the main panel
	    jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
	    jPanel1.add(lbTime);
	    jPanel1.add(lbType);
	    jPanel1.add(lbDate);
	    jPanel1.add(registerPanel);
	}

	private void initializeThread() {
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				SwingUtilities.invokeLater(() -> {
					LocalDateTime now = LocalDateTime.now();
					DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm:ss a");
					DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, yyyy-MM/dd");
					String timeText = now.format(tf);
					String dateText = now.format(df);
					lbTime.setText(timeText);
					lbDate.setText(dateText);
				});
			}
		}).start();
	}

	private void arrowForwardActionPerformed() {
		dateTime = dateTime.plusMonths(1);

		changePanel();
		try {
			slide.show(new AvailabilityCalendarPanel(dateTime), SlidingPanel.AnimateType.TO_LEFT);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateMonthYear();
	}

	private void arrowBackActionPerformed() {

		dateTime = dateTime.minusMonths(1);

		changePanel();
		try {
			slide.show(new AvailabilityCalendarPanel(dateTime), SlidingPanel.AnimateType.TO_RIGHT);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateMonthYear();

	}

	private void updateMonthYear() {

		DateTimeFormatter mf = DateTimeFormatter.ofPattern("MMMM yyyy");
		lbMonthYear.setText(dateTime.format(mf));
	}

	private void changePanel() {
		try {
			String monthYearKey = dateTime.format(DateTimeFormatter.ofPattern("MM-yyyy"));
			if (!calendarPanels.containsKey(monthYearKey)) {
				AvailabilityCalendarPanel panel = new AvailabilityCalendarPanel(dateTime.getMonthValue(),
						dateTime.getYear());
				calendarPanels.put(monthYearKey, panel);
			}
			if (currentPanel != null) {
				slide.remove(currentPanel);
			}
			currentPanel = calendarPanels.get(monthYearKey);
			slide.add(currentPanel);
			slide.revalidate();
			slide.repaint();
		} catch (DataAccessException e) {
			JOptionPane.showMessageDialog(null, "Error loading data", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
