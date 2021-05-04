package company;
public class Order {
    private States currentState;

    public Order(States currentState) {
        this.currentState = currentState;
    }

    public States getCurrentState() {

        return currentState;
    }

    public void setCurrentState(States currentState) {

        this.currentState = currentState;
    }

    public void NewOrder() {
        currentState.NewOrder(this);
    }

    public void OrderConfirmed() {
        currentState.OrderConfirmed(this);
    }


    public void Shipped() {
        currentState.Shipped(this);
    }


}