package company.SimpleClient;

public abstract class Client{

    private Client client;



    public void setClient(Client client) {
        this.client = client;
    }

    public abstract void make(ClientInfo info);

}
