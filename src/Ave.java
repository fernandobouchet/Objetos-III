abstract class Ave {
    int energia = 2;
    int kmsRecorridos = 0;

    String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public void comer(int gramos) {
        energia += gramos;
    }
    private boolean puedeVolar(int kilometros) {
        return kilometros * 3 < energia;
    }
    public void volar(int kilometros) throws Exception {
        if(energia <= 0 || !this.puedeVolar(kilometros)) {
            throw new Exception("La energía no es suficiente para poder volar.");
        }
        energia -= kilometros * 3;
        kmsRecorridos += kilometros;
    }

    public int obtenerEnergia() {
        return energia;
    }

    public int obtenerKmsRecorridos() {
        return kmsRecorridos;
    }
}
