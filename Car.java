public class Car extends Vehicle
{
  private String Manufacturer;
  private String Model;
    
  public Car(MoveType M, int MS, String Manufacturer, String Model)
  {
    super(M,MS);
    this.Manufacturer = Manufacturer;
    this.Model = Model;
  }
  
  
  
}
