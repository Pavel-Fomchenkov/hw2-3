public class Car extends EngineTransport implements Servisable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
        checkEngine();
    }
}