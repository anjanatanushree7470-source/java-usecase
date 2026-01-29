package Tanushree;
enum Day
{
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumArray
{
public static void main(String[] args) {
 
Day[] allDays=Day.values();
 
System.out.println("All Days of the Week:");
for(Day d: allDays)
{
	System.out.println(d);
	Day[] WorkingDays=new Day[6];
	WorkingDays[0]= Day.MONDAY;
	System.out.println(WorkingDays[0]);
	WorkingDays[1]= Day.TUESDAY;
	System.out.println(WorkingDays[1]);
	WorkingDays[2]= Day.WEDNESDAY;
	System.out.println(WorkingDays[2]);
	WorkingDays[3]= Day.THURSDAY;
	System.out.println(WorkingDays[3]);
	WorkingDays[4]= Day.FRIDAY;
	System.out.println(WorkingDays[4]);
	WorkingDays[5]= Day.SATURDAY;
	System.out.println(WorkingDays[5]);
	WorkingDays[6]= Day.SUNDAY;
	System.out.println(WorkingDays[6]);
}
	
	
	
	}
 
}

