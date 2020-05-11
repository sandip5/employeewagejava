import java.util.Random;

public class EmpWageAttendance
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2; 
		int EMP_RATE_PER_HRS = 20;
		int MAX_HRS_MONTH = 100;
		int NUM_WORK_DAYS = 20;
		
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		int EMP_HRS=0;
		int totalSalary=0;
		
		while(totalEmpHrs < MAX_HRS_MONTH && totalWorkingDays < NUM_WORK_DAYS)
		{
			totalWorkingDays++;
			int empCheck=rand.nextInt(3);
			switch (empCheck) {
			case 1:
				EMP_HRS=8;
				break;
			case 2:
				EMP_HRS=4;
				break;
			default:
				EMP_HRS=0;	
			}
			totalEmpHrs=totalEmpHrs+EMP_HRS;
		}	
		totalSalary=totalEmpHrs*EMP_RATE_PER_HRS;
		System.out.println(totalSalary);
	}
}

