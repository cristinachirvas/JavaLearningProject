package org.chirvascristina.classesandobjects;

import org.chirvascristina.classesandobjects.autoservicetask.Car;
import org.chirvascristina.classesandobjects.autoservicetask.Garage;
import org.chirvascristina.classesandobjects.autoservicetask.Person;
import org.chirvascristina.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {

    public static void main(String[] args) {
<<<<<<< HEAD
        Garage autoDocGarage;
        autoDocGarage = new Garage();
=======
       Garage autoDocGarage = new Garage();
>>>>>>> 383f3e5 (Add homework TA_2_AutoService with Deonis suggesstions)
        autoDocGarage.address = "Stefan cel Mare, Ihub 64";
        autoDocGarage.surfaceM2 = 450.0F;
        autoDocGarage.capacity = 50;
        System.out.println("Obiectul autoDocGarage are urmatoarele proprietati" + autoDocGarage.address
                + " " + autoDocGarage.surfaceM2 + "  " + autoDocGarage.capacity);
<<<<<<< HEAD
        Garage garajIaloveni = new Garage();
        System.out.println("Obiectul garajIaloveni are urmatoarele proprietati" + garajIaloveni.address
=======

        Garage garajIaloveni = new Garage();
     garajIaloveni.address = "Nicolae Testemitanu, 14";
     garajIaloveni.surfaceM2 = 300.50F;
     garajIaloveni.capacity = 100;
        System.out.println("Obiectul garajIaloveni are urmatoarele proprietati " + garajIaloveni.address
>>>>>>> 383f3e5 (Add homework TA_2_AutoService with Deonis suggesstions)
                + " " + garajIaloveni.surfaceM2 + "  " + garajIaloveni.capacity);


        Worker vasile = new Worker();
        vasile.name = "Vasile";
        vasile.age = 54;
        System.out.println("Obiectul nostru are numele de" + vasile.name + "si are " + vasile.age + "ani");

<<<<<<< HEAD
//        Person client1 = new.Person();
//        client1.phoneNumber = "+37589741";
=======
        Person client1 = new Person();
        client1.phoneNumber = "+37589741";
>>>>>>> 383f3e5 (Add homework TA_2_AutoService with Deonis suggesstions)

        Tool ciocan = new Tool( "Ciocan");
        Tool surubelnita = new Tool();

        Car mercedesBenzSeriaE = new Car("E class", "Mercedes", "Green");
        Car vwPolo = new Car("HTE 455");
        Car volvo = new Car("BOS 356", "XC90");
    }
}
