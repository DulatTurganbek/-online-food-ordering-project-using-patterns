package company;

public interface States {
    void NewOrder(Order context);
    void OrderConfirmed(Order context);
    void Shipped(Order context);

}
