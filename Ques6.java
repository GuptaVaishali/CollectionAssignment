import java.util.*;
import java.util.stream.Collectors;

public class Ques6 {
    // Custom sort by element's frequency and index
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
                int index = hm.get(arr[i]).index;
                hm.put(arr[i],new Data(arr[i],++(hm.get(arr[i]).count),index));
            }
        }

        // sort the values based on a custom comparator
        List<Data> values = hm.values().stream()
                .sorted()
                .collect(Collectors.toList());


        int k = 0;
        for (Data data: values)
        {
            for (int j = 0; j < data.count; j++) {
                arr[k++] = data.value;
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

class Data implements Comparable<Data>
{
    int value, count, index;

    public Data(int value, int count, int index)
    {
        this.value = value;
        this.count = count;
        this.index = index;
    }

    public int compareTo(Data obj)
    {
        // If two elements have different frequencies, then
        // the one which has more frequency should come first
        if (this.count != obj.count) {
            return obj.count - this.count;
        }

        // If two elements have the same frequencies, then the
        // one which has less index should come first
        return this.index - obj.index;
    }
}
