//SUBMISSION 1:   *TURN IN FILE 10/2/22* 11pm
//SUBMISSION 2:   *TURN IN FILE 10/15/22* 11pm

package main;

public class Dog extends RescueAnimal {

  // Instance variable
  private String breed;

  // Constructor
  public Dog(String name, String breed, String gender, String age,
  String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
      setName(name);
      setBreed(breed);
      setGender(gender);
      setAge(age);
      setWeight(weight);
      setAcquisitionDate(acquisitionDate);
      setAcquisitionLocation(acquisitionCountry);
      setTrainingStatus(trainingStatus);
      setReserved(reserved);
      setInServiceCountry(inServiceCountry);

  }

  // Accessor Method
  public String getBreed() {
      return breed;
  }

  // Mutator Method
  public void setBreed(String dogBreed) {
      breed = dogBreed;
  }

}
