package bg.tu_varna.sit.fn21621513.formula;

public class StringToNumber {
    private String number;

    public String getNumber() {
        return number;
    }

    public void convertIntoInt() {
        int numberInt = Integer.parseInt(getNumber());
        System.out.println("Конвертирано до int число:" + numberInt);
    }

    public void convertStringToDouble() {
        try {
            double numberDouble = Double.parseDouble(getNumber());
            System.out.println("Конвертирано до double число:" + numberDouble);
        } catch (NumberFormatException e) {
            System.out.println("Невалидно число! Резултата е: 0");
        }
    }
}
