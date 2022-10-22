import java.util.Scanner;

public class CountFrequencyOfElements {
    public static void main(String[] args) {
        int[] A = {8,2,9,4,9,9,1,3,3,7};
        int[][] frequency = new int[2][A.length];
        for(int i=0;i<A.length;i++){
            if(!isPresent(A[i],frequency)){
                int count = 1;
                for(int j=i+1;j<A.length;j++){
                    if(A[i]==A[j]) count++;
                }
                frequency[0][i]=A[i];
                frequency[1][i]=count;
            }
        }
        System.out.println("freq of each elements in the array:");
        for(int i=0;i< frequency[0].length;i++){
            if(frequency[1][i]!=0) System.out.print(frequency[0][i]+" : "+frequency[1][i]+"\n");
        }
    }

    private static boolean isPresent(int element, int[][] frequency) {
        int i=0;
        for(;i< frequency[0].length;i++){
            if(element==frequency[0][i]) return true;
        }
        if(i== frequency[0].length)
            return false;

        return false;
    }


}
