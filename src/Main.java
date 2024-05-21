public class Main {
    public static void main(String[] args) {

        int startDeposit = 100;
        int addDeposit = 1000;

        int bonus;
        if (addDeposit < 1000) {
            bonus = 0;
        } else {
            bonus = addDeposit / 100;
        }
        int result = startDeposit + addDeposit + bonus;

        System.out.println("Начисленные бонусы:" + bonus);
        System.out.println("Итоговый счет:" + result);

    }
}