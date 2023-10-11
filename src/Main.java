public class Main {
    public static void main(String[] args) {
        Vehicle[] transport = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };
        for (Vehicle vehicle : transport) {
            vehicle.check();
            System.out.println();
        }
    }
}