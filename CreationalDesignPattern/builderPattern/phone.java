
public class phone {
   public String name;
   public String release;
   public String os;
   public String processor;
   public String ram;
   public int price;
   public phone(String name, String release, String os, String processor, String ram, int price) {
      this.name = name;
      this.release = release;
      this.os = os;
      this.processor = processor;
      this.ram = ram;
      this.price = price;
   }
   public void printSpesification(){
      System.out.println("Name: " + name);
      System.out.println("Release: " + release);
      System.out.println("OS: " + os);
      System.out.println("Processor: " + processor);
      System.out.println("RAM: " + ram);
      System.out.println("Price: " + price);
   }
   public static class phoneBuilder {
      private String name;
      private String release;
      private String os;
      private String processor;
      private String ram;
      private int price;

      public phoneBuilder setName(String name) {
         this.name = name;
         return this;
      }
      public phoneBuilder setRelease(String release) {
         this.release = release;
         return this;
      }
      public phoneBuilder setOs(String os) {
         this.os = os;
         return this;
      }
      public phoneBuilder setProcessor(String processor) {
         this.processor = processor;
         return this;
      }
      public phoneBuilder setRam(String ram) {
         this.ram = ram;
         return this;
      }
      public phoneBuilder setPrice(int price) {
         this.price = price;
         return this;
      }
      public phone build(){
         return new phone(name, release, os, processor, ram, price);
      }
   }
}
