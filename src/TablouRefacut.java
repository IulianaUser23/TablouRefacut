import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Se citeste un tablou. Sa se creeze un nou tablou pe baza celui citit care are proprietatea
 * de multime: fiecare numar apare o singura data.
 */

public class TablouRefacut {

    public static List<Integer> citeste() {
        Scanner introduc = new Scanner(System.in);
        System.out.println("Dati numarul de elemente:");
        int nrElem = introduc.nextInt();
        System.out.println("Numarul de elemente din tablou este:" + nrElem);

        List<Integer> tablou = new ArrayList<>();
        for (int i = 0; i < nrElem; i++) {
            System.out.println("introduceti un numar in tablou");
            int nrIntrodus = introduc.nextInt();
            tablou.add(nrIntrodus);
        }
        return tablou;
    }

    public static boolean cauta(List<Integer> tablou, int elem) {
        boolean gasit = false;
        for (int j = 0; j < tablou.size(); j++) {
            if (elem == tablou.get(j)) {
                gasit = true;
            }
        }
        return gasit;
    }
    public static List<Integer> transformaTablou(List<Integer>tablou){
        List<Integer> tablouNou = new ArrayList<>();
        for (int i = 0; i < tablou.size(); i++) {
            Integer elem = tablou.get(i);
            if (!cauta(tablouNou, elem)) {
                tablouNou.add(elem);
            }
        }return tablouNou;
    }

    public static void main(String[] args) {

        List<Integer> tablou = citeste();
        System.out.println("Tabloul initial este:" + tablou);

        List<Integer> tablouNou = new ArrayList<>();

        System.out.println("Noul tablou: " + tablouNou);
    }
}



