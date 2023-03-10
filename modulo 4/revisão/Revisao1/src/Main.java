public class Main {
    private String nome;

    private int idade;

    private Carro carro;

    public Main(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String value){
        this.nome = value;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int value){
        this.idade = value;
    }

    public int somaIdades(int value){
        this.idade = idade +value;
        return idade + value;
    }

    public void console(){
        System.out.println(nome);
    }

    public Carro getCarro(){
        return carro("Aleatoria");/*marca:"aleatoria"*/
    }


}

class Carro{

    private String marca;

    public Carro(String marca){
        this.marca = marca;
    }
}