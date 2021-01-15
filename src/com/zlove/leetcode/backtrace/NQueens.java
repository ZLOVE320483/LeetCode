package com.zlove.leetcode.backtrace;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NQueens {

    static List<List<String>> res = new LinkedList<>();

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }
        backtrace(board, 0);
        return res;
    }

    private static void backtrace(char[][] board, int row) {
        if (row == board.length) {
            convert2List(board);
            return;
        }
        int n = board[row].length;
        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            board[row][col] = 'Q';
            backtrace(board, row + 1);
            board[row][col] = '.';
        }
    }

    private static boolean isValid(char[][] board, int row, int column) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = column + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private static void convert2List(char[][] board) {
        List<String> rowList = new LinkedList<>();
        for (char[] chars : board) {
            StringBuilder builder = new StringBuilder();
            for (char c : chars) {
                builder.append(c);
            }
            rowList.add(builder.toString());
        }
        res.add(rowList);
    }
}
