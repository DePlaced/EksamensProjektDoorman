package model;

public class Doorman extends Employee {
	private double hourlyRate;

    public Doorman(int employeeId, String f_name, String l_name, String phone, String email, String addressId, String passcode, double hourlyRate) {
    	super(employeeId, f_name, l_name, phone, email, addressId, passcode);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

