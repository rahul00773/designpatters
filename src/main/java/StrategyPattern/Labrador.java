package StrategyPattern;

public class Labrador extends Dog {

    public Labrador(){

        barkBehaviour = new PlayFullBark();
        eatBehaviour = new NormalDiet();



    }

    public void display(){

        System.out.println("I am playful Labrador");
    }
}
