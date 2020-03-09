package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < column.length; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        String lastSeen = row[0];
        for (int i = 0; i < 3; i++) {
            if (!lastSeen.equals(row[i]))
                return false;
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        String lastSeen = column[0];
        for (int i = 0; i < 3; i++) {
            if (!lastSeen.equals(column [i]))
                return false;
        }
        return true;
    }

    public String getWinner() {
        return "X";
    }

    public String[][] getBoard() {
        return board;
    }
}
