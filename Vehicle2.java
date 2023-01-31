class Vehicle2 {
    String vehicletype;
    int passengers;
    int fuelcap;
    int mpg;   

    void range() {
        System.out.println("Range is " 
        + fuelcap * mpg);
    }
}

class Vehicle2Demo {
    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();

        minivan.vehicletype = "minivan";
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.vehicletype = "sportscar";
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println(minivan.vehicletype + " can carry " + minivan.passengers);
        minivan.range();

        System.out.println(sportscar.vehicletype + " can carry " + minivan.passengers);
        sportscar.range();
    }
} 
