class Vehicle3 {
    String vehicletype;
    int passengers;
    int fuelcap;
    int mpg;   

    Vehicle3 (String v, int p, int f, int m) {
        vehicletype = v;
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}

class Vehicle3Demo {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3("minivan", 7, 16, 21);
        Vehicle3 sportscar = new Vehicle3("sportscar", 2, 14, 12);

        System.out.println(minivan.vehicletype + 
        " can carry " + minivan.passengers);
        minivan.range();

        System.out.println(sportscar.vehicletype + 
        " can carry " + minivan.passengers);
        sportscar.range();
    }
} 
