package org.chirvascristina.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        //Atribuire simpla
        int result = a;
        System.out.println("Atribuire simpla: " + result);

        //Atribuire cu adunare
        result += b;
        System.out.println("Atribuire cu adunare1: " + result);

        result = result + b;
        System.out.println("Atribuire cu adunare2: " + result);

        //Atribuire cu scadere
        result -= b;
        System.out.println("Atribuire cu scadere1: " + result);

        result = result - b;
        System.out.println("Atribuire cu scadere2: " + result);

        //Atribuire cu inmultire
        result *= b;
        System.out.println("Atribuire cu inmultire1: " + result);

        result = result * b;
        System.out.println("Atribuire cu inmultire2: " + result);


        //Atribuire cu impartire
        result /= b;
        System.out.println("Atribuire cu impartire1: " + result);

        result = result / b;
        System.out.println("Atribuire cu impartire2: " + result);


        //Atribuire cu restul impartirii
        result %= b;
        System.out.println("Atribuire cu restul impartirii1: " + result);

        result = result % b;
        System.out.println("Atribuire cu restul impartirii2: " + result);

    }
}
