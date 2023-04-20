import java.util.Scanner;
class Bank
 {
    int id;
    String pass;
    long bal;
    Scanner s=new Scanner(System.in);
    void open()
     {  
        System.out.println("Enter Id : ");
        id=s.nextInt();
        System.out.print("Enter password : ");
        pass=s.next();
        System.out.print("Enter balance : ");
        bal=s.nextLong();
        System.out.println("Account Open!");
     }
     void check()
      {
        int user;
        String key;
        System.out.print("Enter id : ");
        user =s.nextInt();
        System.out.print("Enter password : ");
        key=s.next();
        if(user==id &&  pass.equals(key))
         {
            System.out.println("Balance : "+bal);
         }
         else
          {
            System.out.println("INCORRECT ID OR PASS!!");
          }
      }
      void Withdraw()
      {
        int user;
        String key;
        System.out.print("Enter id : ");
        user =s.nextInt();
        System.out.print("Enter password : ");
        key=s.next();
        if(user==id &&  pass.equals(key))
         {
            long amt;
            System.out.print("Enter amount to be withdrawn : ");
            amt=s.nextLong();
            if(bal>=amt)
             {
               bal=bal-amt;  
               System.out.println("Amount successfully withdrawn !!");
               System.out.println("New Balance : "+bal);
             } 
             else
              {
                System.out.println("INSUFFICIENT BALANCE !!!");
              }
         }
         else
          {
            System.out.println("INCORRECT ID OR PASS!!");
          }
      }
      void Deposit()
      {
        int user;
        String key;
        System.out.print("Enter id : ");
        user =s.nextInt();
        System.out.print("Enter password : ");
        key=s.next();
        if(user==id &&  pass.equals(key))
         {
            long amt;
            System.out.print("Enter amount to be deposited : ");
            amt=s.nextLong();
            bal=bal+amt;  
            System.out.println("Amount successfully Depositied !!");
            System.out.println("New Balance : "+bal);
         }
         else
          {
            System.out.println("INCORRECT ID OR PASS!!");
          }
      }
      public static void main(String a[])
       {
           Bank b=new Bank();
           b.open();
           b.check();
           b.Withdraw();
           b.Deposit();
       }
 }
