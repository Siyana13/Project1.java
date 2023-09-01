package bg.tu_varna.sit.fn21621513.formula;

public class Operation
{
    private final char[] VALID_OPERATIONS={'+','-','*','/','^'};

    public char checkForOperationInFormula(String data){
        for (char operationFormArray:VALID_OPERATIONS) {
            int index = data.indexOf(operationFormArray);
            if(index != -1) return data.charAt(index);
        }
        throw new ArithmeticException("Invalid arithmetic operation!");
    }
}
