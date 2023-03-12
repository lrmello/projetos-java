package bytebank;

public class ByteBankApp {
    public static void main(String[] args) {

        ContaBrasileira acc1 = new ContaBrasileira("123abc", "Pedro","000-455-888-99","Pedrinho",985.58);
        ContaBrasileira acc2 = new ContaBrasileira("123abc", "Jão","000-455-888-99","Jãozin",98.59);

        acc1.deposito(75.98);

        System.out.println(acc2.getSaldo());
    }
}
