public class DayMonth {
    public static void main(String[] args) {
        System.out.println("Days of the week:");
        printDaysOfWeek();
        System.out.println("Months of the year:");
        printMonthsOfYear();
    }

    public static void printDaysOfWeek() {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : daysOfWeek) {
            System.out.println(day);
        }
    }

    public static void printMonthsOfYear() {
        String[] monthsOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String month : monthsOfYear) {
            System.out.println(month);
        }
    }
}