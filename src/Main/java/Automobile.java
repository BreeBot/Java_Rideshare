public class Automobile {
  private String type;
  private String model;
  private String make;
  private int mpg;
  private int fuelCapacity;
  private boolean isRunning;

  public Automobile(String type, String model, String make, int mpg, int fuelCapacity) {
    this.type = type;
    this.model = model;
    this.make = make;
    this.mpg = mpg;
    this.fuelCapacity = fuelCapacity;
    this.isRunning = true;
  }

  public boolean isRunning() {
    return isRunning;
  }

  public void toggleEngine() {
    this.isRunning = !this.isRunning;


  }

  public String getType() {
    return type;
  }


  public String getModel() {
    return model;
  }

  public String getMake() {
    return make;
  }

  public int getMpg() {
    return mpg;
  }

  public int getFuelCapacity() {
    return fuelCapacity;
  }

  public void setRunning(boolean running) {
    isRunning = running;
  }
}
