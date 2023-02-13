package home_work_2;

public class Main {
    public static void main(String[] args) {

        int myMany = 1000;

        int pricePizza = 230;
        int boughtAmountPizza = myMany / pricePizza;
        int amountMoneyAfterBuyingPizza = myMany % pricePizza;

        int priceGum = 26;
        int boughtAmountGum = amountMoneyAfterBuyingPizza / priceGum;
        int amountMoneyAfterBuyingGum = amountMoneyAfterBuyingPizza % priceGum;

        double priceCandy = 2.5;
        int boughtAmountCandy = (int) (amountMoneyAfterBuyingGum / priceCandy);
        double amountMoneyAfterBuyingCandy = amountMoneyAfterBuyingGum % priceCandy;

        System.out.println("На эти деньги мы можем купить:");

        System.out.println("- " + boughtAmountPizza + " пиццы");
        System.out.println("- " + boughtAmountGum + " жвачки");
        System.out.println("- " + boughtAmountCandy + " конфеты");

        System.out.println("Cдача с магазина: " + amountMoneyAfterBuyingCandy + " рубля");
    }
}
