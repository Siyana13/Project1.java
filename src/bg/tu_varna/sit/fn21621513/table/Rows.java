package bg.tu_varna.sit.fn21621513.table;

import java.util.ArrayList;
import java.util.List;

public class Rows
{
    private List<List<String>> rows;

    public Rows() {
        this.rows = new ArrayList<>();
    }

    public void addRows(List<String> row)
    {
        rows.add(row);
    }
}
