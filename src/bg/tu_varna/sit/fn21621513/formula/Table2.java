package bg.tu_varna.sit.fn21621513.formula;

public class Table2 extends RowsAndColumns {
    private RowsAndColumns[][] rows;// двумерен масив в който ще се записват ред и колона (само че не съм сигурна дали трябва да се разширява класа)
    private int maxValue = 1000;

    public Table2(int row, int column, RowsAndColumns[][] rows) {
        super(row, column);
        this.rows = rows;
        this.rows = new RowsAndColumns[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                rows[i][j] = new RowsAndColumns(i, j);// (i+1,j+1)
            }
        }
    }

    public RowsAndColumns getRows(int row, int column) {
        return rows[row][column]; //? [row-1] [column-1]
    }

    public void checkForEmptyRow() {
       /* for (int i = 0; i < rows.length; i++) {// обхожда редовете на текущея ред {
            for (int j = 0; j < rows[i].length; j++) {// обхожда колоните на текущия ред{
                if (rows[i][j] == 0) {
                    rows[i][j] = 0;
                } else if (rows[i][j] > maxValue)
                    rows[i][j] = 0;
            }
        }

        */
        for (int i=0; i< rows.length;i++) {// iterate through rows
        boolean isEmptyRow= true; // assume the row is empty
            for(int j=0;j<rows[i].length; j++)  // iterate through the columns
            {
                if(rows[i][j]!=0) {
                    isEmptyRow = false; // if any non-zero elements is found, the row is empty
                    break;
                }
            }
            if (isEmptyRow)
            {
                for (int j=0; j<rows[i].length;j++)
                {
                    rows[i][j]=0;
                }
            }
        }

    }

}



