/*1. Change the calendar printing program so it starts the week on a Sunday.
        Also make it print a newline at the end (but only one).
        */
import java.time.DayOfWeek;
import java.time.LocalDate;

public class No1 {
    public static void main(String[] args) {
        final int month = 9;
        LocalDate date = LocalDate.of(2017, month, 1);
        int weekOffset = date.getDayOfWeek().ordinal()+1 - DayOfWeek.MONDAY.ordinal(); //добавили +1
        String firstLineOffset = new String(new char[weekOffset]).replace("\0", "    ");
        System.out.print(firstLineOffset);
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {//поменяли на субботу
                System.out.println();
            }
            date = date.plusDays(1);
        }
       System.out.println();//добавили новую строку в конце одну Also make it print a newline at the end (but only one).
    }
}
