public class createObject {

   //private so it's can't be initialize by others
   private createObject(){}

   //create a static object
   private static createObject _instance = new createObject();

   //the only accessible method
   public static createObject getInstance(){return _instance;}

   //test to see if methods works
   public void checkObject(){
      System.out.println("Object has been created");
   }
}
