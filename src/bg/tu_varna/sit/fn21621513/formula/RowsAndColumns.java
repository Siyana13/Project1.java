package bg.tu_varna.sit.fn21621513.formula;

public class RowsAndColumns {
    private int row = 1;
    private int column = 1;

    public RowsAndColumns(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String getTableAndColumns(int row, int column) {
        return ("R" + this.row + "C" + this.column);
    }
}
