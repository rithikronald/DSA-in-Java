package DSA;

public class WaterTraping {
    public static void main(String[] args){
        int[] wallHeights = {5,3,1,6};
        int n = wallHeights.length;
        int waterTrapped = 0; 
        for(int i=1 ; i<n-1 ; i++){
            int leftMax = leftMax(wallHeights,n,i);
            int rigthMax = rightMax(wallHeights,n,i);
            waterTrapped = waterTrapped + min(leftMax,rigthMax) - wallHeights[i];
        }
        System.out.println(waterTrapped);
    }

    public static int leftMax(int wallHeights[],int n,int i){
        int maximum = 0;
        for(int j=0;j<=i;j++){
            if(maximum < wallHeights[j]){
                maximum = wallHeights[j];
            } 
        }
        return maximum;
    }

    public static int rightMax(int wallHeights[],int n,int i){
        int maximum = 0;
        for(int j=n-1;j>=i;j--){
            if(maximum < wallHeights[j]){
                maximum = wallHeights[j];
            } 
        }
        return maximum;
    }
   
    public static int min(int leftMax,int rigthMax){
        if(leftMax < rigthMax){
            return leftMax;
        }
        else{
            return rigthMax;
        }
    }
}
