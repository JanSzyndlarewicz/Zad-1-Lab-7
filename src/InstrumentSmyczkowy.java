public class InstrumentSmyczkowy extends Instrument{

    private int ls;

    InstrumentSmyczkowy(){
        super("Stradivarius");
        ls = 1;
    }

    InstrumentSmyczkowy(String nazwa, int ls){
        super(nazwa);
        this.ls = ls;
    }


    public int getLs() {
        return ls;
    }

    public void setLs(int ls) {
        this.ls = ls;
    }

    @Override
    String wydajDzwiek() {
        return "Smyk smyk smyk";
    }

    @Override
    void graj() {
        for(int i=0; i<ls; i++){
            System.out.println(wydajDzwiek());
        }
    }

    @Override
    public String toString(){
        return getNazwa() + ", ls = " + ls;
    }

    public boolean jestKontrabasem(){
        if(getNazwa().equals("kontrabas")){
            return true;
        }
        else{
            return false;
        }
    }
}
