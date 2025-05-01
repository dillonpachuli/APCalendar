public class Main{
    public static void main(String[] args){
        APCalendar a = new APCalendar();
        System.out.println(a.numberOfLeapYears(1583, 2025));
        System.out.println(a.dayOfWeek(1, 5, 2019));
        System.out.println(a.dayOfWeek(1, 10, 2019));
    }
}