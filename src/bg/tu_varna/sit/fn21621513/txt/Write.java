package bg.tu_varna.sit.fn21621513.txt;

import bg.tu_varna.sit.fn21621513.table.Table;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Write
{
    public void write(String pathFile) throws IOException {
        Table table = Table.getInstance();
        File file = new File(pathFile);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        for (int i = 0; i < table.getTable().size(); i++) {
            ArrayList<Object> row = table.getTable().get(i);//масив от клетките на един ред
            for (int j = 0; j < row.size(); j++) {
                bw.write(row.get(j).toString());//запис на текуща клетка
                if (j+1 != row.size()) bw.write(",");//разделител ако не сме стигнали последния елемент
            }
            bw.newLine(); // Запис на нов ред след всяка редица
        }
        bw.close();
    }
}
