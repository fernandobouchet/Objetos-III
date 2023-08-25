abstract class Ave implements ComerYVolar {
    protected int energia = 2;
    protected int kmsRecorridos = 0;
    Logger log;
    String nombre;

    public Ave(String nombre,Logger log) {
        this.nombre = nombre;
        this.log = log;
    }

    @Override
    public void comer(int gramos) {
        energia += gramos;
        log.showInfo(this.nombre + " comió " + gramos + " gramos, su energia aumentó a " + energia);
    }
    private boolean puedeVolar(int kilometros) {
        return kilometros * 3 < energia;
    }
    @Override
    public void volar(int kilometros) throws Exception {
        if(energia <= 0 || !this.puedeVolar(kilometros)) {
            log.showError(this.nombre + " no tiene la suficiente energía para poder volar los " + kilometros + " kilometros");
            throw new Exception("La energía no es suficiente para poder volar.");
        }
        energia -= kilometros * 3;
        kmsRecorridos += kilometros;
        log.showInfo(this.nombre + " voló " + kilometros + " kilometros, su energia dismunuyó a " + energia);
    }

    public int obtenerEnergia() {
        log.showInfo("El nivel de energía de " + this.nombre + " es de " + energia);
        return energia;
    }

    @Override
    public int obtenerKmsRecorridos() {
        log.showInfo("Los kilometros recorridos de " + this.nombre + " son " + kmsRecorridos);
        return kmsRecorridos;
    }
}
