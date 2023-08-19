package bg.tu_varna.sit.fn21621513.txt;

import bg.tu_varna.sit.fn21621513.dataTypes;
import bg.tu_varna.sit.fn21621513.table.Table;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Open
{
    public void open(String pathFile) throws Exception {
        File file = new File(pathFile);

        if (file.exists()) {
            Table table = Table.getInstance();

            FileReader fileReader = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fileReader);

            String rows;
            while((rows=br.readLine()) != null){//проверка дали сме стигнали края на документа
                String[] row = rows.split(",");//записваме всички клетки разделени със ,
                ArrayList<Object> cells = new ArrayList<>();//нов временен масив
                for (String cell:  row)//цикъл за преход през всички клетки
                    cells.add(new dataTypes().checkDataTypes(cell));//превръщане на стринг прочетената клетка в сътветния тип
                table.addRowInTable(cells);//запазване на временния масив като нов ред в таблицата
            }
            br.close();
        }
    }
}
