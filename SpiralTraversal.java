public class SpiralTraversal {
    public static void main(String[] args) {
        int k=0, l=0;
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
        int n=3,m=3;

        while(k<m && l<n){
            for(int i=l;i<m;i++){
                System.out.print(arr[k][i]);
            }
            k++;
            for(int i=k;i<m;i++){
                System.out.print(arr[i][n-1]);
            }
            n--;
            if(k<m){
                for(int i=n-1;i>=l;i--){
                    System.out.print(arr[m-1][i]);
                }
                m--;
            }
            if(l<n){
                for(int i=m-1;i>k;i--){
                    System.out.print(arr[i][l]);
                }
                l++;
            }
        }
        
    }
}
