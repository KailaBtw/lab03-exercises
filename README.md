//Find All Duplicates

//Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.

    public static LinkedList<Integer> findAllDuplicates(LinkedList<Integer> list) {
        LinkedList<Integer> ret = new LinkedList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

            for(Integer element : list) {
                if(seen.contains(element)) {
                    //add it to list?
                    if(!duplicates.contains(element)) {
                        ret.add(element);
                        duplicates.add(element); // add to duplicates so we dont have multiple in ret
                    }
                } else {
                    // add to our seen list
                    seen.add(element);
                }
            }
        return ret;
    }