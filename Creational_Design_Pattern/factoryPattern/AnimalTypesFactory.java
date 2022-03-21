
class Bear extends Animal{
      void makeSound(){
         System.out.println("Roar");
      }
}
class Dog extends Animal{
      void makeSound(){
         System.out.println("Woof");
      }
}
class Fish extends Animal{
      void makeSound(){
         System.out.println("Blub");
      }
}


public class AnimalTypesFactory{
      public Animal getAnimal(String animalName){
            if(animalName.equals("Bear")){
                  return new Bear();
            }
            else if(animalName.equals("Dog")){
                  return new Dog();
            }
            else if(animalName.equals("Fish")){
                  return new Fish();
            }
            else{
                  return null;
            }
      }
}