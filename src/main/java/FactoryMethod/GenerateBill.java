/**
 * Created by udaka on 7/14/16.
 */
package FactoryMethod;
import java.io.*;


public class GenerateBill {
    public static void main(String[] args) throws IOException{

        GetPlanFactory planFactory = new GetPlanFactory();
        //get the bill type
        System.out.println("Enter the name of plans for the Bill generating: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();

        //get number of units
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());


        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);



    }
}
