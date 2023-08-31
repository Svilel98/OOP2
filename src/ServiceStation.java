public class ServiceStation implements InterfaceService {
    @Override
    public void service(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.modelName);
            transport.check();
        }
    }
}