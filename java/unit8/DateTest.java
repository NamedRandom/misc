import java.util.Scanner;

public class DateTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date1 (mm dd yyyy) ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();

        Date date1 = new Date(year,month,day);
        System.out.println("The month is "+date1.getMonth());
        System.out.println("The day is "+date1.getDay());
        System.out.println("The year is "+date1.getYear());
        System.out.println("There are "+date1.daysInMonth()+" days in month "+date1.getMonth());
        date1.addDays(1);
        System.out.println("Adding one day is "+date1);
        if(date1.isLeapYear()) System.out.println(""+date1.getYear()+" is a leap year");
        else System.out.println(""+date1.getYear()+" is not a leap year");
        date1.addWeeks(1);
        System.out.println("Adding one week is "+date1);

        System.out.print("Enter date2 (mm dd yyyy) ");
        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();
        Date date2 = new Date(year,month,day);

        System.out.print("Enter date3 (mm dd yyyy) ");
        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();
        Date date3 = new Date(year,month,day);
        date3.addDays(1);
        System.out.println("Adding one day is "+date3);

        System.out.println("date2 equals date3: "+date2.equals(date3));
        System.out.println("date1 equals date2: "+date1.equals(date2));

    }
}
