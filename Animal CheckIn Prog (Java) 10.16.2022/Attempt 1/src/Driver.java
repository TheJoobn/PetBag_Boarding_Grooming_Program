//*TURN IN FILE 10/2/22* 11pm

//This program displays a menu of available commands for storing, displaying, changing, and adding to 
//specific animal lists with their traits, training, reservation status, and other info.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    
	// This ArrayList will store Dogs.
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    
	// This ArrayList will store Monkeys.
    private static ArrayList<Monkey> monkeyArrayList = new ArrayList<Monkey>(); 
    
//------------------------------------------------------------------------------------------------------------------------------------------
//MAIN
    
    public static void main(String[] args) {
        
    	// Initializes the scanner, Dog List, and Monkey List.
        Scanner scan = new Scanner(System.in); 
        initializeDogList();
        initializeMonkeyList();
        
//------------------------------------------------------------------------------------------------------------------------------------------
//MENU LOOP DECISION        
        
        // Program will terminate if this value becomes true.
        boolean exit = false; 
        
        // Loop that displays the menu, accepts the users input and takes the appropriate action.  
        // Loops the menu until user input is equal to 'q'.
        while(exit != true){
        	
            //checks first character entered to determine menu option.
        	displayMenu();
            char menuOption = scan.next().charAt(0);
            
            // Menu Option 1: Intakes a new dog.
            if(menuOption == '1') {
                intakeNewDog(scan);
            }
            
            // Menu Option 2: Intakes a new monkey.
            else if(menuOption == '2') {
                intakeNewMonkey(scan);
            }
            
            // Menu Option 3: Reserves an animal.
            else if(menuOption == '3') {
                reserveAnimal(scan);
            }
            
            // Menu Option 4: Prints a list of all dogs.
            else if(menuOption == '4') {
                printAnimals("dog");
            }
            
            // Menu Option 5: Prints a list of all monkeys.
            else if(menuOption == '5') {
                printAnimals("monkey");
            }
            
            // Menu Option 6: Prints a list of all non-reserved  ( training status = "in service"  &   animal reserved = false ).
            else if(menuOption == '6') {
                printAnimals("available");
            }
            
            // Menu Option 4: Loop and program terminate with goodbye message.
            else if(menuOption == 'q') {
            	System.out.println("\nThank you for using our automated system, Have a nice day!");
            	System.out.println("\t   *Program has been terminated*");
                exit = true;
            }
        }
    }
    
//------------------------------------------------------------------------------------------------------------------------------------------
// MENU PRINT - Displays all the options of the menu to the user.
    
    // This method prints the menu options.
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

//------------------------------------------------------------------------------------------------------------------------------------------
// TESTING LISTS - These are data used for testing our different options throughout the menu. 
    
    // Adds dogs to a list for testing   -   FOR TESTING
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "USA", "intake", false, "USA");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "USA", "Phase I", false, "USA");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "CAN", "in service", false, "CAN");
        
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing   -   OPTIONAL FOR TESTING.
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Itachi", "male", "2", "25.6", "07-14-2019", "USA", "intake", false, "USA", 43, 8, 27, "capuchin");
        Monkey monkey2 = new Monkey("Sakura", "female", "6", "35.2", "06-16-2066", "CAN", "Phase I", false, "CAN", 44, 20, 29, "marmoset");
        Monkey monkey3 = new Monkey("Naruto", "male", "3", "13.6", "01-2-2003", "MEX", "in service", false, "MEX", 45, 10, 28, "squirrel monkey");
        
        monkeyArrayList.add(monkey1);
        monkeyArrayList.add(monkey2);
        monkeyArrayList.add(monkey3);
    }
    
