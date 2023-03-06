package projetos;
public class Main {
    public static void main(String[] args) {
        minhaClasse minhaInstancia = new minhaClasse(10,"exemplo");
        System.out.println(minhaInstancia.getAtributo1());
        System.out.println(minhaInstancia.getAtributo2());
        minhaInstancia.setAtributo1(20);
        minhaInstancia.setAtributo2("Leonardo");
        System.out.println(minhaInstancia.getAtributo1());
        System.out.println(minhaInstancia.getAtributo2());
        minhaInstancia.metodo1();
        int resultado = minhaInstancia.metodo2(6);
        System.out.println(resultado);
    }
}
