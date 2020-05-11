import java.util.Random;

public class EmpWageAttendance
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int EMP_RATE_PER_HRS=20;
		int NUM_WORK_DAYS=20;
		int totalSalary=0;
		int salary=0;
		int EMP_HRS = 0;
		for(int day =1;day<=NUM_WORK_DAYS;day++)
		{	
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
			salary=(EMP_RATE_PER_HRS*EMP_HRS);	
			totalSalary=(totalSalary+salary);
		}
		System.out.println(totalSalary);
	}
}

