public class Pessoa {
    String nome;
    int idade;
    int id;
    double peso;
    double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, int id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }
    public boolean eMaiorDeIdade(){
        return idade >= 18;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id=" + id +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
