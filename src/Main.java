import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<potentcialIncome> potentcialIncomes = new ArrayList<>();

    static ArrayList<currentExpense> currentExpenses = new ArrayList<>();

    static ArrayList<potentcialExpense> potentcialExpenses = new ArrayList<>();


    static ArrayList<Wallet> wallets = new ArrayList<>();
    static ArrayList<CreditCard> cards = new ArrayList<>();

    public static void main(String[] args) {




        Wallet wallet1 = new Wallet("name1", 100,"bank1");
        Wallet wallet2 = new Wallet("name2", 3000,"bank2");
        Wallet wallet3 = new Wallet("name3", 1500,"bank3");
        wallets.add(wallet1);
        wallets.add(wallet2);
        wallets.add(wallet3);
        CreditCard card1 = new CreditCard("кредитка1",50000,"Сбербанк");
        CreditCard card2 = new CreditCard("кредитка2",15000,"АльфаБанк");
        CreditCard card3 = new CreditCard("кредитка3",5000,"Тинькофф");
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);








        System.out.println("\n\nДобро пожаловать в систему учета финансов \n\n ");

        Scanner mainScan = new Scanner(System.in);


        System.out.println("0. Выход из программы \n" +
                "1. Добавить потенциальный доход \n" +
                "2. Добавить текущую затрату \n" +
                "3. Добавить потенциальную затрату\n" +
                "4. Добавить кредитную карту\n" +
                "5. Удалить кредитную карту\n" +
                "6. Имена кредитных карт\n" +
                "7. Сумма всех кредитных карт\n" +
                "8. Информация о картах\n" +
                "9. Изменение карты\n" +
                "10. Добавить кошелек\n" +
                "11. Удалить кошелек\n" +
                "12. Изменение кошелька\n" +
                "13. Информация о кошельках\n" +
                "14. Имена кошельков\n" +
                "15. Сумма всех кошельков\n" +
                "16. Сумма всех кошельков и карт\n");


        boolean programmWork = true;

    while (programmWork) {

        int chooseAction = mainScan.nextInt();

        switch (chooseAction) {

            case 0:
                programmWork = false;
                break;

            case 1:
                addPotencialIncome();
                break;

            case 2:
                addCurrentExpense();
                break;

            case 3:
                addPotentiaclExpense();
                break;

            case 4:
                addCreditCard();
                break;

            case 5:
                removeCreditCard();
                break;

            case 6:
                cardsNames();
                break;

            case 7:
                System.out.println(cardsValue());
                break;

            case 8:
                cardsInformation();
                break;

            case 9:
                changeCardInformation();
                break;

            case 10:
                addWallet();
                break;

            case 11:
                removeWallet();
                break;

            case 12:
                changeWalletInformation();
                break;

            case 13:
                walletsInformation();
                break;

            case 14:
                walletsNames();
                break;

            case 15:
                System.out.println(walletsValue());
                break;

            case 16:
                walletsAndCardsValue();
                break;
        }

    }








