public class Bicycle extends Vehicle {
    Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.modelName);
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }
}