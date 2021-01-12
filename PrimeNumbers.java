package DSA;

public class PrimeNumbers {
    public static void main(String[] args){
        int n = 50;
        int[] numList = new int[n];
        int[] primeNumbers = new int[n];
        for(int i=0;i<=n-1;i++){
            numList[i] = 1;
        }
        for(int i=2;i<=n-1;i++){
            for(int j=i*i;j<=n-1;j++){
                if(j%i == 0){
                    numList[j] = 0;
                }
            }
            if(numList[i]==1){
                primeNumbers[i-2] = i;
            }
            
        }
        for(int num : primeNumbers){
            System.out.println(num);
        }
    }
}
