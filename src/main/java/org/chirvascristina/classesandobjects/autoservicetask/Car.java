package org.chirvascristina.classesandobjects.autoservicetask;

public class Car {
    public String plateNumber;
    public String vinCode;
    public String mark;
    public String model;
    public String color;


    public Car(String markParamDeIntrare, String modelFormalParameter, String colorLocalVariabile) {
       this.mark =  markParamDeIntrare;
       this.model = modelFormalParameter;
       this.color = colorLocalVariabile;
    }


    public Car(String plateNumber){
        this.plateNumber = plateNumber;
    }
    public Car(String vinCode, String mark){
        this.vinCode = vinCode;
        this.mark = mark;

    }
}

