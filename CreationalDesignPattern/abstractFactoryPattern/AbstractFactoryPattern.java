
public class abstractFactoryPattern {

   public abstractFactoryPattern(){
      programmingFactory programmingLanguage = new programmingFactory();
      programmingLanguage.getProgramming("PHP").getProgrammingLanguage();
      programmingLanguage.getProgramming("Python").getProgrammingLanguage();
      courseFactory course = new courseFactory();
      course.getCourse("Math").getCourse();
      course.getCourse("DataStructure").getCourse();
      // course.getCourse("DataStructure").getCourse();
      }



































   public static void main(String[] args){
      new abstractFactoryPattern();

   }
//end main
}

