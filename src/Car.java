public class Car extends Transport implements InterfaceUpdateTyre, InterfaceCheckEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        updateTyre();
        checkEngine();
    }
}
