package zgrada;

public class Stan {
    private int broj;
    private int kvadratura;
    private int vkupnaCenaNaStan;
    private int cena;
    private boolean prodaden;

    public Stan(int broj, int kvadratura, int cena, boolean prodaden) {
        this.broj = broj;
        this.kvadratura = kvadratura;
        this.cena = cena;
        this.prodaden = prodaden;
    }

    public int getBroj() {
        return broj;
    }

    public int getKvadratura() {
        return kvadratura;
    }

    public int getCena() {
        return cena;
    }

    public boolean isProdaden() {
        return prodaden;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public void setKvadratura(int kvadratura) {
        this.kvadratura = kvadratura;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setProdaden(boolean prodaden) {
        this.prodaden = prodaden;
    }

    public void printStan() {
        if (!prodaden) {
            System.out.println("Stanot so broj: " + broj + " So kvadratura " + kvadratura + " ja ima cenata  " + cena + " odnosno so vkupna cena " + cena * kvadratura);

        }
    }

}
