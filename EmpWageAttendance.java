import java.util.Random;

public class EmpWageAttendance {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmpWageAttendance(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	private void computeEmpWage() {
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
		Random rand = new Random();
		while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		{
			int empCheck=rand.nextInt(3);
			totalWorkingDays++;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs=8;
				break;
			case IS_PART_TIME:
				empHrs=4;
				break;
			default:
				empHrs=0;	
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}
	
	@Override
	public String toString() {
		return "Total Emp Wage for company: " +company+ " is: " + totalEmpWage;
	}

	public static void main(String[] args) {
		EmpWageAttendance DMart = new EmpWageAttendance("DMart",10,8,10);
		EmpWageAttendance Reliance = new EmpWageAttendance("Reliance",20,6,30);
		DMart.computeEmpWage();
		System.out.println(DMart);
		Reliance.computeEmpWage();
		System.out.println(Reliance);
	}

}

