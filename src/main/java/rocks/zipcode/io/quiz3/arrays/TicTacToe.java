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
        if (rowWinner() != null)
            return rowWinner();
        else if (columnWinner() != null)
            return columnWinner();
        else
            return diagonalWinner();
    }

    public String rowWinner(){
        for (int i = 0; i < 2; i++) {
            String[] row = getRow(i);
            String lastSeen = row[i];
            if (row[0].equals(row[1]) && row[1].equals(row[2]))
                return lastSeen;
        }
        return null;
    }

    public String columnWinner(){
        for (int i = 0; i < 2; i++) {
            String[] col = getColumn(i);
            String lastSeen = col[i];
            if (col[0].equals(col[1]) && col[1].equals(col[2]))
                return lastSeen;
        }
        return null;
    }

    public String diagonalWinner(){
        if (getRow(0)[0].equals(getRow(1)[1]) && getRow(2)[2].equals(getRow(1)[1]))
            return getRow(0)[0];
        else if (getRow(0)[2].equals(getRow(1)[1]) && getRow(1)[1].equals(getRow(2)[0]))
            return getRow(0)[2];
        else
            return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
