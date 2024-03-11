package ru.sectorsj.orailly.learnjava._536_monicaAndRyan;

public class MonicaAndRyanJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        MonicaAndRyanJob theJob = new MonicaAndRyanJob();
        Thread monica = new Thread(theJob);
        Thread ryan = new Thread(theJob);
        monica.setName("Моника");
        ryan.setName("Райан");
        monica.start();
        ryan.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithDrawl(10);
            if (account.getBalance() < 0) {
                System.out.println("Превышение лимита!");
            }
        }
    }

    private synchronized void makeWithDrawl(int amount) {
    // private void makeWithDrawl(int amount) {   // старый метод (без модификатора synchronized)
        if (account.getBalance() >= amount){
            System.out.println(account.getBalance());
            System.out.println(Thread.currentThread().getName() + " собирается снять деньги");
            try {
                System.out.println(Thread.currentThread().getName() + " задремал(а)");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " проснулся");
            account.withDraw(amount);
            System.out.println(Thread.currentThread().getName() + " заканчивает транзакцию");
            System.out.println(account.getBalance());
        } else {
            System.out.println("Извините, но для клиента " + Thread.currentThread().getName() + " недостаточно денежных средств.");
        }
    }
}