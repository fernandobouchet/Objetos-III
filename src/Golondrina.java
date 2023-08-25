import java.util.Random;

public class Golondrina extends Ave {
    private boolean esMejorPescador = false;
    private boolean yaPesco = false;
    private int intentosDePesca = 0;

    public Golondrina(String nombre, Logger log) {
        super(nombre, log);
    }

    public void hacerMejorPescador() {
        esMejorPescador = true;
        log.showInfo("La golondrina " + this.nombre + " es ahora mejor pescador");
    }

    private boolean puedePescar() {
        if(esMejorPescador) {
            return this.energia >= 2;
        } else {
            return energia >= 3;
        }
    }
    public void pescar() throws Exception {
        log.showInfo("La golondrina " + this.nombre + " intenta pescar.");
        if(!puedePescar()) {
            log.showError("La energia de " + this.nombre + " no es suficiente para poder pescar.");
            throw new Exception("La energía no es suficiente para poder pescar.");
        }
        if(esMejorPescador) {
            energia -= 1;
            log.showInfo(this.nombre + " es mejor pescador, se le descuenta 1 de energia.");
        } else {
            log.showInfo(this.nombre + " no es mejor pescador, se le descuenta 2 de energia.");
            energia -= 2;
        }
        intentosDePesca += 1;
        kmsRecorridos += 1;
        log.showInfo(this.nombre + " suma 1 intento de pesca y 1 kilometro recorrido.");
        if (!yaPesco && intentosDePesca < 10) {
            yaPesco = new Random().nextBoolean();
            log.showInfo("Intento de pesca de " + this.nombre + " numero: " + intentosDePesca);
            if (yaPesco) {
                energia += 10;
                log.showInfo(this.nombre + " pescó!, su energia asciende a " + energia);
            } else {
                log.showInfo(this.nombre + " no tuvo éxito al pescar esta vez.");
            };
        } else if(yaPesco && intentosDePesca <= 10) {
            if(intentosDePesca == 10) {
                intentosDePesca = 0;
                log.showInfo(this.nombre + " ya pesco, y sus intentos de pesca son 10, se resetean los intentos");
            } else {
                log.showInfo(this.nombre + " ya pesco, este es el intento número " + intentosDePesca);
            }
        } else {
            yaPesco = true;
            energia += 10;
            log.showInfo(this.nombre + " pescó en el último intento, su energia asciende a " + energia);
        }
    }
}
