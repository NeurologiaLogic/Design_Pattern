
public class people {
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
      return telephone;
   }
   public void setTelephoneNumber(int telephone) {
      this.telephone = telephone;
   }
   private String name;
   private int age;
   private int telephone;
   public people(String name,int age,int telephone){
      this.name = name;
      this.age = age;
      this.telephone = telephone;
   }
}


