package company;
public class Confirmed implements States{
    public Confirmed(){
        System.out.println("Заказ подтвержден // Order confirmed");
    }
    @Override
    public void NewOrder(Order context) {
        System.out.println("Вы добавили еще один заказ // You added another order");

    }

    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Вы уже подтвердили заказ // You have already confirmed your order");
    }

    @Override
    public void Shipped(Order context) {
        System.out.println("Заказ было отправлено // The order has been sent ");
        context.setCurrentState(new Shippedd());

    }
}
