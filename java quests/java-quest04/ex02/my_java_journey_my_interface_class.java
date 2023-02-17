class Bike implements Vehicle {
    int speed = 0;
    int gear = 1;
    
    public void changeGear(int gear) {
        this.gear = gear;
    }
    
    public void speedUp(int increment) {
        this.speed += increment;
    }
    
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + this.speed + " gear: " + this.gear);
    }
}


class Bicycle implements Vehicle {
    int speed = 0;
    int gear = 1;
    
    public void changeGear(int gear) {
        this.gear = gear;
    }
    
    public void speedUp(int increment) {
        this.speed += increment;
    }
    
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + this.speed + " gear: " + this.gear);
    }
}
