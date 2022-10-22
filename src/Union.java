import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you want to enter in array A and B:");
        int[] A = new int[scanner.nextInt()];
        int[] B = new int[scanner.nextInt()];
        System.out.println("Enter "+ A.length +" elements for array A:");
        for(int i=0;i<A.length;i++){
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter "+ B.length +" elements for array B:");
        for(int i=0;i<B.length;i++){
            B[i] = scanner.nextInt();
        }
        System.out.println("The entered array A is:");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("\nThe entered array B is;");
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println();
        System.out.println("\nThe union of A & B :");
        List<Integer> union = new ArrayList<>();
        for (int i=0; i<A.length; i++){
            if(!union.contains(A[i])){
                union.add(A[i]);
            }
        }
        for(int i=0;i<B.length;i++){
            if (!union.contains(B[i])){
                union.add(B[i]);
            }
        }
        for (Integer ele : union){
            System.out.print(ele + " ");
        }

    }
}
