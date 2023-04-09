import java.util.ArrayList;

public class IntegerNumber
{
   private ArrayList<Numbers> numbers;

   public IntegerNumber() {
      this.numbers = new ArrayList<>();

   }
   public ArrayList<Numbers> getNumbers() {
      return numbers;}

   public void addNumbers(Numbers number)
   {
    this.getNumbers().add(number);
   }

   private String printNumbers()
   {
      StringBuilder print= new StringBuilder();
      for (Numbers numbers1:numbers)
      {
         print.append(checkNumbers());
      }
      return print.toString();
   }

   private String checkNumbers()
   {
      char positiveSign=43;
      char negativeSign=45;
      for (Numbers number: numbers)
      {
         if (numbers.contains(positiveSign))
            System.out.println(number);
         else
         {
            System.out.println(number);
         }
      }
      return printNumbers();
   }
}
