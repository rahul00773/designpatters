package StrategyPattern;

public abstract class Dog {

    EatBehaviour eatBehaviour;
    BarkBehaviour barkBehaviour;


    public void setEatBehavior(EatBehaviour eb){
        eatBehaviour = eb;

    }public void setBarkBehavior(BarkBehaviour bb){
        barkBehaviour = bb;
    }



    public Dog(){

    }

    public void doBark(){

        barkBehaviour.bark();
    }

    public void doEat(){

        eatBehaviour.eat();
    }
}
