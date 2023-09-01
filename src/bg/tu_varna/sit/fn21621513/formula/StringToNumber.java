package bg.tu_varna.sit.fn21621513.formula;

public class StringToNumber
{
    private Object data;

    public StringToNumber(Object data) {
        this.data = data;
    }

    public Double dataTypesInFormula(){
        if (data == null) return 0.0;

        else if (data instanceof String) {
            if (((String) data).startsWith("\"") && ((String) data).endsWith("\""))
                data = ((String) data).substring(1, ((String) data).length()-1);

            if(((String) data).matches("[-+]?\\d*\\.?\\d+"))
                return Double.parseDouble((String) data);
            else return 0.0;
        }
        if(data instanceof Integer)
            return ((Integer) data).doubleValue();
        return (Double) data;
    }
}
