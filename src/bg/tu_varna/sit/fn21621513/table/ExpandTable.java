package bg.tu_varna.sit.fn21621513.table;

public class ExpandTable
{
    private final Table table;

    public ExpandTable() {
        this.table = Table.getInstance();
    }

    public void addNewRowsAndCells(int row, int col) {

        while (table.getTable().size() < row) {
            table.addRowInTable(null);
        }

        if (table.getTable().get(row - 1) == null) {
            Row tempRow = new Row();
            for (int i = 0; i < col; i++) {
                tempRow.addCell(null);
            }
            table.getTable().set(row - 1, tempRow);
        } else
            while (table.getTable().get(row - 1).getLengthOfRow() < col)
                table.getTable().get(row - 1).addCell(null);
    }
}
