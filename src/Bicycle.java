public class Bicycle implements InterfaceUpdateTyre {
    protected String modelName;
    protected int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    @Override
    public void updateTyre() {
            System.out.println("Меняем покрышку");
    }
}
