import java.util.*;

public class RelativeSorting {
    public static int[] printSorting(int arr1[], int arr2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr2) {
            if (map.containsKey(num)) {
                int count = map.get(num);

                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
                map.remove(num);
            }
        }

        List<Integer> remainingElement = new ArrayList<>();

        for (int num : map.keySet()) {
            int count = map.get(num);
            for (int i = 0; i < count; i++) {
                remainingElement.add(num);
            }
        }

        Collections.sort(remainingElement);

        result.addAll(remainingElement);

        int sortedArray[] = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            sortedArray[i] = result.get(i);
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int arr2[] = { 2, 1, 4, 3, 9, 6 };

        System.out.println(printSorting(arr1, arr2));
    }

}
