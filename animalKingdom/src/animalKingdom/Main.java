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
    Bird peacock = new Bird("Peacock", 1837);
    animals.add(peacock);
    Bird toucan = new Bird("Toucan", 1837);
    animals.add(toucan);
    Bird parrot = new Bird("Parrot", 1837);
    animals.add(parrot);
    Bird swan = new Bird("Swan", 1837);
    animals.add(swan);

    //Fish
    Fish salmon = new Fish("Salmon", 1758);
    animals.add(salmon);
    Fish catfish = new Fish("Catfish", 1758);
    animals.add(catfish);
    Fish perch = new Fish("Perch", 1758);
    animals.add(perch);
  }

  public static void main(String[] args){
    makeAnimals();
  }
}