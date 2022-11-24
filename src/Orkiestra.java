import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

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

    public static void printDete(Instrument T[]){
        System.out.println("Instrumenty dęte:");
        for(int i=0; i<T.length; i++){
            if(T[i] instanceof InstrumentDety) {
                System.out.println(T[i].toString());
            }
        }
    }

    public static void printSmyczkowe(Instrument T[]){
        System.out.println("Instrumenty smyczkowe:");
        for(int i=0; i<T.length; i++){
            if(T[i] instanceof InstrumentSmyczkowy) {
                System.out.println(T[i].toString());
            }
        }
    }

    public static void ileKontrabasow(Instrument T[]){
        int count = 0;

        for(int i=0; i<T.length; i++){
            if(T[i] instanceof InstrumentSmyczkowy && ((InstrumentSmyczkowy) T[i]).jestKontrabasem()) {
                count += ((InstrumentSmyczkowy) T[i]).getLs();
            }
        }

        System.out.println("Liczba instrumentów o nazwie kontrabas: " + count);

    }

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("0 - Stop");
        System.out.println("1 - Print all");
        System.out.println("2 - Print sound");
        System.out.println("3 - Print dęte");
        System.out.println("4 - Print smyczkowe");
        System.out.println("5 - Find max");
        System.out.println("6 - Count kontrabas");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Instrument[] T = new Instrument[20];

        T[0] = new InstrumentDety("trąbka", 1);
        T[1] = new InstrumentDety("róg", 3);
        T[2] = new InstrumentDety("puzon", 2);
        T[3] = new InstrumentDety("klarnet", 6);
        T[4] = new InstrumentDety("tuba", 4);
        T[5] = new InstrumentSmyczkowy("skrzypce", 7);
        T[6] = new InstrumentSmyczkowy("altówka", 1);
        T[7] = new InstrumentSmyczkowy("kontrabas", 4);
        T[8] = new InstrumentSmyczkowy("wiolonczela", 5);

        int n = 0;
        int choice;

        while(T[n]!=null && n<T.length){
            n++;
        }

        do{
            menu();
            choice = scan.nextInt();

            switch (choice){
                case 0:{
                    System.out.println("Dziękujemy za współpracę");
                    break;
                }
                case 1:{
                    print(T);
                    break;
                }
                case 2:{
                    printSound(T);
                    break;
                }
                case 3:{
                    printDete(T);
                    break;
                }
                case 4:{
                    printSmyczkowe(T);
                    break;
                }
                case 5:{
                    findMax(T);
                    break;
                }
                case 6:{
                    ileKontrabasow(T);
                    break;
                }
                default:{
                    System.out.println("Podana opcja nie odpowiada żadnemu działaniu, spróbuj ponownie");
                    break;
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }while(choice!=0);


    }
}