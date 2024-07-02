public class Rettangolo extends Forma{
    double base;
    double altezza;
    public Rettangolo(double base, double altezza) {
        this.base= base;
        this.altezza= altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println(base * altezza);
    }
}
