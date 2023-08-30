public class Truck extends Transport implements InterfaceUpdateTyre, InterfaceCheckEngine, InterfaceCheckTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void checkEngine() {
    }

    @Override
    public void check() {
        super.check();
        updateTyre();
        checkEngine();
        checkTrailer();
    }

}
