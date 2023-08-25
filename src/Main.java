public class Main {

    public static void main(String[] args) throws Exception {
        Logger Log = new Logger("INFO");

        Golondrina Pepita = new Golondrina("Pepita",Log);
        Golondrina Pepon = new Golondrina("Pepon", Log);
        Paloma Bombon = new Paloma("Bombon", Log);
        Mariposa Twinkle = new Mariposa(1, "Twinkle", Log);

        Pepita.comer(20);
        Pepon.comer(20);
        Bombon.comer(20);
        Twinkle.comer(20);

        Pepita.volar(2);
        Pepon.volar(2);
        Bombon.volar(2);
        Twinkle.volar(2);

        Pepita.comer(10);
        Pepon.comer(10);
        Bombon.comer(10);
        Twinkle.comer(10);

        Pepita.volar(3);
        Pepon.volar(3);
        Bombon.volar(3);
        Twinkle.volar(3);

        Pepita.obtenerKmsRecorridos();
        Pepon.obtenerKmsRecorridos();
        Bombon.obtenerKmsRecorridos();
        Twinkle.obtenerKmsRecorridos();
    }
}