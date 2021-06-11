public class Truck extends Automobile {
  private int bedLengthFeet;
  private int bedWidthFeet;
  private int containerHeightFeet;
  private int currentLoadCubicFeet;

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet,
      int bedWidthFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.containerHeightFeet = 3;
    this.currentLoadCubicFeet = 0;
    this.setRunning(false);
  }

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet,
      int bedWidthFeet, int containerHeightFeet) {
    this(type, model, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.containerHeightFeet = containerHeightFeet;
    this.currentLoadCubicFeet = 0;
    this.setRunning(false);
  }

  public int getBedLengthFeet() {
    return bedLengthFeet;
  }



  public int getBedWidthFeet() {
    return bedWidthFeet;
  }



  public int getContainerHeightFeet() {
    return containerHeightFeet;
  }



  public int getCurrentLoadCubicFeet() {
    return currentLoadCubicFeet;
  }

  public int volumeCapacity() {
    return getContainerHeightFeet() * getBedLengthFeet() * getBedWidthFeet();
  }

  public boolean addCargo(int newCargo) {
    if(this.getCurrentLoadCubicFeet() + newCargo <= this.volumeCapacity()) {
      this.currentLoadCubicFeet += newCargo;
      return true;
    }
      return false;
  }

  public void emptyCargo() {
    this.currentLoadCubicFeet = 0;
  }


}