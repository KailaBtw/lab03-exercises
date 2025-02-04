import java.util.*;


public class FindDuplicates {

    public static List<Integer> findDuplicatesNestedLoops (List<Integer> list) {
        LinkedList<Integer> ret = new LinkedList<>();
        for(int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
            for(int j = i+1; j < list.size(); j++) {
                if(element == list.get(j)) {
                    if(!ret.contains(element)) {
                        ret.add(element);
                    }
                    break;  // we found a dupe, move on to check next element
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));
    }
}
