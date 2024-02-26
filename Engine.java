public class Engine {
    // attributes
FuelType fueltype;
double currentfuel;
double maxfuel;

public Engine(FuelType fueltype, double currentfuel, double maxfuel){
    // constructor
this.fueltype = fueltype;
this.currentfuel = currentfuel;
this.maxfuel = maxfuel;

}
public void refuel(){
this.currentfuel = this.maxfuel;
// will set the current fuel all the way back to 100
}

public boolean go(){
    this.currentfuel = this.currentfuel - 5;
    // if the current fuel is above zero then the current fuel will decrease by 5
    if (this.currentfuel >= 0){
        return true;
    }
    else{
        return false;
    }
    }

public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
}
}