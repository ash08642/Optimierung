
package egyptionmultiplication;


public class EgyptionMultiplication {

    public static void main(String[] args) {
        System.out.println("Result is: " + egyptionMultiplication(2,2));
    }
    
    public static int egyptionMultiplication(int a, int b){
        int c = 0;
        if(a == 0){
            return c;
        }else if(a%2 == 1 && a != 1){
            System.out.print("links: " + a);
            System.out.print("  reechte: " + b);
            System.out.print("  zu addieren: " + b);
            System.out.println();
            a = a/2;
            c = b;
            b = b * 2;
            return c + egyptionMultiplication(a, b);
        }else if(a%2 == 0){
            System.out.print("links: " + a);
            System.out.print("  reechte: " + b);
            System.out.println();
            a = a/2;
            b = b * 2;
            return c + egyptionMultiplication(a, b);
        }else {
            System.out.print("links: " + a);
            System.out.print("  reechte: " + b);
            System.out.print("  zu addieren: " + b);
            System.out.println();
            c = b;
            a = 0;
            return c + egyptionMultiplication(a, b);
        }
        
    }
       

}
