import model.Cliente;
import model.Conta;
import model.Endereco;

public class ByteBankApp {
    public static void main(String[] args) {
        Cliente pedroCliente = new Cliente("Pedro Santos","1");
        Cliente beatrizCliente = new Cliente("Beatriz Japa","Bia","2");

        Endereco e1 = new Endereco();
        Endereco e2 = new Endereco();

        e1.setCep("225.598-99");
        e1.setNumero("1252");
        e1.setEstado("SP");

        e2.setCep("225.598-98");
        e2.setNumero("1253");
        e2.setEstado("RJ");

        pedroCliente.setEndereco(e1);
        beatrizCliente.setEndereco(e2);

        Conta c1 = new Conta("2b",pedroCliente,"Pedrin","125112","89.95");
        Conta c2 = new Conta("2c",beatrizCliente,"Biazin","112258","99.99");

        System.out.println(c2.getTitular().getEndereco().getCep());



    }
}