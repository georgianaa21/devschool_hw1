package minutes;

public class MinutesToYears {
    public void printYearsAndDays(long minutes){
        long days = minutes / (60*24);
        long years = days / 365;
        days = days % 365;
        System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
    }
}
