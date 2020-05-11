import java.util.Random;

public class EmpWageAttendance
{
        public static void main(String[] args)
        {
        	    Random rand = new Random();
                int IS_PART_TIME=1;
                int IS_FULL_TIME=2;
                int EMP_RATE_PER_HRS=20;
                int salary;
                int EMP_HRS;
                int empCheck=rand.nextInt(3);
                if (empCheck == IS_FULL_TIME)
                {
                                EMP_HRS=8;
                }
                else if(empCheck == IS_PART_TIME)
                {
                                EMP_HRS=4;
                }
                else
                {
                                EMP_HRS=0;
                }
        salary=(EMP_RATE_PER_HRS*EMP_HRS);
        System.out.println(salary);
        }
}

