package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        /*
        kullanicinin vermis oldugu gun isimlerine bakarak haftasonu veya haftaici olduguna karar
        veren kodu yaziniz
        Monday==>>week Day    Saturda===>> Weekend Day
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName = input.next();

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");

        if (isWeekendDay) {
            System.out.println("Weekend Day");
        } else if (isWeekDay) {
            System.out.println("Week day");
        } else {
            System.out.println("Invalid day name..");
        }

    }
}
