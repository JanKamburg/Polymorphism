public class Vehicle {
    public enum MoveType{DRIVING, FLYING};
    private MoveType moveType;
    private int maxSpeed;

    public Vehicle(MoveType T , int MSpeed){
        this.moveType = T;
        this.maxSpeed = MSpeed;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public MoveType getMoveType(){
        return this.moveType;
    }
}
