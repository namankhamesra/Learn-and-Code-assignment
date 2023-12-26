package OCP;

public class SmartphoneFactory implements DeviceFactory {
    @Override
    public Device createDevice() {
        return new Smartphone();
    }
}