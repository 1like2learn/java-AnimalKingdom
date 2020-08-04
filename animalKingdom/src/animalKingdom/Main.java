package animalKingdom;

import java.util.ArrayList;
import java.util.List;
public class Main{

  public static List<Animal> animals = new ArrayList<>();

  public static void makeAnimals(){
    //Mammals
    Mammal panda = new Mammal("Panda", 1869);
    animals.add(panda);
    Mammal zebra = new Mammal("Zebra", 1778);
    animals.add(zebra);
    Mammal koala = new Mammal("Koala", 1816);
    animals.add(koala);
    Mammal sloth = new Mammal("Sloth", 1804);
    animals.add(sloth);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    animals.add(armadillo);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    animals.add(raccoon);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);
    animals.add(bigfoot);

    //Birds
    Bird pigeon = new Bird("Pigeon", 1837);
    animals.add(pigeon);
    Bird peacock = new Bird("Peacock", 1821);
    animals.add(peacock);
    Bird toucan = new Bird("Toucan", 1758);
    animals.add(toucan);
    Bird parrot = new Bird("Parrot", 1824);
    animals.add(parrot);
    Bird swan = new Bird("Swan", 1758);
    animals.add(swan);

    //Fish
    Fish salmon = new Fish("Salmon", 1758);
    animals.add(salmon);
    Fish catfish = new Fish("Catfish", 1817);
    animals.add(catfish);
    Fish perch = new Fish("Perch", 1758);
    animals.add(perch);
  }

  public static void sortAnimalsYear(){
    //getYearDiscovered()
    animals.sort((item1, item2) -> item2.getYearDiscovered() - item1.getYearDiscovered());
    System.out.println(animals);
  }

  public static void sortAnimalsAlphabetically(){
    animals.sort((item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));
    System.out.println(animals);
  }

  public static void sortAnimalsByMove(){
    animals.sort((item1, item2) -> item1.move().compareToIgnoreCase(item2.move()));
    System.out.println(animals);
  }

  public static List<Animal> filteredList = new ArrayList<>();

  public static void sortAnimals(List<Animal> animals, CheckAnimal tester, boolean printBool){
    filteredList.clear();

    for (Animal eachAnimal: animals){//for every item in the Animal arrayList
      if (tester.test(eachAnimal)){//if the test parameter returns true
        if (printBool){//print if the printBool param is true
          System.out.println(eachAnimal.getName() + " " + eachAnimal.reproduce() + " " + eachAnimal.move() + " " + eachAnimal.breath() + " " + eachAnimal.getYearDiscovered());
        }
      }
    }
  }

  public static void main(String[] args){
    makeAnimals();// construct the animals

    System.out.println("\n---- Sorted by Year ----");
    sortAnimalsYear();

    System.out.println("\n---- Sorted Alphabetically ----");
    sortAnimalsAlphabetically();

    System.out.println("\n---- Sorted by Movement ----");
    sortAnimalsByMove();

    System.out.println("\n---- Animals With Lungs ----");
    sortAnimals(animals, each -> each.breath() == "lungs", true);

    System.out.println("\n---- Animals With Lungs and From 1758 ----");
    sortAnimals(animals, each -> (each.breath() == "lungs" && each.getYearDiscovered() == 1758), true);

    System.out.println("\n---- Animals With Eggs and Lungs ----");
    sortAnimals(animals, each -> (each.reproduce() == "eggs" && each.breath() == "lungs"), true);

    System.out.println("\n---- Animals from 1758  ----");
    animals.sort((item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));
    sortAnimals(animals, each -> each.getYearDiscovered() == 1758, true);

    System.out.println("\n---- Stretch Goal ----");
    sortAnimals(animals, each -> each instanceof Mammal, true);
    
  }
}