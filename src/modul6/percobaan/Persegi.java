package modul6.percobaan;

public class Persegi extends Bentuk{
    protected int p,l;

    public void setSuperP(int p) {
        super.p = p;
    }

    public void setSuperL(int l) {
        super.l = l;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void getLuas() {
        System.out.println("Luas super\t: " + (super.p * super.l));
        System.out.println("Luas\t: " + (this.p * this.l));
    }
}