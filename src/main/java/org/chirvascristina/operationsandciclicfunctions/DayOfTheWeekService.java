package org.chirvascristina.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "Sunday";
        System.out.println(dayName.toUpperCase());

        switch (dayName.toUpperCase()){
            case "Monday":
                dayNumber = 1;
                break;
            case "Tuesday":
                dayNumber = 2;
                break;
            case "Wednesday":
                dayNumber = 3;
                break;
            case "Thursday":
                dayNumber = 4;
                break;
            case "Friday":
                dayNumber = 5;
                break;
            case "Saturday":
                dayNumber = 6;
                break;
            case "Sunday":
                dayNumber = 7;
                break;
            default:
                dayNumber = 0;
                System.out.println("Ai introdus o zi");
        }
        System.out.println("Numarul zilei " + dayNumber + " este " + dayNumber);
    }
}
