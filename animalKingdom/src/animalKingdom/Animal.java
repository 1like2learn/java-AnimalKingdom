package animalKingdom;

abstract class Animal{

  //variables that Animal subclasses
  static int maxId = 0;
  protected int id;
  protected String name;
  protected int yearDiscovered;
  protected int food = 10;

  public Animal(String name, int yearDiscovered){
    maxId++;

    this.id = maxId;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }

  //methods that Animal subclasses will need. these will be available to all animals
  public void eat(int foodEaten){
    food = food + foodEaten;
  }
  abstract String move();//"abstract" allows us to add behavior specific to the subclasses
  abstract String breath();
  abstract String reproduce();

  //getters let's us control how variables are obtained
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getYearDiscovered(){
    return yearDiscovered;
  }
  public int getFood(){
    return food;
  }

  //Setters let's us control how variables are changed
  public void setName(String name){
    this.name = name;
  }
  public void setYearDiscovered(int yearDiscovered){
    this.yearDiscovered = yearDiscovered;
  }

  //When the object is console logged, make the info displayed useful
  @Override
  public String toString(){
    return "id: " + id + " name: " + name + " yearNamed: " + yearDiscovered;
  }
}