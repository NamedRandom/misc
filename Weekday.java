public class Weekday {
  public static void main(String[] args) {
    int year=2018;
    int month=9;
    int day=28;
    int yearAnswer=year-((14-month)/12);
    int x=yearAnswer+(yearAnswer/4)-(yearAnswer/100)+(yearAnswer/400);
    int monthAnswer=month+(12*((14-month)/12)-2);
    int dayAnswer=day+x+((31*monthAnswer)/12);
    System.out.println(month+"/"+day+"/"+year);
    System.out.println("0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday");
    System.out.println(dayAnswer%7);
  }
}
