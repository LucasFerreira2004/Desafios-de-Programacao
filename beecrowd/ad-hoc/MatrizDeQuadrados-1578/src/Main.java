//Accepted!
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
class pair{
    private int  first;
    private BigInteger  second;
    public pair(int first, BigInteger second){
        this.first = first;
        this.second = second;
    }
    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public BigInteger getSecond() {
        return second;
    }

    public void setSecond(BigInteger second) {
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nMatrizes = 3;
        while(n-- > 0){
            int ordem = sc.nextInt();
            pair[][] matriz = new pair[ordem][ordem];
            for (int i=0; i<ordem; i++){
                for (int j=0; j<ordem; j++){
                    BigInteger bigNum = new BigInteger(sc.next());
                    bigNum = bigNum.pow(2);
                    matriz[i][j] = new pair(String.valueOf(bigNum).length(), bigNum);
                }
            }
            System.out.println("Quadrado da matriz #" + ++nMatrizes + ":");
            for (int c=0; c<ordem; c++){
                int biggestNumLength = 0;
                for (int l=0; l<ordem; l++){
                    if (matriz[l][c].getFirst() > biggestNumLength) biggestNumLength = matriz[l][c].getFirst();
                }
                for (int l=0; l<ordem; l++){
                    matriz[l][c].setFirst(biggestNumLength - matriz[l][c].getFirst());
                }
            }
            for (int i=0; i<ordem; i++){
                for (int j=0; j<ordem; j++){
                    int spaces = matriz[i][j].getFirst();
                    while (spaces-- > 0){
                        System.out.print(" ");
                    }
                    System.out.print(matriz[i][j].getSecond());
                    if (j != ordem-1) System.out.print(" ");
                }
                System.out.println();
            }
           if (n != 0) System.out.println();
        }
    }
}