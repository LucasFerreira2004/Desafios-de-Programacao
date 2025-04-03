package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        Solution solution = new Solution();
        solution.isValidSudoku(board);

    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, ArrayList<Pair<Integer, Integer>>> charPositions = new HashMap<>();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] != '.'){
                    charPositions.putIfAbsent(board[i][j], new ArrayList<>());
                    ArrayList<Pair<Integer, Integer>> positions = charPositions.get(board[i][j]);
                    positions.add(new Pair(i, j));
                    charPositions.put(board[i][j], positions);
                }
            }
        }

        for(HashMap.Entry<Character, ArrayList<Pair<Integer, Integer>>> entry : charPositions.entrySet()){
            System.out.print(entry.getKey() + ": ");
            for(Pair<Integer, Integer> position : entry.getValue()){
                System.out.print("[");
                System.out.print(position.getFirst() +", "+ position.getSecond());
                System.out.print("]");
            }
            System.out.println();
        }
        return true;
    }

    public boolean isValidRow(char[] row){
        for (int i = 0; i < row.length; i++){}
        return true;
    }
}

class Pair<A, B> {
    private final A first;
    private final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() { return first; }
    public B getSecond() { return second; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}