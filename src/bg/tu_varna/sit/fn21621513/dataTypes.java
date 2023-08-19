package bg.tu_varna.sit.fn21621513;

public class dataTypes
{
    public Object checkDataTypes(String data) throws Exception {
        boolean hasPoint = false;
        boolean hasSign = false;
        boolean isNumber = false;


        if (data.charAt(0) == '=') ; //ако е формула върни тип от клас формула??

        else if (data.charAt(0) == '+' || data.charAt(0) == '-'){//започва със знак
            hasSign = true;
            if(data.charAt(1) == 46) throw new Exception("Невалидно число!");//ако започва със знак и след това .
        }

        if (data.charAt(0) >= 48 || data.charAt(0) <= 57 || hasSign) {  //  започва с число от 0-9 или знак
            for (int i = 1; i < data.length(); i++) {//провери всички символи без първия
                isNumber = true;//винаги да е число
                if (data.charAt(i) >= 48 || data.charAt(i) <= 57) ;//ако е число продължи
                else if (data.charAt(i) == 46 && !hasPoint)
                    hasPoint = true;//ако е точка и до сега не е имало точка продължи
                else {
                    isNumber = false;//вече не е число
                    break;//ако се среща точка за втори път или е друг символ излез
                }
            }
            if(isNumber && hasPoint) return(Double.parseDouble(data));//върни дабъл ако е число и има открита точка
            else if(isNumber) return (Integer.parseInt(data));
        }

        return data;//клетката съдържа само стрингова стойност
    }
}
