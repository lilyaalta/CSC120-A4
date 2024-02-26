import java.util.ArrayList;
public class Train {
    // attributes
Engine engine;
ArrayList<Car> cars;
int maxcap;



public Train(FuelType fueltype, double maxfuel, int nCars, int maxcap){
    // constructors 
this.engine = new Engine(fueltype, maxfuel, maxfuel);
this.cars = new ArrayList<Car>(nCars);
this.maxcap = maxcap;
}

public Engine getEngine(){
    return this.engine;
} 
public Car getCar(int i){
    // gets index of all cars
    return this.cars.get(i);
}

public int getMaxCapacity(){
    // for loop calls car class to get max cap of all cars 
    int max = 0;
    for(Car c : this.cars ){
        max += c.getCapacity();
    }
    return max;
}
public int seatsRemaining(){
    // for loop, calls car class to get the seats remaining of all cars
    int seats = 0;
    for(Car c : this.cars){
        seats += c.seatsRemaining();
    }
   return seats; 
   // returns the # of remaining open seats across all cars
    }

public void printManifest(){
    // for loop, calls car class to get names of all the people on the train
    for(Car c : this.cars){
         c.printManifest();
    }   
}
}
