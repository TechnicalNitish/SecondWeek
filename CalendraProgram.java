import java.util.Scanner;
import Utility.*;
public class CalendraProgram {

	public static void main(String[] args) {
		
		UtilCalendraProgram  ob = new UtilCalendraProgram();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int y = sc.nextInt();
        System.out.print("Enter the month name (e.g. January) : ");
        String mname = sc.next();
        System.out.print("Enter the week day name (e.g. Sunday) of 1st day of "+mname+" : ");
        String wname = sc.next();
         
        int max = ob.findMaxDay(mname,y);
        int f = ob.findDayNo(wname);        
        ob.fillCalendar(max,f,mname,y);
			
	}

}