//        walletsInformation();
//        walletsNames();
    //    System.out.println(walletsValue());



    }


    public static void addPotencialIncome() {                                                       // добавить потенциальный доход
        System.out.println("Введите название дохода, затем сумму дохода");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        potentcialIncome income = new potentcialIncome(scan.nextInt(), scan2.nextLine());
        potentcialIncomes.add(income);
    }

    public static void addCurrentExpense() {                                                    // добавить текущую затрату
        System.out.println("Введите название текущей затраты, затем сумму затраты");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        currentExpense curExp = new currentExpense(scan.nextInt(), scan2.nextLine());
        currentExpenses.add(curExp);
    }

    public static void addPotentiaclExpense() {                                                         // добавить потенциальную затрату
        System.out.println("Введите название потенциальной затраты, затем сумму затраты");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        potentcialExpense potExp = new potentcialExpense(scan.nextInt(), scan2.nextLine());
        potentcialExpenses.add(potExp);
    }









    public static void addCreditCard() {                                                                // Добавить кредитную карту
        System.out.println("Введите название кредитной карты, сумму на карте, название банка");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        CreditCard card = new CreditCard(scan.nextLine(),scan.nextInt(),scan2.nextLine());
        cards.add(card);
    }

    public static void removeCreditCard() {                                                         // Удалить кредитную карту
        cardsNames();
        System.out.println("Выберите какую кредитную карту удалить");
        Scanner scan = new Scanner(System.in);
        int cardDelete = scan.nextInt();
        cards.remove(cardDelete-1);
    }


    public static void cardsNames () {                                                    // Имена кредитных карт
        int i = 1;
        System.out.println("Список кредитных карт : ");
        for (CreditCard cardInformation : cards) {
            System.out.println(i + " Наименование : " + cardInformation.getName());
            i++;
        }
    }

    public static int cardsValue() {                                                      // Сумма всех кредитных карт
        int allCardsValue = 0;
        for (CreditCard card : cards) {
            allCardsValue = allCardsValue + card.getCapacity();
        }
        return allCardsValue;
    }


    public static void cardsInformation () {                                               // Информация о картах
        int i = 1;
        for (CreditCard cardInformation : cards) {
            System.out.println(i + "Наименование : " + cardInformation.getName() + " доступные средства : " + cardInformation.getCapacity() + " Банк : " + cardInformation.getBank());
            i++;
        }
    }



    public static void changeCardInformation() {                                                  // Изменение карты
        cardsInformation();
        System.out.println("Выберите какую карту хотите редактировать ?");
        Scanner scan = new Scanner(System.in);
        int cardChange = scan.nextInt()-1;
        System.out.println("Выберите что хотите редактировать : \n 1. Название карты \n 2. Сумму на карте \n 3. Наименование банка");
        Scanner scan2 = new Scanner(System.in);
        int whatChange = scan2.nextInt();
        switch (whatChange) {
            case (1) :
                System.out.println("Введите новое название карта : ");
                Scanner scanNewName = new Scanner(System.in);
                String cardNewName = scanNewName.nextLine();
                cards.get(cardChange).setName(cardNewName);
                break;

            case (2) :
                System.out.println("Введите новую сумму на карте : ");
                Scanner scanNewValue = new Scanner(System.in);
                int cardNewValue = scanNewValue.nextInt();
                cards.get(cardChange).setCapacity(cardNewValue);
                break;

            case (3) :
                System.out.println("Введите новое наименование банка");
                Scanner scanNewBank = new Scanner(System.in);
                String cardNewBank = scanNewBank.nextLine();
                cards.get(cardChange).setBank(cardNewBank);
                break;
        }
    }






    public static void addWallet() {                                                                // Добавить кошелек
        System.out.println("Введите название кошелька, сумму на кошельке, название банка");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Wallet wallet = new Wallet(scan.nextLine(),scan.nextInt(),scan2.nextLine());
        wallets.add(wallet);
    }

    public static void removeWallet() {                                                         // Удалить кошелек
        walletsNames();
        System.out.println("Выберите какой кошелек удалить");
        Scanner scan = new Scanner(System.in);
        int walletDelete = scan.nextInt();
        wallets.remove(walletDelete-1);
    }


    public static void changeWalletInformation() {                                                  // Изменение кошелька
        walletsInformation();
        System.out.println("Выберите какой кошелек хотите редактировать ?");
        Scanner scan = new Scanner(System.in);
        int walletChange = scan.nextInt()-1;
        System.out.println("Выберите что хотите редактировать : \n 1. Название кошелька \n 2. Сумму кошелькая \n 3. Наименование банка");
        Scanner scan2 = new Scanner(System.in);
        int whatChange = scan2.nextInt();
        switch (whatChange) {
            case (1) :
                System.out.println("Введите новое название кошелька : ");
                Scanner scanNewName = new Scanner(System.in);
                String walletNewName = scanNewName.nextLine();
                wallets.get(walletChange).setName(walletNewName);
                break;

            case (2) :
                System.out.println("Введите новую сумму кошелька : ");
                Scanner scanNewValue = new Scanner(System.in);
                int walletNewValue = scanNewValue.nextInt();
                wallets.get(walletChange).setCapacity(walletNewValue);
                break;

            case (3) :
                System.out.println("Введите новое наименование банка");
                Scanner scanNewBank = new Scanner(System.in);
                String walletNewBank = scanNewBank.nextLine();
                wallets.get(walletChange).setBank(walletNewBank);
                break;
        }
    }



    public static void walletsInformation () {                                               // Информация о кошельках
        int i = 1;
        for (Wallet walletInformation : wallets) {
            System.out.println(i + "Наименование : " + walletInformation.getName() + " доступные средства : " + walletInformation.getCapacity() + " Банк : " + walletInformation.getBank());
            i++;
        }
    }

    public static void walletsNames () {                                                    // Имена кошельков
        int i = 1;
        for (Wallet walletInformation : wallets) {
            System.out.println(i + " Наименование : " + walletInformation.getName());
            i++;
        }
    }




    public static int walletsValue() {                                                      // Сумма всех кошельков
        int allWalletsValue = 0;
        for (Wallet wallet : wallets) {
            allWalletsValue = allWalletsValue + wallet.getCapacity();
        }
        return allWalletsValue;
    }



    public static int walletsAndCardsValue() {                                                     // Сумма всех кошельков и карт
        int walletsAndCardsValue = 0;
        for (Wallet wallet : wallets) {
            walletsAndCardsValue = walletsAndCardsValue + wallet.getCapacity();
        }

        for (CreditCard card : cards) {
            walletsAndCardsValue = walletsAndCardsValue + card.getCapacity();
        }

        return walletsAndCardsValue;

    }








}