public class EmpWageAttendance
{
        public static void main(String[] args)
        {
                int IS_PRESENT=1;
                int EMP_RATE_PER_HRS=20;
                int EMP_HRS=8;
                int salary=0;
                double empCheck=(int)(Math.random()*10)%2;
                if (empCheck == IS_PRESENT)
                {
                        salary=(EMP_RATE_PER_HRS*EMP_HRS);
                        System.out.println(salary);
                }
                else
                {
                	salary=0;
                	System.out.println(salary);
                }
        }
}

