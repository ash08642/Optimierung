
package rucksackproblem;

public class RuckSackProblem {
    
    static int[][] obj = {{2, 2, 6, 5, 4} ,{6, 3, 5, 4, 6}};

    public static void main(String[] args) {
        //int[][] objekts = {{2, 2, 6, 5} ,{6, 3, 5, 4}};
        //System.out.println(objekts[0][0]);
        //System.out.println(Rucksack(0, 10));
        System.out.println(DynamicRucksack(5, 10));
    }
    public static int max(int a, int b){
        if(a < b){
            return b;
        }else {
            return a;
        }
    }
    public static int Rucksack(int i, int kapazitat){
        int[][] objekts = {{2, 2, 6, 5} ,{6, 3, 5, 4}};
        if(i == 3){
            if(kapazitat < objekts[0][i]){
                return 0;
            }else{
                return objekts[1][i];
            }
        }
        if(kapazitat < objekts[0][i]){
                return Rucksack(i+1, kapazitat);
        }
        return max(
                    Rucksack(i+1, kapazitat),
                    Rucksack(i+1, kapazitat - objekts[0][i]) + objekts[1][i]
                    );
    }
    public static int DynamicRucksack(int n, int C){
        int rc;
        int[][] f = new int [n][C + 1];
        for(rc = 0; rc <= C; rc++){
            if( rc < obj[0][n - 1]){
                f[n-1][rc] = 0;
            }else{
                f[n-1][rc] = obj[1][n - 1];
            }
        }
        for(rc = 0; rc <= C; rc++){
        for(int i = n - 2; i >= 0; i--){
            if( rc < obj[0][i]){
                f[i][rc] = f[i + 1][rc];
            }else{
                f[i][rc] = max(f[i + 1][rc], f[ i + 1][rc - obj[0][i]] + obj[1][i]);
            }
        }
        }
        rc--;
        for(int j= n-1; j>= 0; j--){
            for(int k=0;k<=rc;k++){
                System.out.print(f[j][k] + " ");
            }
            System.out.println();
        }
        return f[0][C];
    }
}
