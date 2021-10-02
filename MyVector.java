public class MyVector 
{
    public double x;
    public double y;
    public double w;
    
    // Constructor - pass in 3 doubles, set x,y,w
    public MyVector(double x, double y, double w) 
    {
        this.x = x;
        this.y = y;
        this.w = w;
    }

    public double dot(MyVector u) 
    {
        return ((x * u.x) + (y * u.y) + (w * u.w));
    }
}
