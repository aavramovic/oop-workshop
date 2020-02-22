package zgrada;

public class Main {
    public static void main(String[] args) {
        Stan stan1 = new Stan(1, 24, 150, false);
        Stan stan2 = new Stan(2, 24, 150, false);
        Stan stan3 = new Stan(3, 24, 150, true);
        Stan stan4 = new Stan(4, 24, 150, false);

        Stan stan5 = new Stan(5, 24, 150, true);
        Stan stan6 = new Stan(6, 24, 150, false);
        Stan stan7 = new Stan(7, 24, 150, true);
        Stan stan8 = new Stan(8, 24, 150, false);

        Stan stan9 = new Stan(9, 24, 150, true);
        Stan stan10 = new Stan(10, 24, 150, false);
        Stan stan11 = new Stan(11, 24, 150, true);
        Stan stan12 = new Stan(12, 24, 150, false);

        Sprat sprat1 = new Sprat(1, stan1, stan2, stan3, stan4);
        Sprat sprat2 = new Sprat(2, stan5, stan6, stan7, stan8);
        Sprat sprat3 = new Sprat(3, stan9, stan10, stan11, stan12);
        Zgrada zgrada = new Zgrada("Treta mak brigada", sprat1, sprat2, sprat3);
        zgrada.printZgrada();

    }
}
