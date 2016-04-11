/**
 * Created by Jan on 11.04.2016.
 */
public class Plane extends Vehicle {

    private String Manufacturer;
    private int maxPersonLoad;

    public Plane(MoveType T, int MSpeed, String M, int P){
        super(T,MSpeed);
        this.Manufacturer = M;
        this.maxPersonLoad = P;
    }

    public String getManufacturer(){
        return this.Manufacturer;
    }

    public int getMaxPersonLoad(){
        return this.maxPersonLoad;
    }
    @Override
    public void printInfo(){
        System.out.println("This is a plane!");
    }
}
