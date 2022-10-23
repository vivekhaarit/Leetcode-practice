import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] A = {8,2,9,4,9,9,1,3,3,7};
        System.out.println("Actual array:");
        for(int n : A){
            System.out.print(n+" ");
        }
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        for(int ele: A){
            numbers.add(ele);
        }
        System.out.println("\nnumbers after removing duplicates:");
        for(Integer n : numbers){
            System.out.print(n+" ");
        }
    }
}
