public class Passenger {
    
    public String name;

    public Passenger(String name) {
        this.name = name;
    }
public void boardCar(Car c){
    /*  if the car is not at max capacity and the passenger is on the 
    list then the car welcomes them
    */
    if(c.seatsRemaining() != 0){
        if(c.addPassenger(this) == false){
        System.out.print("Welcome!");
    }
}
    else{
        System.out.print("Car is full");
    }
}

public void getOffCar(Car c){
    /*
     * removes passenger from the list if the passenger was on it
     */
   if( c.removePassenger(this) == false){
    System.out.print("This passenger was never on board...");
   }
   else{
    System.out.print("goodbye!");
   }
}

}
