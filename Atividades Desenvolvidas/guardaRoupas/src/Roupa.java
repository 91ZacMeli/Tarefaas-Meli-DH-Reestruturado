public class Roupa {
    private String marca,modedelo;

    public Roupa(String marca, String modedelo) {
        this.marca = marca;
        this.modedelo = modedelo;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "marca='" + marca + '\'' +
                ", modedelo='" + modedelo + '\'' +
                '}';
    }
}
