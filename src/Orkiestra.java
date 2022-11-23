public class Orkiestra {

    public static void print(Instrument T[]){
        int i = 0;
        while(T[i]!=null && i<T.length){
            System.out.println(T[i].toString());
            i++;
        }
    }

    public static void printSound(Instrument T[]){
        int i = 0;
        while(T[i]!=null && i<T.length){
            System.out.println(T[i].getNazwa());
            T[i].graj();
            i++;
            System.out.println();
        }
    }

    public static void findMax(Instrument T[]){
        int max = 0;
        int index = 0;
        for(int i=0; i<T.length; i++){
            if(T[i] instanceof InstrumentDety) {
                if (((InstrumentDety) T[i]).getLt() > max) {
                    max = ((InstrumentDety) T[i]).getLt();
                    index = i;
                }
            }
            else if (T[i] instanceof InstrumentSmyczkowy) {
                if(((InstrumentSmyczkowy) T[i]).getLs() > max){
                    max = ((InstrumentSmyczkowy) T[i]).getLs();
                    index = i;
                }
            }
        }

        if(T[index] instanceof InstrumentDety) {
            System.out.println("Najwięcej elementów (" + max + ") ma instrument dęty o nazwie: " + T[index].getNazwa());
        }
        else if (T[index] instanceof InstrumentSmyczkowy) {
            System.out.println("Najwięcej elementów (" + max + ") ma instrument smyczkowy o nazwie: " + T[index].getNazwa());
        }
        System.out.println("Instrument znajduje się na pozycji: " + index);
    }
    public static void main(String[] args) {
        Instrument[] T = new Instrument[20];

        int n;

        T[0] = new InstrumentDety("trąbka", 1);
        T[1] = new InstrumentDety("róg", 3);
        T[2] = new InstrumentDety("puzon", 2);
        T[3] = new InstrumentDety("klarnet", 6);
        T[4] = new InstrumentDety("tuba", 4);
        T[5] = new InstrumentSmyczkowy("skrzypce", 7);
        T[6] = new InstrumentSmyczkowy("altówka", 1);
        T[7] = new InstrumentSmyczkowy("kontrabas", 4);
        T[8] = new InstrumentSmyczkowy("wiolonczela", 5);

        n = 0;

        while(T[n]!=null && n<T.length){
            n++;
        }

        //print(T);
        //printSound(T);
        findMax(T);

    }
}