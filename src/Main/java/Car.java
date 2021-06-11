public class Car extends Automobile {
  private int capacity;
  private int numPassengers;

  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity,
      int numPassengers) {
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
    this.setRunning(false);
    this.toggleEngine();
  }

  public boolean addPassengers(int numNewPassengers) {
    if(this.numPassengers + numNewPassengers <= this.capacity){
      this.numPassengers += numNewPassengers;
      return true;
    }
      return false;
    }

  public void exitPassengers(int numExitPassengers) {
    if(this.numPassengers - numExitPassengers < 0) {
      this.numPassengers = 0;
    } else {
      this.numPassengers = this.numPassengers - numExitPassengers;
    }
  }


  public int getCapacity() {
    return capacity;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

}
