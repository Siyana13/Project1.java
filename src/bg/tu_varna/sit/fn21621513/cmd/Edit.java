package bg.tu_varna.sit.fn21621513.cmd;

import bg.tu_varna.sit.fn21621513.exception.UnknownDataType;
import bg.tu_varna.sit.fn21621513.table.ExpandTable;
import bg.tu_varna.sit.fn21621513.table.Table;
import bg.tu_varna.sit.fn21621513.types.DataTypes;
import bg.tu_varna.sit.fn21621513.types.Reference;

public class Edit
{
    private final Reference reference;
    private final String newData;

    public Edit(String reference, String newData){
        this.reference = new Reference(reference);
        this.newData = newData;
    }

    public void editDataInTable() throws Exception {
        Table table = Table.getInstance();

        new ExpandTable().addNewRowsAndCells(reference.getRow(), reference.getCell());
        try {
            table.getTable().get(reference.getRow() - 1).setCell(reference.getCell() - 1, new DataTypes().checkDataTypes(this.newData));
        } catch (UnknownDataType msg) {
            throw new Exception(msg.getMessage() + " in row " + reference.getRow() + " col " + reference.getCell() + "!");
        }
    }
}
