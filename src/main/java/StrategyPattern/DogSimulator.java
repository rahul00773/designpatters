package StrategyPattern;

public class DogSimulator {

    public static void main(String[] args) {
        Dog lab = new Labrador();

      lab.setBarkBehavior(new PlayFullBark());
      lab.doBark();
      lab.setEatBehavior(new ProtienDiet());
      lab.doEat();
    }
}