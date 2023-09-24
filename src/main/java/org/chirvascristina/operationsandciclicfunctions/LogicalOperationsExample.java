package org.chirvascristina.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("Logic and: " + result);

//        a = true
        a = result && b;
        System.out.println("Logic and: " + a);

        result = a || b;
        System.out.println("Logic or: " + result);

        System.out.println("Neagtion: " + !!!result);
    }
}
