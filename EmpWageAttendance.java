import java.util.Random;

public class EmpWageAttendance 
{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	public static int computeEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth) {
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
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage:" + totalEmpWage);
		return totalEmpWage;
	}
	
	public static void main(String[] args) 
	{
		computeEmpWage("Presensesoft",30,8,40);
		computeEmpWage("BridgeLabz",40,10,30);

	}

}

