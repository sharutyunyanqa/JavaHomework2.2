// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int balance = 500;
        int add = 1100;
        int bonus;

       if (add>1000){bonus=add / 100;

       } else {
          bonus=0;
       }
       int balanceBonus = balance + add+ bonus;
        System.out.println("Итоговый счет и бонус" + balanceBonus);
        System.out.println("Бонус" + bonus);

    }

    }
