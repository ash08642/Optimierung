
package achtdamenproblem;

public class AchtDamenProblem {
    public static int count = 0;
    public static void main(String[] args) {
        int TD = 8;
        char [][] ChessTable = new char [TD][TD];
        
        
        for(int i = 0; i < TD; i++){
            for(int j = 0; j < TD; j++){
                ChessTable[i][j] = '.';
            }
        }
        Platziere(0, ChessTable);
        System.out.println(count);
    }
    public static boolean threat(int z, int s, char[][] CT){
        for(int i = 0; i < 8; i++){ // TD = 4
            if(CT[z][i] == 'Q' || CT[i][s] == 'Q'){
                return true;
            }
        }
        for(int i = 0; (z + i) < 8 && (s + i) < 8; i++){
             if(CT[z + i][s + i] == 'Q'){
                return true;
            }
        }
        for(int i = 0; (z - i) >= 0 && (s - i) >= 0; i++){
             if(CT[z - i][s - i] == 'Q'){
                return true;
            }
        }
        for(int i = 0; (z - i) >= 0 && (s + i) < 8; i++){
             if(CT[z - i][s + i] == 'Q'){
                return true;
            }
        }
        for(int i = 0; (z + i) < 8 && (s - i) >= 0; i++){
             if(CT[z + i][s - i] == 'Q'){
                return true;
            }
        }
        return false;
    }
    public static void showTable(char[][] ChessTable){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(ChessTable[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void clearTable(char[][] ChessTable){
        for(int i = 0; i < 4; i++){         // TD = 4
            for(int j = 0; j < 4; j++){     // TD = 4
                ChessTable[i][j] = '.';
            }
        }
    }
    public static void Platziere(int a, char[][]ChessTable){
        
        for(int b = 0; b <= 7; b++){     // TD = 4
            if(!threat(a, b, ChessTable)){
                ChessTable[a][b] = 'Q';
                if (a == 7){ // TD = 4
                    showTable(ChessTable);
                    System.out.println();
                    count ++;
                }else{
                    Platziere(a + 1, ChessTable);
                }
                ChessTable[a][b] = '.';
            }
        }
        
    }
}
