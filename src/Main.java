public class Main {

    public static void main(String[] args) throws Exception {
        Golondrina Pepita = new Golondrina();
        Golondrina Pepon = new Golondrina();
        Pepon.hacerMejorPescador();
        Paloma Bombon = new Paloma();
        Pepita.comer(5);
        Pepita.volar(1);
        Pepita.comer(20);
        Pepita.volar(2);
        System.out.println(Pepita.obtenerEnergia());
        System.out.println(Pepita.obtenerKmsRecorridos());
        Pepita.pescar();
        Pepon.pescar();
        Bombon.irAlBanio();
    }
}