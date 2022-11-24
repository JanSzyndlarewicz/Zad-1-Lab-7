public class Muzyk {
    private String name, second_name, id;
    private Instrument[] instrumenty;

    public Muzyk() {
        name = "";
        second_name = "";
        id = "000000";
        instrumenty = null;
    }

    public Muzyk(String name, String second_name, String id, Instrument[] instrumenty){
        this.name = name;
        this.second_name = second_name;
        this.id = id;
        this.instrumenty = instrumenty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instrument[] getInstrumenty() {
        return instrumenty;
    }

    public void setInstrumenty(Instrument[] instrumenty) {
        this.instrumenty = instrumenty;
    }

    public String toString(){
        String tmp = null;
        for(int i=0; i<getInstrumenty().length; i++){
            tmp += instrumenty[i].getNazwa() + "\t";
        }

        return  getName() + " " + getSecond_name() + ", id: " + getId() + "instrumenty: " + tmp;
    }
}
