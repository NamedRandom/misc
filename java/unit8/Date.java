public class Date
{
             private int month;
             private int day;
             private int year;
             int[] thirtyDayMonths = new int[]{4,6,9,11};

             public Date(int yr, int mo, int d){
                 //Constructs a new Date object to represent the given date.
                 year=yr;
                 month=mo;
                 day=d;
             }
             public int getDay(){
                 //Returns this Date's day value; for example, for the date 2006/07/22, returns 22.
                 return day;
             }
             public int getMonth(){
                 //Returns this Date's month value; for example, for the date 2006/07/22, returns 7.
                 return month;
             }
             public int getYear(){
                 //Returns this Date's year value; for example, for the date 2006/07/22, returns 2006.
                 return year;
             }
             public String toString(){
                 //Returns a String representation of this Date in Year/Month/Day order, such as "2006/07/22".
                 return ""+year+"/"+month+"/"+day;
             }
             public void addDays(int days){
                 //Moves this Date object forward in time by the given number of days.
                 if(day+days>daysInMonth()){


                 }
                 else {
                     day+=days;
                 }
             }
             public void addWeeks(int weeks){
                 //Moves this Date object forward in time by the given number of 7-day weeks.
                 addDays(weeks*7);
             }
             public boolean equals(Date that){
                 //Returns whether two Date objects represent the same calendar date.
                 if(that.getDay()==day&&that.getMonth()==month&&that.getYear()==year) return true;
                 return false;
             }
             public int daysInMonth(){
                 //Returns the number of days in the month. Don't forget leap year
                 if(month==2){
                     if(isLeapYear()) return 29;
                     else return 28;
                 }
                 for(int i:thirtyDayMonths)
                     if(month==i) return 30;
                 return 31;
             }
             public boolean isLeapYear()
             {
                 if(year%400==0) return true;             // century years are special cases
                 else if (year%100==0) return false; // 1900 is not a leap year but 2000 is
                 else if (year%4==0) return true;
                 return false;
                                        
             }
}
