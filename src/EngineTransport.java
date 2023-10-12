public abstract class EngineTransport extends Transport implements Servisable{
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    protected EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
