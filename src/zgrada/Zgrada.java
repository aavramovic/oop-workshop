package zgrada;

public class Zgrada {
    private String adresa;
    Sprat sprat1;
    Sprat sprat2;
    Sprat sprat3;

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Sprat getSprat1() {
        return sprat1;
    }

    public void setSprat1(Sprat sprat1) {
        this.sprat1 = sprat1;
    }

    public Sprat getSprat2() {
        return sprat2;
    }

    public void setSprat2(Sprat sprat2) {
        this.sprat2 = sprat2;
    }

    public Sprat getSprat3() {
        return sprat3;
    }

    public void setSprat3(Sprat sprat3) {
        this.sprat3 = sprat3;
    }

    public Zgrada(String adresa, Sprat sprat1, Sprat sprat2, Sprat sprat3) {
        this.adresa = adresa;
        this.sprat1 = sprat1;
        this.sprat2 = sprat2;
        this.sprat3 = sprat3;
    }

    public void printZgrada() {
        System.out.println(adresa);
        sprat1.printSprat();
        sprat2.printSprat();
        sprat3.printSprat();
    }
}
