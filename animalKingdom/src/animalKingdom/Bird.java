package animalKingdom;

public class Bird extends Animal{
  public Bird(String name, int yearDiscovered){
    //add arguments to Animal constructor function
    // Animal(String name, int yearDiscovered)
    super(name, yearDiscovered);
  }

  //Implement methods in Animal
  @Override 
  public String move(){
    return "fly";
  }
  @Override
  public String breath(){
    return "lungs";
  }
  @Override
  public String reproduce(){
    return "eggs";
  }
}