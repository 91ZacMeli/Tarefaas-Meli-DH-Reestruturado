public class Main {
    public static void main(String[] args) {
        Consulta consulta = new Consulta();
        AnimalDomestico gato = new AnimalDomestico();
        AnimalDomestico cao = new AnimalDomestico();
        AnimalFazenda vaca = new AnimalFazenda();
        AnimalFazenda cavalo = new AnimalFazenda();

        consulta.pacientes.add(gato);
        consulta.pacientes.add(cao);
        consulta.pacientes.add(vaca);
        consulta.pacientes.add(cavalo);
    }
}