//------------------------------------------------------------------------------------------------------------------------------------------
//INTAKE NEW DOGS - Intakes a new dog along with its information and adds it to the list.  
    
    // Inputs the dogs name to help check if dog is in the system already.
    public static void intakeNewDog(Scanner scanner) {
        scanner.nextLine();
    	System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        
        // Checks if dog is already in the system.
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThe dog: '" + name.toUpperCase() + "' is already in our system.\n\n");
                return; //returns to menu.
            }
        }
        
        // Takes the dogs info and adds it to the list.
        System.out.println("What is the breed of the dog?");
        String breed = scanner.nextLine();
        
        System.out.println("What is the gender of the dog?");
        String gender = scanner.nextLine();
        
        System.out.println("What is the age of the dog?");
        String age = scanner.nextLine();
        
        System.out.println("What is the weight of the dog?");
        String weight = scanner.nextLine();
        
        System.out.println("What is the acquisition date of the dog?");
        String acDate = scanner.nextLine();
        
        System.out.println("What is the acquisition country of the dog?");
        String acCountry = scanner.nextLine();
        
        System.out.println("What is the training status of the dog?");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the dog currently reserved? (true or false)");
        boolean reserve = scanner.nextBoolean();
        
        System.out.println("What is the service countryof the dog?");
        scanner.nextLine();
        String serviceCountry = scanner.nextLine();
        
        // Adds new dog to list.
        dogList.add(new Dog(name.toUpperCase(), breed, gender, age, weight, acDate, acCountry, trainingStatus, reserve, serviceCountry));
        System.out.println("\n   *New dog: '" +name.toUpperCase()+ "' has been added to the list*");
    }

//------------------------------------------------------------------------------------------------------------------------------------------
//INTAKE NEW MONKEYS - Intakes a new monkey along with its information and adds it to the list.  
    
    // Inputs monkeys name.
    public static void intakeNewMonkey(Scanner scanner) {
        scanner.nextLine();
    	System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        
        
        // Checks if monkey is already in the system.
        for(Monkey monkey: monkeyArrayList) {
        	if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThe monkey: '" + name.toUpperCase() + "' is already in our system.\n\n");
                return; //returns to menu.
            }
        }
       
        
        // Checks what type of species the monkey is. 
        // Must be: capuchin, guenon, macaque, marmoset, squirrel monkey, or tamarin to be eligible.
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine().toLowerCase();
        
        // Outputs that monkey is not eligible for training due to species type.
        if(!species.equals("capuchin") && !species.equals("guenon") && !species.equals("macaque")
            && !species.equals("marmoset") && !species.equals("squirrel monkey") && !species.equals("tamarin")) {
            System.out.println("\n\nThis monkey is not eligible for training\n\n");
            return; //returns to menu.
        }
        
        
        // Takes the monkeys info and adds it to the list.
        System.out.println("What is the gender of the monkey?");
        String gender = scanner.nextLine();
        
        System.out.println("What is the age of the monkey?");
        String age = scanner.nextLine();
        
        System.out.println("What is the weight of the monkey?");
        String weight = scanner.nextLine();
        
        System.out.println("What is the acquisition date of the monkey?");
        String acDate = scanner.nextLine();
        
        System.out.println("What is the acquisition country of the monkey?");
        String acCountry = scanner.nextLine();
        
        System.out.println("What is the training status of the monkey?");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the monkey currently reserved? (true or false)");
        boolean reserve = scanner.nextBoolean();
        
        System.out.println("What is the service country of the monkey?");
        scanner.nextLine();
        String serviceCountry = scanner.nextLine();
        
        System.out.println("What is the body length of the monkey?");
        int bodyLength = scanner.nextInt();
        
        System.out.println("What is the tail length of the monkey?");
        int tailLength = scanner.nextInt();
        
        System.out.println("What is the height of the monkey?");
        int height = scanner.nextInt();
        
        
        // Adds new monkey to list.
        monkeyArrayList.add(new Monkey(name.toUpperCase(), gender, age, weight, acDate, acCountry, trainingStatus, reserve, serviceCountry, bodyLength, tailLength, height, species));
        System.out.println("\n   *New monkey: '" +name.toUpperCase()+ "' has been added to the list*");
    }

    
