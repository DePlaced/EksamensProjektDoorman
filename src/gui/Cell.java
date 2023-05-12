package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Cell extends JButton {
	
	
	private LocalDate date;
	private boolean title;
	private boolean isToday;
	
	// Constructor
	public Cell () {
		setContentAreaFilled(false);
		setBorder(null);
		setHorizontalAlignment(JLabel.CENTER);
	}
	
	
	public void asTitle() {
		title = true;
	}
	
	public boolean isTitle() {
		return title;
	}
	
	// Method to set the foreground color based on whether the cell represents the current month
	public void currentMonth(boolean act) {
		if(act) {
			setForeground(new Color(68,68,68));
			
		}else {
			setForeground(new Color(169, 169, 169));
		}
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	public void setAsToday() {
        isToday = true;
        setForeground(Color.WHITE);
    }
	
	  @Override
	    protected void paintComponent(Graphics grphcs) {
	        if (title) {
	     // If the cell is a title cell, draw a line at the bottom
	            grphcs.setColor(new Color(213, 213, 213));
	            grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
	        }
	     // If the cell represents today, draw a rounded rectangle with a specific color
	        if (isToday) {
	            Graphics2D g2 = (Graphics2D) grphcs;
	            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //Anti-aliasing is a technique used to smooth the jagged edges of shapes and lines, resulting in a more visually appealing appearance.
	            g2.setColor(new Color(97, 49, 237));
	            int x = getWidth() / 2 - 17;
	            int y = getHeight() / 2 - 17;
	            g2.fillRoundRect(x, y, 35, 35, 100, 100);
	        }
	        super.paintComponent(grphcs);
	    }
}
