import java.util.Scanner;
public class chp_4pratice {
    public static void main(String[] args) {
        //Question-1
        /*int a = 10;
        if(a==11){
            System.out.println("i am 11");
        }
        else{
            System.out.println("i am not 11");
        */

        //---------------------------------------------------

        //Question-2
        /*float a,b,c,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of physice");
        a = sc.nextFloat();
        System.out.println("Enter your marks of chemistry");
        b = sc.nextFloat();
        System.out.println("Enter your marks of maths");
        c = sc.nextFloat();
        total = a+b+c/3;
        System.out.println("your total marks is"+total);
        if(total>=40 && a>=33 && b>=33 && c>=33)
        {
            System.out.println("Congratualtion you are passed");
        } 
        else{
            System.out.println("Sorry you are falied");
        }
        */

        //---------------------------------------------------

        //Question-3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        float income = sc.nextFloat();
        double tax= 0;
        if(income>2.5 && income<=5)
        {
            tax = tax + 0.05 *(income - 2.5);  
        }
        else if(income>5 && income<10)
        {
            tax = tax + 0.05 *(5 - 2.5); 
            tax = tax + 0.2 *(income - 2.5);   
        }
        else if(income>=10)
        {
            tax = tax + 0.05 *(5 - 2.5); 
            tax = tax + 0.2 *(10 - 2.5); 
            tax = tax + 0.3 *(income - 2.5); 
        }
        System.out.println("The total tax is paid by the employee is"+tax);
        */
        //---------------------------------------------------
        int day;
        System.out.println("Enter the date ");
       try( Scanner sc = new Scanner(System.in)){
        day = sc.nextInt();
       }
        switch(day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
           
        }
        System.out.println("The day of your given date is"+day);
             
    }
    
}
