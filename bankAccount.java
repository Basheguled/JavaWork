
//Guled Bashe
import java.util.Scanner;


class Account{

    private int checkingBalance;
    private int savingBalance;

    Account(int checkingBalance, int savingBalance)
    {
        this.savingBalance = savingBalance;
        this.checkingBalance = checkingBalance;
    }
    Account()
    {
        this.savingBalance = 0;
        this.checkingBalance = 0;
    }

    public void deposit(char accountName, int amount)
    {
        if(accountName == 'c')
        {
            checkingBalance += amount;
        }
        else if(accountName == 's')
        {
            savingBalance += amount;
        }
    }

    public void withdraw(char accountName, int amount)
    {
        if(accountName == 'c')
        {
            checkingBalance -= amount;
        }
        else if(accountName == 's')
        {
            savingBalance -= amount;
        }
    }

    public void getCheckingBalance()
    {
        System.out.println(checkingBalance);
    }


    public void getSavingBalance()
    {
        System.out.println(savingBalance);
    }



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int checking, saving;
        char action;

        System.out.println("Welcome to the online banking application.");
        System.out.println("==========================================");
        System.out.println("What's your starting balance for your checking account: ");
        checking = sc.nextInt();

        System.out.println("What's your starting balance for your savings account: ");
        saving = sc.nextInt();

        Account a1 = new Account(checking,saving);
        while(true)
        {
            System.out.println("Type: 'd' to Deposit money. 'w' to Withdraw money. 'b' to Display Balances. or 'q' to Quit the app.");
            action = sc.next().charAt(0);

            if(action == 'd' || action == 'w')
            {
            System.out.println("'c' for Checking account. 's' for Savings Account.");
            char accountName = sc.next().charAt(0);

            System.out.println("What amount: ");
            int amount = sc.nextInt();


            if(action == 'd')
            {
                a1.deposit(accountName, amount);
            }
            else if(action == 'w')
            {
                a1.withdraw(accountName, amount);
            }
            }

            else if(action == 'b')
            {
                System.out.println("Your checking account balance is: ");
                a1.getCheckingBalance();
                System.out.println("Your savings account balance is: ");
                a1.getSavingBalance();
            }

            else if(action == 'q')
            {
                break;
            }

        }

    }

}
