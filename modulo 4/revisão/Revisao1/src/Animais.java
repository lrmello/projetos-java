public class Animais {

    private String nome;

    public Animais(String nome){
        this.nome = nome;
    }

    public String latir(){
        System.out.println("miau miau");
        return null;
    }

}

public class Cachorro extends Animais{
    private String raca;

    public Cachorro(String nome, String raca){
        super(nome);
        this.raca = raca;
    }

    @Override
    public String latir(){
        System.out.println("au au");
        return null;
    }
}
