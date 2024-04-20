public class Main {
    public static void main(String[] args) {
        //Создание счета клиента
        BankAccount account = new BankAccount(15000);
        System.out.println("Остаток денег на счете: " + account.getAmount() + " сом");
        //Бесконечный цикл для снятия денег
        while (true){
            try {
                account.withDraw(6000);
                System.out.println("Снято 6000 сом. Остаток на счете: " + account.getAmount() + " сом");


            }catch (LimitException e){
                System.out.println("Недостаточно средств на счете. Снято: " + e.getRemainingAmount() + " сом");
                break;
            }
        }
    }
}