import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by mag_o on 21.12.2016.
 */
public class SortArreyList {
   private ArrayList az = new ArrayList();

    public void addArreyElemrnt (String s){
        az.add(s);
    }
    public void currentList(){
        System.out.println("Вывод текущего списка");
        System.out.println(az);
    }

    public void sortAbc(){
        Collections.sort(az);
        System.out.println();
        System.out.println("Вывод сортированогосписка по алфавиту с учетом регистра");
        System.out.println(az);
    }

    public void sortCba(){
        Collections.sort(az);
        Collections.reverse(az);
        System.out.println();
        System.out.println("Вывод сортированогосписка по алфавиту с учетом регистра в обратном порядке");
        System.out.println(az);
        }
    public void sortABC(){
        Collections.sort(az, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.toString().compareToIgnoreCase(o2.toString());
            }
        });
        System.out.println();
        System.out.println("сортировка без учета регистра");
        System.out.println(az);
    }
    public void sortCBA(){
        Collections.sort(az, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.toString().compareToIgnoreCase(o2.toString());
            }
        });
        Collections.reverse(az);

        System.out.println();

        System.out.println("сортировка без учета регистра в обратном порядке");
        System.out.println(az);

    }
    public void sortLengthMinMax(){
        Collections.sort(az, new Comparator<String>() {
            public int compare(String o2, String o1) {
                return o1.length() - o2.length();
            }
        });
        Collections.reverse(az);

        System.out.println();
        System.out.println("сортировка без учета регистра по длинне строки в возрастающем порядке");
        System.out.println(az);
    }
    public void sortLengthMaxMin(){
        Collections.sort(az, new Comparator<String>() {
            public int compare(String o2, String o1) {
                return o1.length() - o2.length();
            }
        });


        System.out.println();
        System.out.println("сортировка без учета регистра по длинне строки в убывающем порядке");
        System.out.println(az);
    }








}
