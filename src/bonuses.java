public class bonuses {
    public static void main(String[] args) {

        int balance = 100; // начальный счет
        int payment = 1100; // сумма пополнения

        int bonus;

        if (payment < 1000) {
            bonus = 0;

        } else {
            bonus = payment / 100;

        }

        balance = balance + payment + bonus;

        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Итоговая баланс: " + balance);

    }
}