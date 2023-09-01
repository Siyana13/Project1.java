package bg.tu_varna.sit.fn21621513.formula;

public class FormulaData
{
    private Double firstData;
    private char operation;
    private Double secondData;

    public Double getFirstData() {
        return firstData;
    }

    public char getOperation() {
        return operation;
    }

    public Double getSecondData() {
        return secondData;
    }

    private void setFirstData(Object firstData) throws Exception {
        this.firstData = new ExtractData(firstData).extractDataInFormula();
    }

    private void setOperation(String enteredFormula) throws Exception {
        this.operation =new Operation().checkForOperationInFormula(enteredFormula);
    }

    private void setSecondData(Object secondData) throws Exception {
        this.secondData = new ExtractData(secondData).extractDataInFormula();
    }


    public void extractTheElementsInFormula(String enteredFormula) throws Exception {
        setOperation(enteredFormula);
        setFirstData(enteredFormula.substring(1, enteredFormula.indexOf(this.operation)));
        setSecondData(enteredFormula.substring(enteredFormula.indexOf(this.operation) + 1)); 
    }
}
