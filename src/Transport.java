public abstract class Transport implements InterfaceCheck, InterfaceUpdateTyre{
    protected String modelName;
    protected int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    @Override
    public void updateTyre(){
        System.out.println("Меняем покрышку");
    };
    @Override
    public void check() {
        for (int i = 0;i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
