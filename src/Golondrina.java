import java.util.Random;

public class Golondrina extends Ave {
    private boolean esMejorPescador = false;
    private boolean yaPesco = false;
    private int intentosDePesca = 0;

    public Golondrina(String nombre) {
        super(nombre);
    }

    public void hacerMejorPescador() {
        esMejorPescador = true;
    }

    private boolean puedePescar() {
        if(esMejorPescador) {
            return this.energia >= 2;
        } else {
            return energia >= 3;
        }
    }
    public void pescar() throws Exception {
        if(!puedePescar()) {
            throw new Exception("La energía no es suficiente para poder pescar.");
        }
        if(esMejorPescador) {
            energia -= 1;
        } else {
            energia -= 2;
        }
        intentosDePesca += 1;
        kmsRecorridos += 1;
        if (!yaPesco && intentosDePesca < 10) {
            yaPesco = new Random().nextBoolean();
            if (yaPesco) {
                energia += 10;
            }
        } else if(yaPesco && intentosDePesca == 10) {
            intentosDePesca = 0;
        } else {
            yaPesco = true;
            energia += 10;
        }
    }
}
