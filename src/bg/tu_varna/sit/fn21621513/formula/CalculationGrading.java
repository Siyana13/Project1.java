package bg.tu_varna.sit.fn21621513.formula;

public class CalculationGrading
{
    private int base;
    private int exponent;

    public void Calculate() {
       /* if (number. startsWith("=")){// startsWith работи със стринг {
            String numbers = null;
            String[] arrayNumbers = numbers.split("\\+"); // разделяне по +
            for (String num : arrayNumbers) {
                try {
                    double value = Double.parseDouble(num); // преобразуване от стринг в число
                } catch (NumberFormatException e) {
                    System.out.println("Грешка! Невалидно число:" + num);
                }
            }
            System.out.println(Math.pow(Double.parseDouble(number),2));
        }
    }*/
        try {
            System.out.println(Math.pow(base, exponent));
        } catch (NumberFormatException e) {
            System.out.println("Грешка!");
            throw new RuntimeException(e);
        }
    }
}
