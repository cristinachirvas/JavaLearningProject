package org.chirvascristina.methodstask;

public class ExecutionService  {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(150, 350);
        System.out.println("The variable randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(50);
        System.out.println("The variable randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("The variable randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("The variable randomDouble1: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random email1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random email2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random valid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(256));
        System.out.println("Random valid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(257));
        System.out.println("Random valid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(5));


        Customer cristiCustomer = new Customer("Chirvas Cristina", 35, "Cristi.Boss@gmail.com");

        System.out.println("Nume obiect Cristi: " + cristiCustomer.getName());
        System.out.println("Age obiect Cristi: " + cristiCustomer.getAge());
        System.out.println("Email obiect Cristi: " + cristiCustomer.getEmail());

        cristiCustomer.setName("Cristina Boss");
        cristiCustomer.setAge(35);
        cristiCustomer.setEmail("CristinaBoss@hmail.com");

        System.out.println("Nume obiect Cristi: " + cristiCustomer.getName());
        System.out.println("Age obiect Cristi: " + cristiCustomer.getAge());
        System.out.println("Email obiect Cristi: " + cristiCustomer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12), DataGeneratorUtil.getRandomInt(127),
                DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18,64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());



    }
}
