package bg.tu_varna.sit.fn21621513.formula;

public class FormulaCalculation extends FormulaData
{
    private Double result;

    private Object intOrDouble(){
        if(Math.floor(this.result) == this.result)
            return (int)Math.floor(this.result);
        else return this.result;
    }

    public Object doCalculation(String enteredFormula) throws Exception {
        super.extractTheElementsInFormula(enteredFormula);

        switch (super.getOperation()){
            case '+': this.result = super.getFirstData() + super.getSecondData();
                break;
            case '-': this.result = super.getFirstData() - super.getSecondData();
                break;
            case '*': this.result =  super.getFirstData() * super.getSecondData();
            case '/':{
                if(super.getSecondData() != 0) this.result = super.getFirstData()/super.getSecondData();
                else return "ERROR";
            }
            break;
            case '^': this.result = Math.pow(super.getFirstData(),super.getSecondData());
                break;
            default: throw new Exception("Error in calculation!");
        }

        return intOrDouble();
    }
}
