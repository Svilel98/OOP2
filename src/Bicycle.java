public class Bicycle extends Transport implements InterfaceUpdateTyre {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
    }
}
