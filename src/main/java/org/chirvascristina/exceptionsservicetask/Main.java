package org.chirvascristina.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
        String textDeControl = null;


        TextManager.getTheTextLengthWithTryCatchFinally(null);
        System.out.println("Result from main class 1: " + TextManager.getTheTextLengthWithTryCatchFinally(null));

        ArithmeticOperationService.divideIntNoExceptionHandling(14, 2);
        System.out.println("Result from main class 2: " + ArithmeticOperationService.divideIntNoExceptionHandling(14, 2));




    }
}
