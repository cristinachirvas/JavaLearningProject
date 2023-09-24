package org.chirvascristina.operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a =10;
        int b = 5;

        //Equal with
        boolean isEqual = a == b;
        System.out.println("Equal with: " + isEqual);

        //Different from
        boolean isNotEqual = a != b;
        System.out.println("Different from: " + isNotEqual);

        //Bigger than
        boolean isGreaterThan = a > b;
        System.out.println("Bigger than: " + isGreaterThan);

        //Smaller than
        boolean isLessThan = a < b;
        System.out.println("Smaller than: " + isLessThan);

        //Greater than or equal to
        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Greater than or equal to: " + isGreaterThanOrEqual);

        //Less than or equal to
        boolean isLessThanOrEqual = a >= b;
        System.out.println("Less than or equal to: " + isLessThanOrEqual);
    }
}
