package proj3;

public class AllowanceApp 
{
    public static void main(String[] args)
    {
        Allowance kid = new Allowance("Sally", 5);
        double total;
        kid.doChore(0, "good");
        kid.doChore(1, "fair");
        kid.doChore(2, "fair");
        kid.doChore(3, "fair");
        kid.doChore(4, "good");
        System.out.println(kid);
        total = kid.getAllowance();
        if(total > 14)
            System.out.println(kid.getName() + " has met the allowance goal.");
        else
            System.out.println(kid.getName() + " has not met the allowance goal.");
        
        for(int i = 0; i < 5; ++i) {
        	System.out.println(kid.toString());
        }
    }
}