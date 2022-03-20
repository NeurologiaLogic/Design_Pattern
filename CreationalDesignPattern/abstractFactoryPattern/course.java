public abstract class course {
   //abstract makes it that you have to defined the method it self
   abstract void getCourse();
}
class Math extends course{
   void getCourse(){
      System.out.println("Math");
   }
}
class DataStructure extends course{
   void getCourse(){
      System.out.println("DataStructure");
   }
}
class ScientificComputing extends course{
   void getCourse(){
      System.out.println("ScientificComputing");
   }
}