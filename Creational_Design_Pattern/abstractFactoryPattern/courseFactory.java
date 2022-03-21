public class courseFactory extends factoryConstruction{
   public course getCourse(String courseName){
      if(courseName.equalsIgnoreCase("Math")){
         return new Math();
      }
      else if(courseName.equalsIgnoreCase("DataStructure")){
         return new DataStructure();
      }
      else if(courseName.equalsIgnoreCase("ScientificComputing")){
         return new ScientificComputing();
      }
      else{
         System.out.println("Invalid course");
         return null;
      }
   }
   public programming getProgramming(String language){
      return null;
   }
}
