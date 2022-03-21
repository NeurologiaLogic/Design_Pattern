public class phoneBuilder {
   public static class build{
      private String name;
      private String release;
      private String os;
      private String processor;
      private String ram;
      private int price;

      public build setName(String name) {
         this.name = name;
         return this;
      }
      public build setRelease(String release) {
         this.release = release;
         return this;
      }
      public build setOs(String os) {
         this.os = os;
         return this;
      }
      public build setProcessor(String processor) {
         this.processor = processor;
         return this;
      }
      public build setRam(String ram) {
         this.ram = ram;
         return this;
      }
      public build setPrice(int price) {
         this.price = price;
         return this;
      }
      public phone buildModel(){
         return new phone(name, release, os, processor, ram, price);
      }

   }
}
