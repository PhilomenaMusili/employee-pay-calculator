import java .util.Scanner;
public class Employ {
    public static void main(String[]args)
    {
        double noHours, rateOfPay=450.50, grossPay, withholdingTax, netPay;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the number of hours worked: ");
        noHours= stdin.nextDouble();
        grossPay= noHours*rateOfPay;
        withholdingTax= grossPay* 0.2;
        netPay= grossPay- withholdingTax;
        
        System.out.println("Number of hours worked: "+ noHours );
        System.out.println("Rate of pay per hour: "+ rateOfPay );
        System.out.println("Gross pay: "+ grossPay );
        System.out.println("Withholding tax: "+ withholdingTax );
        System.out.println("Net pay: "+ netPay );


    }
    
}
