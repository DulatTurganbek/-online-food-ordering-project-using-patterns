package company;


public class Shippedd implements States {
    public Shippedd(){
        System.out.println("Заказ отправлен // Order shipped");
    }

    @Override
    public void NewOrder(Order context) {
        System.out.println("Уже невозможно добавить новый заказ // It is no longer possible to add a new order");

    }

    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Нельзя подтвердить заказ в текущем состоянии // Can't confirm order in its current state");

    }

    @Override
    public void Shipped(Order context) {
        System.out.println("Заказ уже отправлен  // The order has already been shipped");


    }
}
