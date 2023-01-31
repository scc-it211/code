class Vehicle {
    String vehicletype;
    int passengers;
    int fuelcap;
    int mpg;    
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // assign value to fields
        minivan.vehicletype = "minivan";
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println(minivan.vehicletype + 
        "can carry " + minivan.passengers + 
        " with a range of " + range);
    }
}