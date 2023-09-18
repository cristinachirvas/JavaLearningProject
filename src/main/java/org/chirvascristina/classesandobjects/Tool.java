package org.chirvascristina.classesandobjects;

public class Tool {
    double price;
    String name;
    double weight;

    public Tool(String name){
        this.name = name;
        System.out.println("Un obiect nou de tip tool a fost creat, numele lui este: " + this.name);
    }

    public Tool(){
        System.out.println("O noua unelta a fost creata in cadrul programului. Nu dispunem despre detaliile ei" + "pentru detalii, numele:" + this.name + "greutatea este: " + this.weight);
    }
}
