/*item_num = [101,102,103];
item_name = [Milk,Cheese,Butter,Paneer];
item_qnt = [10,20,32];
item_price = [20,50,60];*/


import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No. Of Item : ");
        int item_num = in.nextInt();
        System.out.println("Enter Quantity : ");
        int item_qnt = in.nextInt();
        int or_qnt = 0;
    
        double amt = 0.0;
        
        switch(item_num)
        {
            case 101:
                 or_qnt = 10;
                if(item_qnt<10)
                {
                    amt = item_qnt*20;
                    System.out.println(String.format("%.1f",amt)+" INR");
                    System.out.println(10-item_qnt+" LEFT");
                }
                else{
                    System.out.println("No STOCK");
                    System.out.println(or_qnt+" LEFT");
                }
            break;
            
            
            case 102:
                 or_qnt = 20;
                if(item_qnt<20)
                {
                    amt = item_qnt*50;
                    System.out.println(String.format("%.1f",amt)+" INR");
                    System.out.println(20-item_qnt+" LEFT");
                }
                else{
                    System.out.println("No STOCK");
                    System.out.println(or_qnt+" LEFT");
                }
            break;
            
            
            case 103:
                 or_qnt = 32;
                if(item_qnt<32)
                {
                    amt = item_qnt*60;
                    System.out.println(String.format("%.1f",amt)+" INR");
                    System.out.println(32-item_qnt+" LEFT");
                }
                else{
                    System.out.println("No STOCK");
                    System.out.println(or_qnt+" LEFT");
                }
            break;
            
            default:
            System.out.println("Invalid Key");
            break;
            
        }
        
    }
}
