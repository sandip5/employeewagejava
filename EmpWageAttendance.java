public class EmpWageAttendance {
	public static void main(String[] args){
	int IS_PRESENT=1;
	double empCheck=(int)(Math.random()*10)%2;
	if (empCheck == IS_PRESENT)
		System.out.println("Employee is present");
	else
		System.out.println("Employee is absent");	
	}
}

