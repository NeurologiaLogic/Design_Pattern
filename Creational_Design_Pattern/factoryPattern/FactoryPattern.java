
public class factoryPattern{

   public factoryPattern(){
      AnimalTypesFactory animal = new AnimalTypesFactory();
      animal.getAnimal("Bear").makeSound();
      // animal.makeSound();
   }



































   public static void main(String[] args){
      new factoryPattern();

   }
//end main
}

