
package fibonanchidynamic;

public class FibonanchiDynamic {

    static int[] fib = new int[100];
    
    public static void main(String[] args) {
        System.out.println(AdvancedFibonanchi(40));
    }
    public static int DynamicFibonanchi(int n){
        return n;
    }
    public static int AdvancedFibonanchi(int n){
        int f;
        for(int k = 0; k <= n; k ++){
            if(k == 0){
                f = 0;
            }else if( k <= 2){
                f = 1;
            }else{
                f = fib[k - 1] + fib[k - 2];
            }
            fib[k] = f;
        }
        return fib[n];
    }
}
