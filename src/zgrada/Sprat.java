package zgrada;

public class Sprat {
    private int broj;
    private int brneprodadeni;
    Stan stan1;
    Stan stan2;
    Stan stan3;
    Stan stan4;

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public int getBrneprodadeni() {
        return brneprodadeni;
    }

    public void setBrneprodadeni(int brneprodadeni) {
        this.brneprodadeni = brneprodadeni;
    }

    public Stan getStan1() {
        return stan1;
    }

    public void setStan1(Stan stan1) {
        this.stan1 = stan1;
    }

    public Stan getStan2() {
        return stan2;
    }

    public void setStan2(Stan stan2) {
        this.stan2 = stan2;
    }

    public Stan getStan3() {
        return stan3;
    }

    public void setStan3(Stan stan3) {
        this.stan3 = stan3;
    }

    public Stan getStan4() {
        return stan4;
    }

    public void setStan4(Stan stan4) {
        this.stan4 = stan4;
    }

    private void calculateNeprodadeniStanovi() {
        brneprodadeni = 0;
        if (!stan1.isProdaden()) {
            brneprodadeni++;
        }
        if (!stan2.isProdaden()) {
            brneprodadeni++;
        }
        if (!stan3.isProdaden()) {
            brneprodadeni++;
        }
        if (!stan4.isProdaden()) {
            brneprodadeni++;
        }
    }

    public Sprat(int broj, Stan stan1, Stan stan2, Stan stan3, Stan stan4) {
        this.broj = broj;
        this.stan1 = stan1;
        this.stan2 = stan2;
        this.stan3 = stan3;
        this.stan4 = stan4;
        calculateNeprodadeniStanovi();

    }

    public void printSprat() {
        if (brneprodadeni == 0) {
            System.out.println("Nema slobodni stanovi na ovoj kat");
        } else {
            System.out.println("Spratot so broj:" + broj + "ima" + brneprodadeni + "neprodadeni stna");
            System.out.println("Tie se: ");
            stan1.printStan();
            stan2.printStan();
            stan3.printStan();
            stan4.printStan();

        }
        System.out.println("==========================");
    }
}
