package org.chirvascristina.accessmodifiers;

import org.chirvascristina.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person cristiPerson = new Person("Cristina", "Chirvas", 1234564789);
        cristiPerson.isRetired = false;
        if (cristiPerson.isRetired){
            System.out.println("Cristi este la pensie");
        } else {
            System.out.println("Cristi nu este la pensie");
        }

        Person agataPerson = new Person("Agata", "Popa", 1234789, "Chisinau", true);
        if (agataPerson.isRetired){
            System.out.println("Agata este la pensie");
        } else {
            System.out.println("Agata nu este la pensie");
        }

        Person lucaPerson = new Person("Luca", "Popa", 1234786, "Chisinau", false);
        if (lucaPerson.isRetired){
            System.out.println("Luca este la pensie");
        } else {
            System.out.println("Luca nu este la pensie");
        }

        Person anatoliePerson = new Person("Anatolie", "Popa", 1234785, "Chisinau", true);
        if (anatoliePerson.isRetired){
            System.out.println("Anatolie este la pensie");
        } else {
            System.out.println("Anatolie nu este la pensie");
        }

        Person adiPerson = new Person("Adi", "Popa", 1234782, "Chisinau", false);
        if (adiPerson.isRetired){
            System.out.println("Adi este la pensie");
        } else {
            System.out.println("Adi nu este la pensie");
        }
    }

}
