
public class Clock
{
    private Digit hour;
    private Digit mint;
    String time;
    public Clock()
    {
        hour=new Digit(24);
        mint=new Digit(60);
    }
    public void setTime(int h, int m)
    {
        hour.setValue(h);
        mint.setValue(m);
        updateTime();
    }
    public void tick()
    {
        mint.increment();
        if(mint.getValue()==0)
        hour.increment();
        
        updateTime();
    }
    
    public void updateTime()
    {
        time=" "+hour.getValue()+":"+mint.getValue();
    }
    public String displayClock()
    {
   return(time);
    }
    
}
