package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.*;


public class CoffeeClient {

    public static void main(String[] args) {

        System.out.println("*******");
        CoffeeTemplate coffeeType = new CapuccinoCoffee();
        System.out.println("Capuccino");
        coffeeType.prepareCoffee();

        System.out.println("********************");
        coffeeType = new MochaCoffee();
        System.out.println("Mocha");
        coffeeType.prepareCoffee();

        System.out.println("*********");
        coffeeType = new AmericanoCoffee();
        System.out.println("Americano");
        coffeeType.prepareCoffee();


        System.out.println("Done making your coffee");
    }

}
