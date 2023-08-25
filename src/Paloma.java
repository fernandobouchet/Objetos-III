public class Paloma extends Ave {
    public Paloma(String nombre, Logger log) {
        super(nombre, log);
    }

    public void irAlBanio() {
        energia -= 1;
        kmsRecorridos += 1;
        log.showInfo("La paloma " + this.nombre + " fué al baño, su energia disminuyó a " + energia + " y sus kilometros recorridos aumentaron a " + kmsRecorridos);

    }
}
