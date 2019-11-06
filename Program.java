public class Program{

    private int predkoscMax;
    private String marka;
    private String model;
    private int predkosc;

    public Samochod(String producent, String model, int predkoscMax) {
        this.predkoscMax = predkoscMax > 0 ? predkoscMax : 0;
        this.producent = producent != null ? producent : "nieznany";
        this.model = model != null ? model : "model";
        this.predkosc = 0;
    }

    public void przyspiesz(int i) {
        int nowaPredkosc = this.predkosc + i;
        this.predkosc = nowaPredkosc < this.predkoscMax ? nowaPredkosc : this.predkoscMax;
    }

    public void zwolnij(int i) {
        int nowaPredkosc = this.predkosc - i;
        this.predkosc = nowaPredkosc > 0 ? nowaPredkosc : 0;
    }

    public int aktualnaPredkosc() {
        return this.predkosc;
    }

    public String toString() {
        return this.marka + " " + this.model;
    }

}