package proj3;

public class Allowance 
{
    private String name;  
    private double[] choreValues;
    public Allowance(String theName, int numChores)
    {
        name = theName;    
        choreValues = new double[numChores];
        for(int i = 0; i < numChores; i++) 
            choreValues[i] = 0.0;
    }
    public String getName()
    {
        return name;
    }
    public void doChore(int whichChore, String level)
    {
        if(level.equals("fair")) 
            choreValues[whichChore] = 0.5;
        else if(level.equals("good"))
            choreValues[whichChore] = 2.0;
        else if(level.equals("excellent"))
            choreValues[whichChore] = 4.0;
    }
    public double getAllowance()
    {
        double sum = 0;
        for(int i = 0; i < choreValues.length; i++)
            sum += choreValues[i];
        return sum; 
    }
    public String toString()
    {
        String str = name + ":";
        for(int i = 0; i < choreValues.length; i++)
            str += " $" + choreValues[i];
        return str; 
    }
}
