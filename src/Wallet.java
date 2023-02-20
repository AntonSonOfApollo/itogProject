public class Wallet implements paymentSystem {

    public String name;
    public int capacity;
    public String bank;


    public Wallet(String name, int capacity, String bank) {
        this.name = name;
        this.capacity = capacity;
        this.bank = bank;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getCapacity() {
        return capacity;
    }
    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String getBank() {
        return bank;
    }
    @Override
    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return
                "Кошелек " + name + '\'' +
                ", Сумма на кошельке = " + capacity +
                ", Банк : " + bank + '\'' +
                '}';
    }







}
