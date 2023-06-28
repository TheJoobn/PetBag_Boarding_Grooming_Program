// This is the pet parent class.
public class Pet {
	
// All instance variables for Pet class are defined here.
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	
// The accessor and mutator methods are defined below.
	
	//Constructor with no argument
	public Pet() {}
	
	// This is an accessor type method for petType (accesses)
	public String getPetType() { 
		return petType;
	}
	
	// This is the mutator type method for petType (modifies)
	public void setPetType(String petType) { 
		this.petType = petType;
	}
	
	// This is an accessor type method for petName (accesses)
	public String getPetName() { 
		return petName;
	}
	
	// This is the mutator type method for petName (modifies)
	public void setPetName(String petName) { 
		this.petName = petName;
	}
	
	// This is an accessor type method for petAge (accesses)
	public int getPetAge() { 
		return petAge;
	}
	
	// This is the mutator type method for petAge (modifies)
	public void setPetAge(int petAge) { 
		this.petAge = petAge;
	}
	
	// This is an accessor type method for dogSpaces (accesses)
	public int getDogSpaces() { 
		return dogSpaces;
	}
	
	// This is the mutator type method for dogSpaces (modifies)
	public void setDogSpaces(int dogSpaces) { 
		this.dogSpaces = dogSpaces;
	}
	
	// This is an accessor type method for catSpaces (accesses)
	public int getCatSpaces() { 
		return catSpaces;
	}
	
	// This is the mutator type method for catSpaces (modifies)
	public void setCatSpaces(int catSpaces) { 
		this.catSpaces = catSpaces;
	}

	// This is an accessor type method for daysStay (accesses)
	public int getDaysStay() { 
		return daysStay;
	}
	
	// This is the mutator type method for daysStay (modifies)
	public void setDaysStay(int daysStay) { 
		this.daysStay = daysStay;
	}
	
	// This is an accessor type method for amountDue (accesses)
	public double getAmountDue() { 
		return amountDue;
	}
	
	// This is the mutator type method for amountDue (modifies)
	public void setAmountDue(double amountDue) { 
		this.amountDue = amountDue;
	}

}