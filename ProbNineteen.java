import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProbNineteen{
	public static void main(String []args){
		GregorianCalendar start = new GregorianCalendar(1901,0,1);
		GregorianCalendar end = new GregorianCalendar(2000,11,31);
		int count = 0;
		while(start.compareTo(end)<=0){
			if(start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) count++;
			start.add(Calendar.MONTH,1);
		}
		System.out.println(count);
		
		
	}

}