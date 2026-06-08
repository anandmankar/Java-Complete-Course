class Vehicle {
    public void service() {
        System.out.println("Vehical getting serviced...");
    }
}

class Car extends Vehicle {
    @Override
    public void service() {
        // super.service();
        System.out.println("Car is getting servviced....");
    }
}

public class Test69 {
    public static void main(String[] args) {
        Vehicle vehical = new Vehicle();
        Car car = new Car();

        vehical.service();
        car.service();
    }
}
