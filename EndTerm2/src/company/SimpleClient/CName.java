package company.SimpleClient;

public class CName extends Client {

    @Override
    public void make(ClientInfo info) {
        System.out.println("Заказчик // Orderer: " + info.getName());
    }
}
