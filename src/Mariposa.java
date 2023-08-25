public class Mariposa implements ComerYVolar{
    private int peso;
    private String nombre;

    private Logger log;

    private int kmsRecorridos;


    public Mariposa(int peso, String nombre, Logger log) {
        this.peso = peso;
        this.nombre = nombre;
        this.log = log;
    }
    @Override
    public void comer(int gramos) {
        peso += gramos / 5;
        log.showInfo("La mariposa " + this.nombre + " comió " + gramos + " gramos, su peso aumentó a " + peso);
    }

    @Override
    public void volar(int kilometros) {
    kmsRecorridos += kilometros;
    log.showInfo("La mariposa " + this.nombre + " recorrió " + kilometros + " kilometros, sus kilometros recorridos aumentó a " + kmsRecorridos);
    }

    @Override
    public int obtenerKmsRecorridos() {
        log.showInfo("La kilometros recorridos de " + this.nombre + " son " + kmsRecorridos);
        return kmsRecorridos;
    }
}
