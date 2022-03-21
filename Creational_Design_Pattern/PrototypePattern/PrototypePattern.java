public class PrototypePattern {

   public PrototypePattern() {
      peopleCloneFactory cloneFactory = new peopleCloneFactory();
      cloneFactory.setName("Patrick");
      cloneFactory.setAge(18);
      cloneFactory.setTelephoneNumber(1824123);


      people p1 = cloneFactory.cloneModel();
      p1.setName("bryan");
      p1.setAge(12);
      System.out.printf("%s\n%s\n%s\n",p1.getName(),p1.getAge(),p1.getTelephoneNumber());

      System.out.println("----------------------------------------------------");
      people p2 = cloneFactory.cloneModel();
      p2.setName("richard");
      p1.setAge(20);
      System.out.printf("%s\n%s\n%s\n",p2.getName(),p2.getAge(),p2.getTelephoneNumber());
   }












   public static void main(String[] args) {

      new PrototypePattern();
   }
}
