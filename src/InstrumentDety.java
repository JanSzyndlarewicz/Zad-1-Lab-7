public class InstrumentDety extends Instrument {

    private int lt;


    public InstrumentDety(){
        super("ZłotaTrąbka");
        lt = 1;

    }

    public InstrumentDety(String nazwa, int lt){
        super(nazwa);
        this.lt = lt;
    }

    @Override
    String wydajDzwiek() {
        return "Tra ta ta";
    }

    @Override
    void graj() {
        for(int i=0; i<lt; i++){
            System.out.println(wydajDzwiek());
        }
    }

    @Override
    public String toString(){
        return getNazwa() + ", lt = " + lt;
    }

}
