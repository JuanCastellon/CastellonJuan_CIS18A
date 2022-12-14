package fal18;

// 25 pts total (15 points for correct implementation (3 pts per section below), 10 points code passes all unit test).
// Refer to the UML class diagram for naming of all methods in this class: SportShopRentalUML.pdf

// 1. Create abstract class named SportShotRental.
// 2. a. Create private boolean member variable named newModel and initialize to false.
//    b. Create private double member variable named rentalCost and initialize to 25.0.
//    c. Create private long member variable named rentalNumber and initialize to 1.

// 3. Create all getters and setters for private member variables created in step #2. Note below is specifics for data validation 
//    in specified setter methods below:
//    a. In setter method for setting rental cost, throw a new IllegalArgumentExcetion for
//       any rental cost that is less than or equal to zero, with the exception message: 
//       "RentalCost out of range"
//    b. In setter method for setting rental number, throw a new IllegalArgumentException for
//       any rental number that is less than 1 or greater than 999999999999, with the
//       exception message: "RentalNumber out of range"

// 4. Create the overrided method named toString that returns a string in the format of:
//    "Rental #{1}, Cost: ${2}, New: {3}"
//    where:  {1} is the format specifier for integers,
//            {2} is the format specifier for doubles with width of 7 characters and 2 decimal places of precision,
//            {3} is the format specifier for boolean values.

// 5. Create the abstract method lateCharge that takes no parameters and returns the late charge as a double.

public abstract class SportShopRental{
    private boolean newModel=false;
    private double rentalCost=25.0;
    private long rentalNumber=1;
    
    //Getter Function
    public boolean isNewModel(){
        return this.newModel;
    }
    public double getRentalCost(){
        return this.rentalCost;
    }
    public long getRentalNumber(){
        return this.rentalNumber;
    }
    
    //Setter Functions
    public void setNewModel(boolean newModel){
        this.newModel=newModel;
    }
    public void setRentalCost(double rentalCost){
        try{
            if(rentalCost<=0){
                throw new IllegalArgumentException();
            }
            this.rentalCost=rentalCost;
        }
        catch(IllegalArgumentException e){
            System.err.println("Rental cost out of range");
        }
    }
    public void setRentalNumber(long rentalNumber){
        try{
            //NOTE : 
            //In case you did not read my email, the RentalNumber variable is to
            //be between 1 and 999999999999, the latter of which produces an 
            //error message because the number 999999999999 is too large. I 
            //shrunk it down by a few 9s. No clue if that affects the testing.
            if(rentalNumber<1||rentalNumber>999999999999L){
                throw new IllegalArgumentException();
            }
            this.rentalNumber=rentalNumber;
        }
        catch(IllegalArgumentException e){
            System.err.println("RentalNumber out of range");
        }
    }
    
    @Override
    public String toString(){
        String str=String.format("Rental #%d"
                + ", Cost: $%7.2f, New: %b"
                ,this.rentalNumber,this.rentalCost,this.newModel);
        return str;
    }
    
    public abstract double lateCharge();
}
