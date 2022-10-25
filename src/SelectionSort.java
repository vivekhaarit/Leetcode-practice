

public class SelectionSort {
    public static void main(String[] args) {
        int[] A = {8,2,9,4,1,3,7};
        for(int i=0;i<A.length-1;i++){
            int min = A[i];
            for(int j=i+1;j<A.length;j++){
                if(min > A[j]){
                    int ele = min;
                    min = A[i] = A[j];
                    A[j] = ele;
                }
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
