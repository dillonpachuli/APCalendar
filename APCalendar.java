public class APCalendar{
    private static boolean isLeapYear(int year){
        if (year % 100 == 0){
            if (year % 400 == 0) return true;
            return false;
        }
        else if (year % 4 == 0) return true;
        return false;
    }

    public static int numberOfLeapYears(int year1, int year2){
        int leapYears = 0;
        for (int i = year1; i <= year2; i++){
            if (isLeapYear(i)) leapYears++;
        }
        return leapYears;
    }

    private static int firstDayOfYear(int year){
        int day = 0; // january 1, 0001 was a sunday.
        for (int i = 1; i <= year; i++){
            day++;
            if (isLeapYear(i)) day++;
            if (day > 6) day = day - 7;
        }
        return day;
    }

    private static int dayOfYear(int month, int day, int year){
        int days = 0;
        for (int i = 1; i <= month; i++){
            if (i == month) days += day;
            else if (i == 2){
                if (isLeapYear(year)) days += 29;
                else days += 28;
            } 
            else if (i % 2 == 1) days += 31;
            else if (i % 2 == 0) days += 30;   
        }
        return days;
    }

    public static int dayOfWeek(int month, int day, int year){
        int days = dayOfYear(month, day, year) % 7;
        return firstDayOfYear(year) + days - 1;
    }
}