package Seminar3;

public class First {
        int[][] board;
        List<List<String>> ans = new ArrayList<>(); // list list string -все возможные доски
        // list string - одна доска

        public List<List<String>> solveNQueens(int n) {
            board = new int[n][n];
            backtrack(0);
            return ans;
        }
        private void backtrack(int col) {
            if (col == board.length) {
                addBoard();
                return;
            }
            for (int row = 0; row < board.length; row++) {
                if (canPlace(row, col)) { // значит canPlace(row, col) == true
                    board[row][col] = 1;
                    backtrack(col + 1); // переход к след столбцу
                    board[row][col] = 0;


                }
            }
        }
        private boolean canPlace(int i, int j) {
            // налево идем, меняем столбец
            for (int col = j - 1; col >= 0; col--) {
                if (board[i][col] == 1) return false;
            }
            // вверх по диагонали
            for (int row = i - 1, col = j - 1; row >= 0 && col >= 0; row--, col--) {
                if (board[i][col] == 1) return false;
            }
            // вниз по диагонали
            for(int row = i + 1, col = j - 1; row < board.length && col >= 0; row++, col--) {
                if (board[i][col] == 1) return false;
            }
            return false;
        }
        private void addBoard() {
            List<String> b = new ArrayList<>(); // list string это доска, нужно ее создать
            for (int i = 0; i < board.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 0) {
                        sb.append('.');
                    }
                    else {
                        sb.append('Q'); // создали строку
                    }
                    // чтобы без if else
                    // sb.append(board[i][j] == 0 ? '.':'Q')
// Отступление.. если бы доска была не 4х4, а 4х6, то запись была бы:
//  for (int i = 0; i < board.length; i++) {
//      for (int j = 0; j < board[0].length; j++) {
                }
                b.add(toString()); // загнали строки в доску
            }
            ans.add(b); // добавляем доску

        } // функцию перегоняем в листы
    }
}
