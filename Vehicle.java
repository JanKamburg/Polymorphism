public class Vehicle { 
    public enum MoveTye{DRIVING, FLYING}; 
    private MoveTye moveType; 
    private int maxSpeed; 
 
    public Vehicle(MoveTye T , int MSpeed){ 
        this.moveType = T; 
        this.maxSpeed = MSpeed; 
    } 
}