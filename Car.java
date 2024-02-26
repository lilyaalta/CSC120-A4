import java.util.ArrayList;

public class Car {
    // attributes
ArrayList<Passenger> passengers; 
int maxcap;



public Car(ArrayList<Passenger> passengers, int maxcap){
    //constructor
this.passengers = passengers;
this.maxcap = maxcap;
}
public int getCapacity(){
    // the maximum capacity will be provided.
return this.maxcap;

}

public int seatsRemaining(){
    /*  finding the seats remaining by subtracting the maximum capacity 
    by the number of passengers recorded in the list
    */
return this.maxcap - this.passengers.size();

}

public boolean addPassenger(Passenger p){
    /*
     will return true and add the given passenger if they are not on the list already.
     */
    if(this.passengers.contains(p)){
        return false;
    }
    else{
    this.passengers.add(p);
    return true;
    }
}

public boolean removePassenger(Passenger p){
    /*
     will remove passenger if passenger is on the list 
     */
    if(this.passengers.contains(p)){ // if this passenger is in the array list:
        passengers.remove(p); // removes passenger
        return true;
    }
    else{
        return false;
    }
}

public void printManifest(){
    // will print out list of names if list is not empty
    boolean arraylist = passengers.isEmpty();
    if(arraylist == false){
    for(Passenger p : this.passengers){
        System.out.print(p.name);
    }
}
    else{
        System.out.print("This car is Empty");

    }
    
    }
    



public static void main(String[] args){
    ArrayList<Passenger> p = new ArrayList<>();
    Passenger p1 = new Passenger("Lily");
    Passenger p2 = new Passenger("Poorvi");
    p.add(p1);
    p.add(p2);
    Car myCar = new Car(p, 20);
    myCar.printManifest();

}
}