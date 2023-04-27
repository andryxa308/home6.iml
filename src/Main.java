import operations.CreditCard;
import operations.CreditCard2;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(100);
        CreditCard2 creditCard2 = new CreditCard2(20);
        for (; ; ) {
            System.out.println("\nВведите операцию, которую хотите совершить: \n\nadd - внести деньги на счет \ncheck - проверить остаток на счету \nwithdraw - снять деньги со счета\nTransfer-перевод денег \nexit - выйти");
            Scanner scanner = new Scanner(System.in);
            String opName = scanner.nextLine();
            if (opName.equals("add")) {

                System.out.println("Введите сумму");
                int i = scanner.nextInt();
                creditCard.add(i);
                creditCard2.add(i);

                System.out.println("Внесенны деньги на сумму " + i);

            } else if (opName.equals("check")) {
                int moneyNow = creditCard.check();

                System.out.println("Остаток на счету: " + moneyNow);
            } else if (opName.equals("check")) {
                int moneyNow = creditCard2.check();
                System.out.println("Остаток на счету: " + moneyNow);

            } else if (opName.equals("Transfer")) {
                System.out.println("Введите сумму");
                int i = scanner.nextInt();
                creditCard.Transfer(i);
                creditCard2.Transfer(i);




            } else if (opName.equals("withdraw")) {
                System.out.println("Введите сумму");
                int i = scanner.nextInt();
                creditCard.withdraw(i);
                creditCard2.withdraw(i);
                System.out.println("Было списано со счета: " + i);
            } else if (opName.equals("exit")) {
                break;
            } else System.out.println("Неправильно введены данные");



        }

    }
}
