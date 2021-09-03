package exemplo1;

public class Exemplo1 {
    public static void main(String[] args) {
        Roupa casaco = new Roupa();
        System.out.println("pronto!");

        casaco.descricao ="casaco";
        casaco.colecao = "outono/inverno";
        casaco.cor = "preta";
        casaco.tamanho = "P";
        casaco.modelo = "slim";
        System.out.println(casaco.descricao+"\n"+casaco.colecao+"\n"+casaco.cor+"\n"+casaco.tamanho+"\n"+casaco.modelo);
        System.out.println("_______________________________________________________________");

        Roupa cauca = new Roupa("cauça","Preta","Skinny","44","Inverno");

        Roupa blusa = casaco;
        casaco = null;
        System.out.println(casaco);

        System.out.println("_______________________________________________________________");

        System.out.println(blusa.descricao+"\n"+blusa.colecao+"\n"+blusa.cor+"\n"+blusa.tamanho+"\n"+blusa.modelo);
    }
}
