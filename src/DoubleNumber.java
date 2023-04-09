import java.util.ArrayList;

public class DoubleNumber {
    private ArrayList<Numbers> numbersArrayList;

    public DoubleNumber() {
        this.numbersArrayList = new ArrayList<>();
    }

    public ArrayList<Numbers> getNumbersArrayList() {
        return numbersArrayList;
    }

    public void addDoubleNumber(Numbers numbers)
    {
        this.getNumbersArrayList().add(numbers);
    }


}
