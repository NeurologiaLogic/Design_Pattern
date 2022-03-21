interface PrototypePeople {
   public people cloneModel();
}

public class peopleCloneFactory implements PrototypePeople{
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public int getTelephoneNumber() {
      return telephoneNumber;
   }
   public void setTelephoneNumber(int telephoneNumber) {
      this.telephoneNumber = telephoneNumber;
   }
   private String name="patrick";
   private int age=123;
   private int telephoneNumber=41242;


   public people cloneModel(){
      return new people(name,age,telephoneNumber);
   }
}
