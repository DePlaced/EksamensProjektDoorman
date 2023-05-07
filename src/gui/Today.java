package gui;

public class Today {
		private int day;
		private int month;
		private int year;
		
		public Today(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }
		
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		
		public boolean isToday(Today date) {
	        return day == date.getDay() && month == date.getMonth() && year == date.getYear();
	    }

}