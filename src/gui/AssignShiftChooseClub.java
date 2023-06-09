package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import controller.ShiftCtrl;
import database.DataAccessException;
import model.Bar;

public class AssignShiftChooseClub extends JFrame {

	private JPanel contentPane;
	private ShiftCtrl shiftCtrl;
	private JButton btnShiftTime1_1;
	private JButton btnShiftTime1_2;
	private JLabel lblName1;
	private JButton btnShiftTime2_1;
	private JButton btnShiftTime2_2;
	private JButton btnShiftTime3_1;
	private JButton btnShiftTime3_2;
	private JButton btnShiftTime4_1;
	private JButton btnShiftTime4_2;
	private JButton btnShiftTime5_1;
	private JButton btnShiftTime5_2;
	private JButton btnShiftTime6_1;
	private JButton btnShiftTime6_2;
	private JButton btnShiftTime7_1;
	private JButton btnShiftTime7_2;
	private JButton btnShiftTime8_1;
	private JButton btnShiftTime8_2;
	private JButton btnShiftTime9_1;
	private JButton btnShiftTime9_2;
	private JButton btnShiftTime11_1;
	private JButton btnShiftTime11_2;
	private JButton btnShiftTime12_1;
	private JButton btnShiftTime12_2;
	private JButton btnShiftTime10_2;
	private JButton btnShiftTime10_1;
	private JLabel lblName2;
	private JLabel lblName3;
	private JLabel lblName4;
	private JLabel lblName5;
	private JLabel lblName6;
	private JLabel lblName7;
	private JLabel lblName8;
	private JLabel lblName9;
	private JLabel lblName10;
	private JLabel lblName11;
	private JLabel lblName12;
	private int shiftId1_1;
	private int shiftId1_2;
	private int shiftId2_1;
	private int shiftId2_2;
	private int shiftId3_1;
	private int shiftId3_2;
	private int shiftId4_1;
	private int shiftId4_2;
	private int shiftId5_1;
	private int shiftId5_2;
	private int shiftId6_1;
	private int shiftId6_2;
	private int shiftId7_1;
	private int shiftId7_2;
	private int shiftId8_1;
	private int shiftId8_2;
	private int shiftId9_1;
	private int shiftId9_2;
	private int shiftId10_1;
	private int shiftId10_2;
	private int shiftId11_1;
	private int shiftId11_2;
	private int shiftId12_1;
	private int shiftId12_2;
	private JLabel lblAddress1;
	private JLabel lblAddress2;
	private JLabel lblAddress3;
	private JLabel lblAddress4;
	private JLabel lblAddress5;
	private JLabel lblAddress6;
	private JLabel lblAddress7;
	private JLabel lblAddress8;
	private JLabel lblAddress9;
	private JLabel lblAddress10;
	private JLabel lblAddress11;
	private JLabel lblAddress12;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignShiftChooseClub frame = new AssignShiftChooseClub(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws DataAccessException 
	 * @throws SQLException 
	 */
	public AssignShiftChooseClub(LocalDate currentDate) throws DataAccessException, SQLException {
		setUIStyle();
		shiftCtrl = new ShiftCtrl();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblName1 = new JLabel("");
		lblName1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName1 = new GridBagConstraints();
		gbc_lblName1.gridwidth = 2;
		gbc_lblName1.insets = new Insets(0, 0, 5, 5);
		gbc_lblName1.gridx = 1;
		gbc_lblName1.gridy = 0;
		panel_1.add(lblName1, gbc_lblName1);
		
		lblAddress1 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress1 = new GridBagConstraints();
		gbc_lblAddress1.gridwidth = 2;
		gbc_lblAddress1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress1.gridx = 1;
		gbc_lblAddress1.gridy = 1;
		panel_1.add(lblAddress1, gbc_lblAddress1);
		
		btnShiftTime1_2 = new JButton("");
		btnShiftTime1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnShiftTime1_1 = new JButton();
		
		GridBagConstraints gbc_btnShiftTime1_1 = new GridBagConstraints();
		gbc_btnShiftTime1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime1_1.gridx = 1;
		gbc_btnShiftTime1_1.gridy = 3;
		panel_1.add(btnShiftTime1_1, gbc_btnShiftTime1_1);
		GridBagConstraints gbc_btnShiftTime1_2 = new GridBagConstraints();
		gbc_btnShiftTime1_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime1_2.gridx = 2;
		gbc_btnShiftTime1_2.gridy = 3;
		panel_1.add(btnShiftTime1_2, gbc_btnShiftTime1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblName2 = new JLabel("");
		lblName2.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName2 = new GridBagConstraints();
		gbc_lblName2.gridwidth = 2;
		gbc_lblName2.insets = new Insets(0, 0, 5, 5);
		gbc_lblName2.gridx = 1;
		gbc_lblName2.gridy = 0;
		panel_2.add(lblName2, gbc_lblName2);
		
		lblAddress2 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress2 = new GridBagConstraints();
		gbc_lblAddress2.gridwidth = 2;
		gbc_lblAddress2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress2.gridx = 1;
		gbc_lblAddress2.gridy = 1;
		panel_2.add(lblAddress2, gbc_lblAddress2);
		
		btnShiftTime2_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime2_1 = new GridBagConstraints();
		gbc_btnShiftTime2_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime2_1.gridx = 1;
		gbc_btnShiftTime2_1.gridy = 3;
		panel_2.add(btnShiftTime2_1, gbc_btnShiftTime2_1);
		
		btnShiftTime2_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime2_2 = new GridBagConstraints();
		gbc_btnShiftTime2_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime2_2.gridx = 2;
		gbc_btnShiftTime2_2.gridy = 3;
		panel_2.add(btnShiftTime2_2, gbc_btnShiftTime2_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 0;
		contentPane.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		lblName3 = new JLabel("");
		lblName3.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName3 = new GridBagConstraints();
		gbc_lblName3.gridwidth = 2;
		gbc_lblName3.insets = new Insets(0, 0, 5, 5);
		gbc_lblName3.gridx = 1;
		gbc_lblName3.gridy = 0;
		panel_3.add(lblName3, gbc_lblName3);
		
		lblAddress3 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress3 = new GridBagConstraints();
		gbc_lblAddress3.gridwidth = 2;
		gbc_lblAddress3.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress3.gridx = 1;
		gbc_lblAddress3.gridy = 1;
		panel_3.add(lblAddress3, gbc_lblAddress3);
		
		btnShiftTime3_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime3_1 = new GridBagConstraints();
		gbc_btnShiftTime3_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime3_1.gridx = 1;
		gbc_btnShiftTime3_1.gridy = 3;
		panel_3.add(btnShiftTime3_1, gbc_btnShiftTime3_1);
		
		btnShiftTime3_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime3_2 = new GridBagConstraints();
		gbc_btnShiftTime3_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime3_2.gridx = 2;
		gbc_btnShiftTime3_2.gridy = 3;
		panel_3.add(btnShiftTime3_2, gbc_btnShiftTime3_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 3;
		gbc_panel_4.gridy = 0;
		contentPane.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		lblName4 = new JLabel("");
		lblName4.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName4 = new GridBagConstraints();
		gbc_lblName4.gridwidth = 2;
		gbc_lblName4.insets = new Insets(0, 0, 5, 5);
		gbc_lblName4.gridx = 1;
		gbc_lblName4.gridy = 0;
		panel_4.add(lblName4, gbc_lblName4);
		
		lblAddress4 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress4 = new GridBagConstraints();
		gbc_lblAddress4.gridwidth = 2;
		gbc_lblAddress4.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress4.gridx = 1;
		gbc_lblAddress4.gridy = 1;
		panel_4.add(lblAddress4, gbc_lblAddress4);
		
		btnShiftTime4_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime4_1 = new GridBagConstraints();
		gbc_btnShiftTime4_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime4_1.gridx = 1;
		gbc_btnShiftTime4_1.gridy = 3;
		panel_4.add(btnShiftTime4_1, gbc_btnShiftTime4_1);
		
		btnShiftTime4_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime4_2 = new GridBagConstraints();
		gbc_btnShiftTime4_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime4_2.gridx = 2;
		gbc_btnShiftTime4_2.gridy = 3;
		panel_4.add(btnShiftTime4_2, gbc_btnShiftTime4_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		contentPane.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		lblName5 = new JLabel("");
		lblName5.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName5 = new GridBagConstraints();
		gbc_lblName5.gridwidth = 2;
		gbc_lblName5.insets = new Insets(0, 0, 5, 5);
		gbc_lblName5.gridx = 1;
		gbc_lblName5.gridy = 0;
		panel_5.add(lblName5, gbc_lblName5);
		
		lblAddress5 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress5 = new GridBagConstraints();
		gbc_lblAddress5.gridwidth = 2;
		gbc_lblAddress5.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress5.gridx = 1;
		gbc_lblAddress5.gridy = 1;
		panel_5.add(lblAddress5, gbc_lblAddress5);
		
		btnShiftTime5_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime5_1 = new GridBagConstraints();
		gbc_btnShiftTime5_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime5_1.gridx = 1;
		gbc_btnShiftTime5_1.gridy = 3;
		panel_5.add(btnShiftTime5_1, gbc_btnShiftTime5_1);
		
		btnShiftTime5_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime5_2 = new GridBagConstraints();
		gbc_btnShiftTime5_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime5_2.gridx = 2;
		gbc_btnShiftTime5_2.gridy = 3;
		panel_5.add(btnShiftTime5_2, gbc_btnShiftTime5_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 5, 5);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 1;
		gbc_panel_6.gridy = 1;
		contentPane.add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		lblName6 = new JLabel("");
		lblName6.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName6 = new GridBagConstraints();
		gbc_lblName6.gridwidth = 2;
		gbc_lblName6.insets = new Insets(0, 0, 5, 5);
		gbc_lblName6.gridx = 1;
		gbc_lblName6.gridy = 0;
		panel_6.add(lblName6, gbc_lblName6);
		
		lblAddress6 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress6 = new GridBagConstraints();
		gbc_lblAddress6.gridwidth = 2;
		gbc_lblAddress6.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress6.gridx = 1;
		gbc_lblAddress6.gridy = 1;
		panel_6.add(lblAddress6, gbc_lblAddress6);
		
		btnShiftTime6_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime6_1 = new GridBagConstraints();
		gbc_btnShiftTime6_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime6_1.gridx = 1;
		gbc_btnShiftTime6_1.gridy = 3;
		panel_6.add(btnShiftTime6_1, gbc_btnShiftTime6_1);
		
		btnShiftTime6_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime6_2 = new GridBagConstraints();
		gbc_btnShiftTime6_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime6_2.gridx = 2;
		gbc_btnShiftTime6_2.gridy = 3;
		panel_6.add(btnShiftTime6_2, gbc_btnShiftTime6_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 2;
		gbc_panel_7.gridy = 1;
		contentPane.add(panel_7, gbc_panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		lblName7 = new JLabel("");
		lblName7.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName7 = new GridBagConstraints();
		gbc_lblName7.gridwidth = 2;
		gbc_lblName7.insets = new Insets(0, 0, 5, 5);
		gbc_lblName7.gridx = 1;
		gbc_lblName7.gridy = 0;
		panel_7.add(lblName7, gbc_lblName7);
		
		lblAddress7 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress7 = new GridBagConstraints();
		gbc_lblAddress7.gridwidth = 2;
		gbc_lblAddress7.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress7.gridx = 1;
		gbc_lblAddress7.gridy = 1;
		panel_7.add(lblAddress7, gbc_lblAddress7);
		
		btnShiftTime7_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime7_1 = new GridBagConstraints();
		gbc_btnShiftTime7_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime7_1.gridx = 1;
		gbc_btnShiftTime7_1.gridy = 3;
		panel_7.add(btnShiftTime7_1, gbc_btnShiftTime7_1);
		
		btnShiftTime7_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime7_2 = new GridBagConstraints();
		gbc_btnShiftTime7_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime7_2.gridx = 2;
		gbc_btnShiftTime7_2.gridy = 3;
		panel_7.add(btnShiftTime7_2, gbc_btnShiftTime7_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 3;
		gbc_panel_8.gridy = 1;
		contentPane.add(panel_8, gbc_panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		lblName8 = new JLabel("");
		lblName8.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName8 = new GridBagConstraints();
		gbc_lblName8.gridwidth = 2;
		gbc_lblName8.insets = new Insets(0, 0, 5, 5);
		gbc_lblName8.gridx = 1;
		gbc_lblName8.gridy = 0;
		panel_8.add(lblName8, gbc_lblName8);
		
		lblAddress8 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress8 = new GridBagConstraints();
		gbc_lblAddress8.gridwidth = 2;
		gbc_lblAddress8.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress8.gridx = 1;
		gbc_lblAddress8.gridy = 1;
		panel_8.add(lblAddress8, gbc_lblAddress8);
		
		btnShiftTime8_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime8_1 = new GridBagConstraints();
		gbc_btnShiftTime8_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime8_1.gridx = 1;
		gbc_btnShiftTime8_1.gridy = 3;
		panel_8.add(btnShiftTime8_1, gbc_btnShiftTime8_1);
		
		btnShiftTime8_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime8_2 = new GridBagConstraints();
		gbc_btnShiftTime8_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime8_2.gridx = 2;
		gbc_btnShiftTime8_2.gridy = 3;
		panel_8.add(btnShiftTime8_2, gbc_btnShiftTime8_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 0, 5);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 2;
		contentPane.add(panel_9, gbc_panel_9);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_9.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_9.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		lblName9 = new JLabel("");
		lblName9.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName9 = new GridBagConstraints();
		gbc_lblName9.gridwidth = 2;
		gbc_lblName9.insets = new Insets(0, 0, 5, 5);
		gbc_lblName9.gridx = 1;
		gbc_lblName9.gridy = 0;
		panel_9.add(lblName9, gbc_lblName9);
		
		lblAddress9 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress9 = new GridBagConstraints();
		gbc_lblAddress9.gridwidth = 2;
		gbc_lblAddress9.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress9.gridx = 1;
		gbc_lblAddress9.gridy = 1;
		panel_9.add(lblAddress9, gbc_lblAddress9);
		
		btnShiftTime9_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime9_1 = new GridBagConstraints();
		gbc_btnShiftTime9_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime9_1.gridx = 1;
		gbc_btnShiftTime9_1.gridy = 3;
		panel_9.add(btnShiftTime9_1, gbc_btnShiftTime9_1);
		
		btnShiftTime9_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime9_2 = new GridBagConstraints();
		gbc_btnShiftTime9_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime9_2.gridx = 2;
		gbc_btnShiftTime9_2.gridy = 3;
		panel_9.add(btnShiftTime9_2, gbc_btnShiftTime9_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 0, 5);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 1;
		gbc_panel_10.gridy = 2;
		contentPane.add(panel_10, gbc_panel_10);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_10.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		lblName10 = new JLabel("");
		lblName10.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName10 = new GridBagConstraints();
		gbc_lblName10.gridwidth = 2;
		gbc_lblName10.insets = new Insets(0, 0, 5, 5);
		gbc_lblName10.gridx = 1;
		gbc_lblName10.gridy = 0;
		panel_10.add(lblName10, gbc_lblName10);
		
		lblAddress10 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress10 = new GridBagConstraints();
		gbc_lblAddress10.gridwidth = 2;
		gbc_lblAddress10.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress10.gridx = 1;
		gbc_lblAddress10.gridy = 1;
		panel_10.add(lblAddress10, gbc_lblAddress10);
		
		btnShiftTime10_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime10_1 = new GridBagConstraints();
		gbc_btnShiftTime10_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime10_1.gridx = 1;
		gbc_btnShiftTime10_1.gridy = 3;
		panel_10.add(btnShiftTime10_1, gbc_btnShiftTime10_1);
		
		btnShiftTime10_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime10_2 = new GridBagConstraints();
		gbc_btnShiftTime10_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime10_2.gridx = 2;
		gbc_btnShiftTime10_2.gridy = 3;
		panel_10.add(btnShiftTime10_2, gbc_btnShiftTime10_2);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 0, 5);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 2;
		gbc_panel_11.gridy = 2;
		contentPane.add(panel_11, gbc_panel_11);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_11.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_11.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_11.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_11.setLayout(gbl_panel_11);
		
		lblName11 = new JLabel("");
		lblName11.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName11 = new GridBagConstraints();
		gbc_lblName11.gridwidth = 2;
		gbc_lblName11.insets = new Insets(0, 0, 5, 5);
		gbc_lblName11.gridx = 1;
		gbc_lblName11.gridy = 0;
		panel_11.add(lblName11, gbc_lblName11);
		
		lblAddress11 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress11 = new GridBagConstraints();
		gbc_lblAddress11.gridwidth = 2;
		gbc_lblAddress11.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress11.gridx = 1;
		gbc_lblAddress11.gridy = 1;
		panel_11.add(lblAddress11, gbc_lblAddress11);
		
		btnShiftTime11_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime11_1 = new GridBagConstraints();
		gbc_btnShiftTime11_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime11_1.gridx = 1;
		gbc_btnShiftTime11_1.gridy = 3;
		panel_11.add(btnShiftTime11_1, gbc_btnShiftTime11_1);
		
		btnShiftTime11_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime11_2 = new GridBagConstraints();
		gbc_btnShiftTime11_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime11_2.gridx = 2;
		gbc_btnShiftTime11_2.gridy = 3;
		panel_11.add(btnShiftTime11_2, gbc_btnShiftTime11_2);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.GRAY));
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 3;
		gbc_panel_12.gridy = 2;
		contentPane.add(panel_12, gbc_panel_12);
		GridBagLayout gbl_panel_12 = new GridBagLayout();
		gbl_panel_12.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_12.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_12.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_12.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_12.setLayout(gbl_panel_12);
		
		lblName12 = new JLabel("");
		lblName12.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblName12 = new GridBagConstraints();
		gbc_lblName12.gridwidth = 2;
		gbc_lblName12.insets = new Insets(0, 0, 5, 5);
		gbc_lblName12.gridx = 1;
		gbc_lblName12.gridy = 0;
		panel_12.add(lblName12, gbc_lblName12);
		
		lblAddress12 = new JLabel("Jomfru Ane Gade ??");
		GridBagConstraints gbc_lblAddress12 = new GridBagConstraints();
		gbc_lblAddress12.gridwidth = 2;
		gbc_lblAddress12.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress12.gridx = 1;
		gbc_lblAddress12.gridy = 1;
		panel_12.add(lblAddress12, gbc_lblAddress12);
		
		btnShiftTime12_1 = new JButton("");
		GridBagConstraints gbc_btnShiftTime12_1 = new GridBagConstraints();
		gbc_btnShiftTime12_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime12_1.gridx = 1;
		gbc_btnShiftTime12_1.gridy = 3;
		panel_12.add(btnShiftTime12_1, gbc_btnShiftTime12_1);
		
		btnShiftTime12_2 = new JButton("");
		GridBagConstraints gbc_btnShiftTime12_2 = new GridBagConstraints();
		gbc_btnShiftTime12_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnShiftTime12_2.gridx = 2;
		gbc_btnShiftTime12_2.gridy = 3;
		panel_12.add(btnShiftTime12_2, gbc_btnShiftTime12_2);
		
		btnShiftTime1_1.setVisible(false);
		btnShiftTime1_2.setVisible(false);
		btnShiftTime2_1.setVisible(false);
		btnShiftTime2_2.setVisible(false);
		btnShiftTime3_1.setVisible(false);
		btnShiftTime3_2.setVisible(false);
		btnShiftTime4_1.setVisible(false);
		btnShiftTime4_2.setVisible(false);
		btnShiftTime5_1.setVisible(false);
		btnShiftTime5_2.setVisible(false);
		btnShiftTime6_1.setVisible(false);
		btnShiftTime6_2.setVisible(false);
		btnShiftTime7_1.setVisible(false);
		btnShiftTime7_2.setVisible(false);
		btnShiftTime8_1.setVisible(false);
		btnShiftTime8_2.setVisible(false);
		btnShiftTime9_1.setVisible(false);
		btnShiftTime9_2.setVisible(false);
		btnShiftTime10_1.setVisible(false);
		btnShiftTime10_2.setVisible(false);
		btnShiftTime11_1.setVisible(false);
		btnShiftTime11_2.setVisible(false);
		btnShiftTime12_1.setVisible(false);
		btnShiftTime12_2.setVisible(false);
		 
		init(currentDate);
	}
	
	private void init(LocalDate currentDate) throws DataAccessException, SQLException {
		shiftCtrl = new ShiftCtrl();
		displayBars(currentDate);
		displayShifts(currentDate);	
	}
	
	private void displayBars(LocalDate currentDate) throws DataAccessException, SQLException {
		List<Bar> bars = shiftCtrl.getAllBars();
		lblName1.setText(bars.get(0).getName());
		lblName2.setText(bars.get(1).getName());
		lblName3.setText(bars.get(2).getName());
		lblName4.setText(bars.get(3).getName());
		lblName5.setText(bars.get(4).getName());
		lblName6.setText(bars.get(5).getName());
		lblName7.setText(bars.get(6).getName());
		lblName8.setText(bars.get(7).getName());
		lblName9.setText(bars.get(8).getName());
		lblName10.setText(bars.get(9).getName());
		lblName11.setText(bars.get(10).getName());
		lblName12.setText(bars.get(11).getName());
		lblAddress1.setText(bars.get(0).getAddress());
		lblAddress2.setText(bars.get(1).getAddress());
		lblAddress3.setText(bars.get(2).getAddress());
		lblAddress4.setText(bars.get(3).getAddress());
		lblAddress5.setText(bars.get(4).getAddress());
		lblAddress6.setText(bars.get(5).getAddress());
		lblAddress7.setText(bars.get(6).getAddress());
		lblAddress8.setText(bars.get(7).getAddress());
		lblAddress9.setText(bars.get(8).getAddress());
		lblAddress10.setText(bars.get(9).getAddress());
		lblAddress11.setText(bars.get(10).getAddress());
		lblAddress12.setText(bars.get(11).getAddress());

	}
	
	private void displayShifts(LocalDate currentDate) throws DataAccessException, SQLException {
		List<Bar> bars = shiftCtrl.getAllBars();
		shiftCtrl.getShiftsByDate(currentDate)
				.stream()
				.forEach(s -> {	
					switch(bars.get(s.getBarId()-1).getName()){
						case "Fabrikken":
							if(btnShiftTime1_1.getText().isEmpty()) {
								btnShiftTime1_1.setVisible(true);
								btnShiftTime1_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId1_1 = s.getShiftId();
								btnShiftTime1_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 1, shiftId1_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime1_2.setVisible(true);
								btnShiftTime1_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId1_2 = s.getShiftId();
								btnShiftTime1_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 1, shiftId1_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Zurf":
							if(btnShiftTime2_1.getText().isEmpty()) {
								btnShiftTime2_1.setVisible(true);
								btnShiftTime2_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId2_1 = s.getShiftId();
								btnShiftTime2_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 2, shiftId2_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime2_2.setVisible(true);
								btnShiftTime2_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId12_2 = s.getShiftId();
								btnShiftTime2_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 2, shiftId2_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "El Mundo":
							if(btnShiftTime3_1.getText().isEmpty()) {
								btnShiftTime3_1.setVisible(true);
								btnShiftTime3_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId3_1 = s.getShiftId();
								btnShiftTime3_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 3, shiftId3_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime3_2.setVisible(true);
								btnShiftTime3_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId3_2 = s.getShiftId();
								btnShiftTime3_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 3, shiftId3_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Sprutten":
							if(btnShiftTime4_1.getText().isEmpty()) {
								btnShiftTime4_1.setVisible(true);
								btnShiftTime4_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId4_1 = s.getShiftId();
								btnShiftTime4_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 4, shiftId4_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
								
							}
							else {
								btnShiftTime4_2.setVisible(true);
								btnShiftTime4_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId4_2 = s.getShiftId();
								btnShiftTime4_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 4, shiftId4_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Zwei grosse":
							if(btnShiftTime5_1.getText().isEmpty()) {
								btnShiftTime5_1.setVisible(true);
								btnShiftTime5_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId5_1 = s.getShiftId();
								btnShiftTime5_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 5, shiftId5_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime5_2.setVisible(true);
								btnShiftTime5_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId5_2 = s.getShiftId();
								btnShiftTime5_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 5, shiftId5_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Wunderbar":
							if(btnShiftTime6_1.getText().isEmpty()) {
								btnShiftTime6_1.setVisible(true);
								btnShiftTime6_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId6_1 = s.getShiftId();
								btnShiftTime6_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 6, shiftId6_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime6_2.setVisible(true);
								btnShiftTime6_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId6_2 = s.getShiftId();
								btnShiftTime6_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 6, shiftId6_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Ambassade":
							if(btnShiftTime7_1.getText().isEmpty()) {
								btnShiftTime7_1.setVisible(true);
								btnShiftTime7_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId7_1 = s.getShiftId();
								btnShiftTime7_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 7, shiftId7_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime7_2.setVisible(true);
								btnShiftTime7_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId7_2 = s.getShiftId();
								btnShiftTime7_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 7, shiftId7_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Flamingo":
							if(btnShiftTime8_1.getText().isEmpty()) {
								btnShiftTime8_1.setVisible(true);
								btnShiftTime8_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId8_1 = s.getShiftId();
								btnShiftTime8_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 8, shiftId8_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime8_2.setVisible(true);
								btnShiftTime8_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId8_2 = s.getShiftId();
								btnShiftTime8_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 8, shiftId8_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
						case "Club Wolf":
							if(btnShiftTime9_1.getText().isEmpty()) {
								btnShiftTime9_1.setVisible(true);
								btnShiftTime9_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId9_1 = s.getShiftId();
								btnShiftTime9_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 9, shiftId9_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime9_2.setVisible(true);
								btnShiftTime9_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId9_2 = s.getShiftId();
								btnShiftTime9_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 9, shiftId9_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Under buret":
							if(btnShiftTime10_1.getText().isEmpty()) {
								btnShiftTime10_1.setVisible(true);
								btnShiftTime10_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId10_1 = s.getShiftId();
								btnShiftTime10_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 10, shiftId10_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime10_2.setVisible(true);
								btnShiftTime10_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId10_2 = s.getShiftId();
								btnShiftTime10_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 10, shiftId10_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Proud Mary":
							if(btnShiftTime11_1.getText().isEmpty()) {
								btnShiftTime11_1.setVisible(true);
								btnShiftTime11_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId11_1 = s.getShiftId();
								btnShiftTime11_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 11, shiftId11_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime11_2.setVisible(true);
								btnShiftTime11_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId11_2 = s.getShiftId();
								btnShiftTime11_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 11, shiftId11_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;
						case "Karaoke Bar":
							if(btnShiftTime12_1.getText().isEmpty()) {
								btnShiftTime12_1.setVisible(true);
								btnShiftTime12_1.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId12_1 = s.getShiftId();
								btnShiftTime12_1.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 12, shiftId12_1);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							else {
								btnShiftTime12_2.setVisible(true);
								btnShiftTime12_2.setText(s.getCheckInTime() + " - " + s.getCheckOutTime());
								shiftId12_2 = s.getShiftId();
								btnShiftTime12_2.addActionListener(e -> {
								try {
									displayGetAvailableDoorman(currentDate, 12, shiftId12_2);
								} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
										| UnsupportedLookAndFeelException | SQLException | DataAccessException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}});
							}
							break;				
					}
				});
									
	}
	
	private void displayGetAvailableDoorman(LocalDate currentDate, int barId, int shiftId) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, SQLException, DataAccessException {
		GetAvailableDoorman gad = new GetAvailableDoorman(currentDate, barId, shiftId);
		gad.setVisible(true);
		gad.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
	}
	
	private void setUIStyle() {
		//https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/nimbus.html
				//Nimbus uses Java 2D vector graphics to draw the user interface (UI), rather than static bitmaps, so the UI can be crisply rendered at any resolution
				try {
		            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		                if ("Nimbus".equals(info.getName())) {
		                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		                    break;
		                }
		            }
		        } catch (ClassNotFoundException ex) {
		            java.util.logging.Logger.getLogger(MainCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(MainCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(MainCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(MainCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
	}
}
