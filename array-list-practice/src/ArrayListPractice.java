import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListPractice {
    public static void main(String[] args) {

        List<String>myList = new ArrayList<String>();

        System.out.println(myList);
        //
        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");
        //
        myList.add(2, "Cat");
        //
        System.out.println(myList);
        //
        myList.set(2, "Crab");
        //
        
        System.out.println(myList);
      /*  //
        myList.remove(1);
        //
        System.out.println(myList);
        //
        System.out.println(myList.size());

        System.out.println(myList.get(2));
*/
    }

    public static List<String> removeEvenLength(List<String> daList) {

        for (int index = 0; index < daList.size(); index++) {
            String size = daList.get(index);
            if (size.length() % 2 == 0) {
                daList.remove(index);
            }
        }
        return daList;
    }

    public static double averageVowels(List<String> deList) {
        double average = 0.0;
        int vowels = 0;
        for (int index = 0; index < deList.size(); index++) {
            String temps = deList.get(index);
            for (int inde = 0; inde < temps.length(); inde++) {
                if (temps.charAt(index) == 'a' ||
                        temps.charAt(inde) == 'e' ||
                        temps.charAt(inde) == 'i' ||
                        temps.charAt(inde) == 'o' ||
                        temps.charAt(inde) == 'u' ||
                        temps.charAt(inde) == 'A' ||
                        temps.charAt(inde) == 'E' ||
                        temps.charAt(inde) == 'O' ||
                        temps.charAt(inde) == 'U') {
                    vowels++;
                }
            }

        }
        average = vowels / deList.size();
        return average;
    }

    public static List<String> removeDuplicates(List<String> list) {
        Collections.sort(list);
        for (int index = 0; index < list.size(); index++) {
            String temps = list.get(index);
            for (int j = 0; j < list.size(); j++) {
                if (index != j && temps.equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        return list;
    }

    public static List<String> doubleList(List<String> list) {
        for (int index = 0; index < list.size(); index++) {
            list.add(index+1, list.get(index));
            index++;
        }
        return list;
    }
    public static List<Integer> minToFront(List<Integer>list){
        int pos = 0;
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index)>list.get(pos)){
                pos = index;
            }
        }
        Collections.swap(list, 0, pos);

        return list;

    }




}
