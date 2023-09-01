package bg.tu_varna.sit.fn21621513.cmd;

import bg.tu_varna.sit.fn21621513.table.Row;
import bg.tu_varna.sit.fn21621513.table.Table;

public class Print
{
    private int maxRows =0;

    private String printString(String str){
        str = str.substring(1, str.length() - 1);
        return str.replace("\\", "");
    }

    public void printTable() {
        Table table = Table.getInstance();
        if(table.getTable().get(0) == null) {
            System.out.println("The table is empty!");
            return;
        }

        for (int i = 0; i < table.getTable().size(); i++) {
            if(table.getTable().get(i) == null) continue;
            if(table.getTable().get(i).getLengthOfRow() > maxRows)
                maxRows = table.getTable().get(i).getLengthOfRow();
        }

        for (int i = 0; i < table.getTable().size(); i++) {
            Row row = table.getTable().get(i);

            for (int j = 0; j < maxRows; j++) {
                if (row == null || row.getLengthOfRow() <= j || row.getCell(j) == null) System.out.print("|\t");
                else if (row.getCell(j) instanceof String)
                    System.out.print(this.printString((String) row.getCell(j)) + "|\t");
                else System.out.print(row.getCell(j) + "|\t");
            }
            System.out.println();
        }
    }
}
