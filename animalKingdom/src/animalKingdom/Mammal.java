package animalKingdom;

public class Mammal extends Animal{

  public Mammal(String name, int yearDiscovered){
    super(name, yearDiscovered);
  }

  //declare methods
  @Override
  public String move(){
    return "walk";
  }
  @Override
  public String breath(){
    return "lungs";
  }
  @Override
  public String reproduce(){
    return "live births";
  }
}