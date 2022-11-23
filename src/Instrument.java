public abstract class Instrument {
    private String nazwa;

    public Instrument(){
        nazwa = "";
    }

    public Instrument(String nazwa){
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String toString(){
        return "Instrument o nazwie: " + getNazwa();
    }

    abstract String wydajDzwiek();

    abstract void graj();

}
