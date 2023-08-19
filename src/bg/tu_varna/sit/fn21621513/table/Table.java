package bg.tu_varna.sit.fn21621513.table;

import java.util.ArrayList;
public class Table
{
        private static Table instance;
        private ArrayList<ArrayList<Object>> table;

        private Table() {
            this.table = new ArrayList<>();
        }

        public static Table getInstance() {
            if (instance == null) instance = new Table();
            return instance;
        }

        public static void setInstance(Table instance) {
            Table.instance = instance;
        }

        public void addRowInTable(ArrayList<Object> newRow) {
            table.add(newRow);
        }

        public ArrayList<ArrayList<Object>> getTable() {
            return table;
        }
    }

