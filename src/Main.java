public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addToServise(new Car("car1", 4));
        serviceStation.addToServise(new Car("car2", 4));
        serviceStation.addToServise(new Truck("truck1", 6));
        serviceStation.addToServise(new Truck("truck2", 8));
        serviceStation.addToServise(new Bicycle("bicycle1", 2));
        serviceStation.addToServise(new Bicycle("bicycle2", 2));

        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
    }
}