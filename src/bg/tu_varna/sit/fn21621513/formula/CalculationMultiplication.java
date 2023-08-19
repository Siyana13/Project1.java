package bg.tu_varna.sit.fn21621513.formula;

public class CalculationMultiplication
{
    private String number;

    public String getNumber() {return number;}

    public void Calculate() {
        if (number. startsWith("=")){// startsWith работи със стринг {
            String numbers = null;
            String[] arrayNumbers = numbers.split("\\+"); // разделяне по +
            int sum = 0;
            for (String num : arrayNumbers) {
                try {
                    float value = Float.parseFloat(num); // преобразуване от стринг в число
                    sum *= value;
                } catch (NumberFormatException e) {
                    System.out.println("Грешка! Невалидно число:" + num);
                }
            }
            System.out.println("Резултата е:"+ sum);
        }
    }
}

