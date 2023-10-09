public abstract class Vehicle implements Service {
    protected final String modelName;
    protected final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
}
