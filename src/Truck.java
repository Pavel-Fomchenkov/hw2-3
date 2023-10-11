public class Truck extends EngineTransport {
    public Truck (String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }
    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
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
        checkTrailer();
    }
}