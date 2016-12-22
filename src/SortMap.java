import java.util.*;

/**
 * Created by makar on 28.11.2016.
 */
public class SortMap {



    private static Map < String, String> sortForMap = new HashMap<>();

    public static void addToMap(String k, String v){

        sortForMap.put(k, v);

    }
    public static void conclusionMap(){
        System.out.println();
        System.out.println("Вывод несортированной карты:");
        System.out.println(sortForMap);
    }
    public static void sortKeyAbc(){
        List sortList = new ArrayList();

        String s;

        for (String key : sortForMap.keySet()){
            sortList.add(key);
        }

        Collections.sort(sortList,
                new Comparator <String>() {
                    public int compare(String o1, String o2) {
                        return o1.toString().compareTo(o2.toString());
                    }
                });
        System.out.println();
        System.out.println("Карта сортированая по ключу без учета регистраЖ");



        for (int i = 0; i < sortList.size(); i++) {
            s = sortForMap.get(sortList.get(i));
            System.out.print( sortList.get(i)+ "=" + s +", ");
        }
        System.out.println();

    }
    public static void sortValueCba(){
        List sortList = new ArrayList();

        String s;

        for (String value : sortForMap.values()) {
            sortList.add(value);
        }
        System.out.println();


        Collections.sort(sortList,
                new Comparator <String>() {
                    public int compare(String o1, String o2) {
                        return o1.toString().compareTo(o2.toString());
                    }
                });
        Collections.reverse(sortList);
        System.out.println();
        System.out.println("Карта сортированая по значению без учета регистра в обратном порядке:");


        String v;
        String k;

        for (int i = 0; i < sortList.size(); i++) {
            v= (String) sortList.get(i);


            for (String key : sortForMap.keySet()){
                k= sortForMap.get(key);
                if (v==k){
                    System.out.print( key +"="+ v +" ,");

                }
            }


        }
        System.out.println();


    }

}
