public class Numbers
{public int number;
    public int negativeNumber;
    public int positiveNumber;
    public double doublePositiveNumber;
    public double doubleNegativeNumber;
    public double doubleNumber;

    public Numbers(int number, int negativeNumber, int positiveNumber, double doublePositiveNumber, double doubleNegativeNumber, double doubleNumber) {
        this.number = number;
        this.negativeNumber = negativeNumber;
        this.positiveNumber = positiveNumber;
        this.doublePositiveNumber = doublePositiveNumber;
        this.doubleNegativeNumber = doubleNegativeNumber;
        this.doubleNumber = doubleNumber;
    }

    public int getNumber() {
        return number;
    }

    public int getNegativeNumber() {
        return negativeNumber;
    }

    public int getPositiveNumber() {
        return positiveNumber;
    }

    public double getDoublePositiveNumber() {
        return doublePositiveNumber;
    }

    public double getDoubleNegativeNumber() {
        return doubleNegativeNumber;
    }

    public double getDoubleNumber() {
        return doubleNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getNumber()+ this.getNegativeNumber()+this.getPositiveNumber());
    }
}
