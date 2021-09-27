package Collection;

import java.util.*;
import java.util.Map.Entry;

public class Ques6 {
    public static void sortByFrequencyAndIndex(int[] arr)
    {
        if (arr == null || arr.length < 2) {
            return;
        }

        // insert frequency of each array element into the map
        // and index of its first occurrence in the array
        Map<Integer, Data> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],new Data(arr[i],1,i));
            }
            else{
                int index = hm.get(arr[i]).getIndex();
                int count = hm.get(arr[i]).getCount();
                hm.put(arr[i],new Data(arr[i],++count,index));
            }
        }

        Set<Entry<Integer,Data>> set = hm.entrySet();
        List<Entry<Integer,Data>> values = new ArrayList<>(set);

        Collections.sort(values, new Comparator<Entry<Integer, Data>>() {
            @Override
            public int compare(Entry<Integer,Data> m1, Entry<Integer, Data> m2) {
                // If two elements have different frequencies, then
                // the one which has more frequency should come first
                if (m1.getValue().getCount() != m2.getValue().getCount()) {
                    return m2.getValue().getCount() - m1.getValue().getCount();
                }

                // If two elements have the same frequencies, then the
                // one which has less index should come first
                return m1.getValue().getIndex() - m2.getValue().getIndex();
            }
        });

        int k = 0;
        for (Entry<Integer,Data>  data: values)
        {
            for (int j = 0; j < data.getValue().getCount(); j++) {
                arr[k++] = data.getValue().getElement();
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before Sorting");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        sortByFrequencyAndIndex(arr);

        System.out.println("Array After Sorting");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}

class Data {
    private final int element;
    private final int count;
    private final int index;

    public int getElement() {
        return element;
    }

    public int getCount() {
        return count;
    }

    public int getIndex() {
        return index;
    }

    public Data(int element, int count, int index)
    {
        this.element = element;
        this.count = count;
        this.index = index;
    }
}
