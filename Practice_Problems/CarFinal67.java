public class CarFinal67 {
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    public CarFinal67(int noOfWheels, String model, String engineInLiters) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
    }

    @Override
    public String toString() {
        return "CarFinal67: " + "No Of Wheels: " + noOfWheels + "\nModel: " + model + "\nenginInLiters: " + engineInLiters;
    }

    

    public static void main(String[] args) {
        CarFinal67 car = new CarFinal67(4, "Audi", "15");
        System.out.println(car);
    }
}
