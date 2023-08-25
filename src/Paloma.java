public class Paloma extends Ave {
    public Paloma(String nombre) {
        super(nombre);
    }

    public void irAlBanio() {
        energia -= 1;
        kmsRecorridos += 1;
    }
}