//------------------------------------------------------------------------------------------------------------------------------------------
//RESERVES ANIMALS - this reserves an animal if they are eligible based on type of animal, country, and reservation status.
    
    
    // Inputs if the animal is a monkey or a dog.
    public static void reserveAnimal(Scanner scanner) {
    	scanner.nextLine();
    	System.out.println("\nEnter animal type: (Dog or Monkey)");
        String animalType = scanner.next().toLowerCase();
        
        
        // Checks for invalid input.
        if(!animalType.equals("dog") && !animalType.equals("monkey")) {
            System.out.println("Invalid input");
            return; // returns to menu
        }
        
        // Checks the animals country.
        System.out.println("\nEnter animal service country: ");
        String serviceCountry = scanner.next();


        //RESERVES DOGS - reserves a dog if correct country is input and if dog is not reserved.
        
        // If the animal is a dog.
        if(animalType.equals("dog")) {
    		for(Dog dog: dogList) {
    			
    			// Checks if dog meets criteria, outputs 'success' message if true.
	    		if(dog.getInServiceLocation().equalsIgnoreCase(serviceCountry) && !dog.getReserved()) {
	    			System.out.println("\t*DOG NAME: '" + dog.getName() + "' Reservation Successful*");
	    			dog.setReserved(true);
	    			return;	
	    		}
	    		
	    		// Prints the dogs that are not eligible.
	    		else {	
	    			System.out.println("\t*DOG NAME: '" + dog.getName() + "'\tnot eligible*");
	    		}	
	    		
    		}
    	}
    
  
        //RESERVES MONKEYS - reserves a monkey if correct country is input and if monkey is not reserved.
        
        // If the animal is a monkey.
        if(animalType.equals("monkey")) {
    		for(Monkey monkey: monkeyArrayList) {
    			
    			// Checks if monkey meets criteria, outputs 'success' message if true.
	    		if(monkey.getInServiceLocation().equalsIgnoreCase(serviceCountry) && !monkey.getReserved()) {
	    			System.out.println("\t*MONKEY NAME: '" + monkey.getName() + "' Reservation Successful*");
	    			monkey.setReserved(true);
	    			return;	
	    		}
	    		
	    		// Prints the monkeys that are not eligible.
	    		else {	
	    			System.out.println("\t*MONKEY NAME: '" + monkey.getName() + "'\tnot eligble*");
	    		}
    		}
    	}
    } 
    
    
//------------------------------------------------------------------------------------------------------------------------------------------        
//PRINT ANIMALS - Prints lists of all dogs, all monkeys, or available animals.
  
    
    //PRINTS ALL DOG LIST.
	
    // Include the animal name, status, acquisition country and if the animal is reserved.
    public static void printAnimals(String type) {
    	if(type.toLowerCase().equals("dog")) {
            System.out.println("\n\tLIST OF ALL DOGS: ");
            for(Dog dog: dogList) {
                System.out.println(dog.getName() + "\t" + dog.getTrainingStatus() + "\t" + dog.getAcquisitionLocation() + "\t" + dog.getReserved());
            }
        }
        
    	
    	//PRINTS ALL MONKEY LIST.
    	
        // Include the animal name, status, acquisition country and if the animal is reserved.
        else if(type.toLowerCase().equals("monkey")) {
            System.out.println("\n\tLIST OF ALL MONKEYS: ");
            for(Monkey monkey: monkeyArrayList) {
                System.out.println(monkey.getName() + "\t" + monkey.getTrainingStatus() + "\t" + monkey.getAcquisitionLocation() + "\t" + monkey.getReserved());
            }
        }
        
    	
    	//AVAILABLE LIST - prints a combined list of all animals that are fully trained ("in service") but not reserved (reserved = false).

        else if(type.toLowerCase().equals("available")) {
            System.out.println("\n\tLIST OF AVAILABLE ANIMALS: ");
            
        	// For printing available Dogs.
            for(Dog dog: dogList) {
                if(dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                    System.out.println(dog.getName() + "\t" + dog.getTrainingStatus() + "\t" + dog.getAcquisitionLocation() + "\t" + dog.getReserved());
                }
            }
           
        	// For printing available Monkeys.
            for(Monkey monkey: monkeyArrayList) {
                if(monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                    System.out.println(monkey.getName() + "\t" + monkey.getTrainingStatus() + "\t" + monkey.getAcquisitionLocation() + "\t" + monkey.getReserved());
                }
            }
        }
    }
}
