package company.SimpleClient;

public class CAddress extends Client {
    @Override
    public void make(ClientInfo info) {
        System.out.println("Адрес // Address: " + info.getAddress());
    }
}
