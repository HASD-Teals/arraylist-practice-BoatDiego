import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        List<Integer> myNums = new ArrayList<Integer>();
        myNums.add(25);
        myNums.add(7);
        myNums.add(5);
        myNums.add(16);
        myNums.add(10);

        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");
        myList.add("Dog");

        myList.add("Cat");

        myList.add("Crab");
        System.out.println(myNums);
        System.out.println(myList);
        System.out.println(minToFront(myNums));

        System.out.println(averageVowels(myList));

        System.out.println(removeEvenLength(myList));
        removeDuplicates(myList);
        System.out.println(doubleList(myList));

    }

    // + = works
    // - = does not work

    // +
    public static List<String> removeEvenLength(List<String> daList) {

        for (int index = 0; index < daList.size(); index++) {
            String size = daList.get(index);
            if (size.length() % 2 == 0) {
                daList.remove(index);
            }
        }
        return daList;
    }

    // +
    public static double averageVowels(List<String> deList) {
        double average = 0.0;
        int vowels = 0;
        for (int index = 0; index < deList.size(); index++) {
            String temps = deList.get(index);
            for (int inde = 0; inde < temps.length(); inde++) {
                if (temps.charAt(inde) == 'a' ||
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

    // +
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

    // +
    public static List<String> doubleList(List<String> list) {
        for (int index = 0; index < list.size(); index++) {
            list.add(index + 1, list.get(index));
            index++;
        }
        return list;
    }

    // +
    public static List<Integer> minToFront(List<Integer> list) {
        int pos = 0;
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) <= list.get(pos)) {
                pos = index;
            }
        }
        Collections.swap(list, 0, pos);

        return list;

    }

}
