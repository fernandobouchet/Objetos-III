public class Main {

    public static void main(String[] args) throws Exception {
        Logger Log = new Logger("INFO");

        Golondrina Pepita = new Golondrina("Pepita",Log);
        Golondrina Pepon = new Golondrina("Pepon", Log);
        Pepon.hacerMejorPescador();
        Paloma Bombon = new Paloma("Bombon", Log);
        Pepita.comer(5);
        Pepita.volar(1);
        Pepita.comer(20);
        Pepita.volar(2);
        Pepita.pescar();
        Pepita.pescar();
        Pepita.pescar();
        Pepita.pescar();
        Pepita.pescar();
        Pepita.pescar();
        Pepita.pescar();
        Pepita.pescar();
        Pepita.pescar();
        Pepita.pescar();

        Pepon.pescar();
        Bombon.irAlBanio();
    }
}