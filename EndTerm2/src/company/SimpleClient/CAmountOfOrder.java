package company.SimpleClient;

public class CAmountOfOrder extends Client {
    @Override
    public void make(ClientInfo info) {
        System.out.println("Сумма заказа // Amount of order is:  " + info.getAmountOfOrder() + " KZT");
    }
}
