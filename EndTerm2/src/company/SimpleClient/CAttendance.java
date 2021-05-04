package company.SimpleClient;

import company.SimpleClient.Client;
import company.SimpleClient.ClientInfo;

public class CAttendance extends Client {

    @Override
    public void make(ClientInfo info) {
        System.out.println("сколько раз заказывалы в нашем приложение  // How many times have you ordered in our app: " + info.getAttendance());
    }
}
