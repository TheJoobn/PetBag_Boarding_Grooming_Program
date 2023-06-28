//*TURN IN FILE 10/2/22* 11pm

//This is a class for monkey details and information.

// This class inherits from the RescueAnimal.java class
public class Monkey extends RescueAnimal {

	
// The Instance variables for monkey info.
   public int bodyLength;
   public int tailLength;
   public int height;
   public String species;

  
  // These are the constructors.
   public Monkey(String name, String gender, String age, String weight, String acquisitionDate,
      String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
      int bodyLength, int tailLength, int height, String species) {
	  
	  //calls from superclass methods and constructor  //FIXME wont work until RescueAnimal is defined
      super(name, "monkey", gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
      
      this.bodyLength = bodyLength;
      this.tailLength = tailLength;
      this.height = height;
      this.species = species;
   }

//------------------------------------------------------------------------------------------------------------------------------------------
// These are the accessor methods.
   
   public int getBodyLength() {
      return bodyLength;
   }

   public int getTailLength() {
      return tailLength;
   }

   public int getHeight() {
      return height;
   }

   public String getSpecies() {
      return species;
   }

//------------------------------------------------------------------------------------------------------------------------------------------  
// These are the mutator methods.
   
   public void setBodyLength(int bodyLength) {
      this.bodyLength = bodyLength;
   }

   public void setTailLength(int tailLength) {
      this.tailLength = tailLength;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public void setSpecies(String species) {
      this.species = species;
   }
   
}