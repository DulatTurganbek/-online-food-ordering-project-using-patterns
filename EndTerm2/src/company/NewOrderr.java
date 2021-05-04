package company;
public class NewOrderr implements States{
    public NewOrderr(){
        System.out.println("Получен новый заказ // New order received");
    }

    @Override
    public void NewOrder(Order context) {
            System.out.println("Чтобы перейти на новый заказ вы должны подтвердить текущий заказ // To switch to a new order, you must confirm the current order");
        }


    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Вы подтвердили заказ // You have confirmed order");
        context.setCurrentState(new Confirmed());
    }

    @Override
    public void Shipped(Order context) {
        System.out.println("Чтобы отправить заказ сначала должны подтвердить // To ship the order, you must first confirm the order ");
    }


}

