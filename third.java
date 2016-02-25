import java.util.Scanner;
import java.util.Arrays;
class third
{
	String alarmclock(int day,boolean vacation)
	{
		if(day>=1 && day<=5)
		{
			return vacation ? "10:00" : "7:00";
		}
		else
			return vacation ? "off" : "10:00";
	}
/*	public boolean isAlarmRinging()
	{
		if(vacation==false)
		{
			isAlarmRinging=true;
		}
		return isAlarmRinging;
	}*/
	public static void main(String args[])
	{
		int i;
		//String day[]=new String[6];
		
		//Scanner sc=new Scanner(System.in);
		int sun=0,mon=1,tue=2,wed=3,thur=4,fri=5,sat=6;
		
		third td=new third();
		String res=td.alarmclock(mon,false);
		//td.isAlarmRinging();

		System.out.println(res);		
	}
}

