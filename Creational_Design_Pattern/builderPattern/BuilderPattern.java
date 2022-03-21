
class BuilderPattern{

   public BuilderPattern(){
      //direct built to the class phone
      phone p = new phone.phoneBuilder()
         .setName("iPhone X")
         .setRelease("11/11/2019")
         .setOs("iOS")
         .setProcessor("A11 Bionic")
         .setRam("4GB")
         .setPrice(70000)
         .build();
      p.printSpesification();

      //using other class to corelate the builder
      phone pModel = new phoneBuilder.build()
         .setName("iPhone X")
         .setRelease("11/11/2019")
         .setOs("iOS")
         .setProcessor("A11 Bionic")
         .setRam("4GB")
         .setPrice(70000)
         .buildModel();
      pModel.printSpesification();
   }



































   public static void main(String[] args){
      new BuilderPattern();

   }
//end main
}

