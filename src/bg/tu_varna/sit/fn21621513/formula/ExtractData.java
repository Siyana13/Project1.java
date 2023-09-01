package bg.tu_varna.sit.fn21621513.formula;

import bg.tu_varna.sit.fn21621513.types.Reference;

public class ExtractData
{
    private Object data;

    public ExtractData(Object data) {
        this.data = data;
    }

    public Double extractDataInFormula() throws Exception {
        if(data==null) return 0.0;

        try {
            data = new Reference((String) data).returnValueOfCell();
        }catch (Exception ignored){}


        return new StringToNumber(data).dataTypesInFormula();
    }
}
