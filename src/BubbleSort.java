public class BubbleSort {
    public static void main(String[] args) {
        int[] A = {8,2,9,4,1,3,7};
        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-1-i;j++){
                if(A[j]>A[j+1]){
                    int ele = A[j];
                    A[j]=A[j+1];
                    A[j+1]=ele;
                }
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }

}
