import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AccountTest {
    private static void menu() {
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: Date");
        System.out.println("5: select id");
        System.out.println("6: exit");
    }

    public static void main(String[] args) {
        Account account01 = new Account();
        Account account02 = new Account();
        Account account03 = new Account();
        Account account04 = new Account();
        Account account05 = new Account();
        Account account06 = new Account();
        Account account07 = new Account();

        ArrayList<Account> arrayList = new ArrayList<>();
        arrayList.add(account01);
        arrayList.add(account02);
        arrayList.add(account03);
        arrayList.add(account04);
        arrayList.add(account05);
        arrayList.add(account06);
        arrayList.add(account07);

        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.println("enter id");
            id = scanner.nextInt();
        }
        while (id < 0 || id > 7);
        menu();
        while (true) {
            System.out.println("enter choice");
            System.out.println("-------------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(arrayList.get(id).getBalance());
                    System.out.println("-------------");
                    menu();
                    break;
                case 2:
                    System.out.println("enter withdraw: ");
                    System.out.println("-------------");
                    double withdraw = scanner.nextDouble();
                    System.out.println("-------------");
                    System.out.println(arrayList.get(id).withdraw(withdraw));
                    System.out.println("-------------");
                    menu();
                    break;
                case 3:
                    System.out.println("enter deposit");
                    System.out.println("-------------");
                    double deposit = scanner.nextDouble();
                    System.out.println("-------------");
                    System.out.println(arrayList.get(id).deposit(deposit));
                    System.out.println("-------------");
                    menu();
                    break;
                case 4:
                    Date date = new Date();

                    arrayList.get(id).setDateCreated(date);
                    String date1 = arrayList.get(id).getDateCreated().toString();
                    System.out.println("-------------");
                    System.out.println(date1);
                    break;
                case 5:
                    System.out.println("-------------");
                    do {
                        System.out.println("enter id");
                        id = scanner.nextInt();
                    }
                    while (id < 0 || id > 7);
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        }
    }
}

