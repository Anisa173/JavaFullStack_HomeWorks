package administrim.Kompania;

public class Punonjesi {
	private int employeeID;
	private String employeeName;
	private int employeeMonths;
	private double employeeSalary;

	public Punonjesi() {
		employeeID = 10123;
		employeeName = "Anisa Çela";
		employeeMonths = 25;
		employeeSalary = 6500.00;
	}

	public Punonjesi(int employeeID, String employeeName, int employeeMonths, double employeeSalary) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeMonths = employeeMonths;
		this.employeeSalary = employeeSalary;

	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeMonths(int employeeMonths) {
		this.employeeMonths = employeeMonths;
	}

	public int getEmployeeMonths() {
		return employeeMonths;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}




}