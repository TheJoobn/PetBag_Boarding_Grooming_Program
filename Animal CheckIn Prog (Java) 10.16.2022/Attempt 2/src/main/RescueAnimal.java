//SUBMISSION 1:   *TURN IN FILE 10/2/22* 11pm
//SUBMISSION 2:   *TURN IN FILE 10/15/22* 11pm

package main;

import java.lang.String;

public class RescueAnimal {
	
  // These are the instance variables.
  private String name;
  private String animalType;
  private String gender;
  private String age;
  private String weight;
  private String acquisitionDate;
  private String acquisitionCountry;
  private String trainingStatus;
  private boolean reserved;
  private String inServiceCountry;

  
  // These are the constructors.
  public RescueAnimal() {
  }
  
  public RescueAnimal(String name, String animalType, String gender, String age, String weight, String acquisitionDate,
          String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry){
      this.name = name;
      this.animalType = animalType;
      this.gender = gender;
      this.age = age;
      this.weight = weight;
      this.acquisitionDate = acquisitionDate;
      this.acquisitionCountry = acquisitionCountry;
      this.trainingStatus = trainingStatus;
      this.reserved = reserved;
      this.inServiceCountry = inServiceCountry;
  }

  
  // Getter: name
  public String getName() {
      return name;
  }
  
  // Setter: name
  public void setName(String name) {
      this.name = name;
  }
  
  // Getter: animal type
  public String getAnimalType() {
      return animalType;
  }
  // Setter: animal type
  public void setAnimalType(String animalType) {
      this.animalType = animalType;
  }
  
  // Getter: gender
  public String getGender() {
      return gender;
  }

  // Setter: gender
  public void setGender(String gender) {
      this.gender = gender;
  }

  // Getter: age
  public String getAge() {
      return age;
  }

  // Setter: age
  public void setAge(String age) {
      this.age = age;
  }

  // Getter: weight
  public String getWeight() {
      return weight;
  }

  // Setter: weight
  public void setWeight(String weight) {
      this.weight = weight;
  }

  // Getter: acquisition date
  public String getAcquisitionDate() {
      return acquisitionDate;
  }

  // Setter: acquisition date
  public void setAcquisitionDate(String acquisitionDate) {
      this.acquisitionDate = acquisitionDate;
  }

  // Getter: acquisition country
  public String getAcquisitionLocation() {
      return acquisitionCountry;
  }

  // Setter: acquisition country
  public void setAcquisitionLocation(String acquisitionCountry) {
      this.acquisitionCountry = acquisitionCountry;
  }

  // Getter: reserved
  public boolean getReserved() {
      return reserved;
  }

  // Setter: reserved
  public void setReserved(boolean reserved) {
      this.reserved = reserved;
  }

  // Getter: in service country
  public String getInServiceLocation() {
      return inServiceCountry;
  }

  // Setter: in service country
  public void setInServiceCountry(String inServiceCountry) {
      this.inServiceCountry = inServiceCountry;
  }

  // Getter: get training status
  public String getTrainingStatus() {
      return trainingStatus;
  }

  // Setter: get training status
  public void setTrainingStatus(String trainingStatus) {
      this.trainingStatus = trainingStatus;
  }
}
