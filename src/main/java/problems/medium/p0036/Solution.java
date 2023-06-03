package problems.medium.p0036;

//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//
//        Each row must contain the digits 1-9 without repetition.
//        Each column must contain the digits 1-9 without repetition.
//        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//        Note:
//
//        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//        Only the filled cells need to be validated according to the mentioned rules.

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i ++){
            if (!checkLines(board, i, 0, 9)) return false;
        }

        for (int i = 0; i < 3; i++) {
            if (!checkLines(board, i, i * 3, 3)) return false;
            for (int j = 0; j < 3; j++){
                if (!checkBox(board, i, j)) return false;
            }
        }

        return true;
    }

    public static boolean checkLines(char[][] board, int num, int start, int size){
        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character> colSet = new HashSet<>();
        for (int i = start; i < start + size; i++){
            if (board[num][i] != '.'){
                if (!rowSet.add(board[num][i])){
                    return false;
                }
            }
            if (board[i][num] != '.'){
                if (!colSet.add(board[i][num])){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkBox(char[][] board, int x, int y) {

        HashSet<Character> boxSet = new HashSet<>();
        for (int i = x * 3; i < x * 3 + 3; i++){
            for (int j = y * 3; j < y * 3 + 3; j++) {
                if (board[i][j] != '.'){
                    if (!boxSet.add(board[i][j])){
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
