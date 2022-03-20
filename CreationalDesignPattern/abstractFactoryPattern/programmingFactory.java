public class programmingFactory extends factoryConstruction{
   public programming getProgramming(String programming){
      if(programming.equalsIgnoreCase("PHP")){
         return (programming) new PHP();
      }
      else if(programming.equalsIgnoreCase("Python")){
         return (programming) new Python();
      }
      else{
         System.out.println("Invalid programmingLanguage");
         return null;
      }
   }
   public course getCourse(String color){
      return null;
   }
}
