package org.chirvascristina.accessmodifiers.peopleevidence;

public class Person {
    private String name;

    private String surname;

    private final long id;

    private String age;

    public String residence;

    public boolean isRetired;

    public Person(String name, String surname, long id){
        this.name = name;
        this.surname = surname;
        this.id = id;
        System.out.println("Un obiect de tip Person a fost creat folosind un constructor  cu 3 parametri formali");

    }
    public Person(String name, String surname, long id, String residence, boolean isRetired){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.residence = residence;
        this.isRetired = isRetired;
        System.out.println("Un obiect de tip Person a fost creat folosind un constructor  cu 5 parametri formali");
    }

}
