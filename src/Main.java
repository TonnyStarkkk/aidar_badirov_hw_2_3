public class Main {
    public static void main(String[] args) {
        //Создание счета клиента
        BankAccount account = new BankAccount(15000);
        System.out.println("Остаток денег на счете: " + account.getAmount() + " сом");
        //попытка снятия денег
        try {
            while (true){
                account.withDraw(6000);
                System.out.println("Сумма 6000 сом успешна снята");
                System.out.println("Остаток на счете: " + account.getAmount() + " сом");
            }
        } catch (LimitException e){
            System.out.println("Недостаточно средств на счете, доступно только " + e.getRemainingAmount() + " сом");
            System.out.println("Все доступные средства были сняты.");
        }
    }
}