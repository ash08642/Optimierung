
package primenumbers;

public class PrimeNumbers {

    
    public static void main(String[] args) {
       primeto(120);
    }
    
    static void primeto(int n){     //Sieb des Eratostheness
        boolean[] num = new boolean[n];
        num[0] = true;
        int i = 2;
        
        while(i*i < num.length){
            if(!num[i-1]){
                for(int k = i*i; k <= num.length; k += i){
                    num[k-1] = true;
                }
            }
            i++;
        }
        int count = 0;
        for(int x = 0; x < num.length; x++){
            if(!num[x]){
                count +=1;
                System.out.println(x + 1);
            }
        }    
        System.out.println(count);
     }
}
