public class Bicycle extends Transport {
    Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.modelName);
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }
}