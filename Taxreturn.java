/**
   A tax return of a taxpayer in 1992.
*/
public class TaxReturn
{  
   /**
      Constructs a TaxReturn object for a given income and 
      marital status.
      @param anIncome the taxpayer income
      @param aStatus either SINGLE or MARRIED
   */   
   public TaxReturn(double anIncome, int aStatus)
   {  
      income = anIncome;
      status = aStatus;
   }

   public double getTax()
   {  
      double tax = 0;

      if (status == SINGLE)
      {  
         if (income <= SINGLE_BRACKET1)
            tax = RATE1 * income;
         else if (income <= SINGLE_BRACKET2)
            tax = RATE2 * income;
         else if (income <= SINGLE_BRACKET3)
             tax = RATE3 * income;
         else if (income <= SINGLE_BRACKET4)
             tax = RATE4 * income;
         else if (income <= SINGLE_BRACKET5)
             tax = RATE5 * income;
         else
            tax = RATE6 * income;
      }
      else if (status == MARRIED)
      {  
         if (income <= MARRIED_BRACKET1)
            tax = RATE1 * income;
         else if (income <= MARRIED_BRACKET2)
            tax = RATE2 * income;
         else if (income <= MARRIED_BRACKET3)
            tax = RATE3 * income;
         else if (income <= MARRIED_BRACKET4)
             tax = RATE4 * income;
         else if (income <= MARRIED_BRACKET5)
             tax = RATE5 * income;
         else
            tax = RATE6 * income;

      }
 else if (status == MARRIEDSEPARATE)
      {
     if (income <= MARRIEDSEPARATE_BRACKET1)
         tax = RATE1 * income;
     else if (income <= MARRIEDSEPARATE_BRACKET2)
         tax = RATE2 * income;
     else if (income <= MARRIEDSEPARATE_BRACKET3)
         tax = RATE3* income;
     else if (income <= MARRIEDSEPARATE_BRACKET4)
         tax = RATE4 * income;
     else if (income <= MARRIEDSEPARATE_BRACKET5)
         tax = RATE5 * income;
     else
         tax = RATE6 * income;
 }
 else if (status == HEADOFHOUSEHOLD)
     if (income<= HEADOFHOUSEHOLD_BRACKET1)
         tax = RATE1 * income;
       else if(income <= HEADOFHOUSEHOLD_BRACKET2)
          tax = RATE2 * income;
       else if(income <= HEADOFHOUSEHOLD_BRACKET3)
          tax = RATE3 * income;
       else if(income <= HEADOFHOUSEHOLD_BRACKET4)
          tax = RATE4 * income;
       else if(income <= HEADOFHOUSEHOLD_BRACKET5)
          tax = RATE5 * income;
      else
          tax = RATE6 * income;

      return tax;
   }

   public static final int SINGLE = 1;
   public static final int MARRIED = 2;
   public static final int MARRIEDSEPARATE = 3;
   public static final int HEADOFHOUSEHOLD = 4;

   private static final double RATE1 = 0.10;
   private static final double RATE2 = 0.15;
   private static final double RATE3 = 0.25;
   private static final double RATE4 = 0.28;
   private static final double RATE5 = 0.33;
   private static final double RATE6 = 0.35;

   private static final double SINGLE_BRACKET1 = 21450;
   private static final double SINGLE_BRACKET2 = 51900;
   private static final double SINGLE_BRACKET3 = 82400;
   private static final double SINGLE_BRACKET4 = 171850;
   private static final double SINGLE_BRACKET5 = 373650;

   private static final double MARRIED_BRACKET1 = 35800;
   private static final double MARRIED_BRACKET2 = 86500;
   private static final double MARRIED_BRACKET3 = 137300;
   private static final double MARRIED_BRACKET4 = 209250;
   private static final double MARRIED_BRACKET5 = 373650;

   private static final double MARRIEDSEPARATE_BRACKET1 = 8375;
   private static final double MARRIEDSEPARATE_BRACKET2 = 34000;
   private static final double MARRIEDSEPARATE_BRACKET3 = 68650;
   private static final double MARRIEDSEPARATE_BRACKET4 = 104625;
   private static final double MARRIEDSEPARATE_BRACKET5 = 186825;

   private static final double HEADOFHOUSEHOLD_BRACKET1 = 11950;
   private static final double HEADOFHOUSEHOLD_BRACKET2 = 45550;
   private static final double HEADOFHOUSEHOLD_BRACKET3 = 117650;
   private static final double HEADOFHOUSEHOLD_BRACKET4 = 190550;
   private static final double HEADOFHOUSEHOLD_BRACKET5 = 373650;

   private double income;
   private int status;
}
