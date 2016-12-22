import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by mag_o on 21.12.2016.
 */
public class Main {
    public static void main(String[] args)  {

        SortArreyList sortArreyList = new SortArreyList();
        sortArreyList.addArreyElemrnt("aabc11");
        sortArreyList.addArreyElemrnt("aAbc112");
        sortArreyList.addArreyElemrnt("Aabc1223");
        sortArreyList.addArreyElemrnt("Aabc21234");

        sortArreyList.currentList();
        sortArreyList.sortAbc();
        sortArreyList.sortCba();
        sortArreyList.sortABC();
        sortArreyList.sortCBA();
        sortArreyList.sortLengthMaxMin();
        sortArreyList.sortLengthMinMax();


        SortMap sortMap= new SortMap();
        SortMap.addToMap("Пупкин", "Вася");
        SortMap.addToMap("Бубкин", "Петя");
        SortMap.addToMap("Губка", "Боб");
        SortMap.addToMap("Зирко", "Патрик");

        SortMap.conclusionMap();

        SortMap.sortKeyAbc();
        SortMap.sortValueCba();








    }


}
