
package greedy;
import java.util.ArrayList;
public class Greedy {

    public static void main(String[] args) {
        //ArrayList<Integer> Wechselgeld = new ArrayList<>();
        //GreedyWechselgeld2(80, Wechselgeld, 0);
        int[] start = {9,  9, 10, 11, 13, 13, 15, 11, 18};
        int[] end  = {11, 10, 13, 12, 17, 15, 17, 20, 20};
        
        BubbleSort(start, end);
        for(int i = 0; i < start.length; i++){
            System.out.println(start[i] + " " + end[i]);
        }
        
        //ArrayList<Integer> Wechselgeld = GreedyWechselgeld(79);
        /*for (int i : Wechselgeld){
            System.out.println(i);
        }*/
        
        int AnzahlDerAktivitat = RaumbelegungsProblem(start, end);
        System.out.println("AnzahlDerAktivitat :" + AnzahlDerAktivitat);
    }
    public static ArrayList<Integer> GreedyWechselgeld(int n){
        int[] geld = {50, 20, 10, 5, 2, 1};
        ArrayList<Integer> Wechselgeld = new ArrayList<>();
        int i = 0;
        while(n != 0){
            if(n >= geld[i]){
                n -= geld[i];
                Wechselgeld.add(geld[i]);
            }else{
                i++;
            }
        }
        return Wechselgeld;
    }
    public static void GreedyWechselgeld2(int n, ArrayList<Integer> arrayList, int index){
        int[] geld = {50, 20, 10, 5, 2, 1};
        if(n == 0){
        }else if(n >= geld[index]){
            arrayList.add(geld[index]);
            //System.out.println(geld[index]);
            n -= geld[index];
            GreedyWechselgeld2(n, arrayList, index);
        }else{
            index++;
            GreedyWechselgeld2(n, arrayList, index);
        }
    }
    public static int RaumbelegungsProblem(int[] start, int[] end){
        BubbleSort(start, end);
        int count = 1;
        int i = 0;
        int k = 1;
        while(k < start.length){
            if(end[i] <= start[k]){
                count++;
                i = k;
                k++;
            }else{
                k++;
            }
        }
        return count;
    }
    public static void BubbleSort(int[] startarray, int[]endarray){
        boolean stillSorting = true;
        while(stillSorting){
            stillSorting = false;
            for(int i = 0; i < endarray.length - 1; i++){
                if(endarray[i] > endarray[i+1]){
                    int temp = endarray[i];
                    endarray[i] = endarray[i+1];
                    endarray[i+1] = temp;
                    
                    temp = startarray[i];
                    startarray[i] = startarray[i+1];
                    startarray[i+1] = temp;
                    
                    stillSorting = true;
                }
            }
        }
    }
    
}
