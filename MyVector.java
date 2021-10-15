public class MyVector 
{
    public double x;
    public double y;
    public double w;
    
    // Constructor - pass in 3 doubles, for the values of the vector
    public MyVector(double x, double y, double w) 
    {
        this.x = x;
        this.y = y;
        this.w = w;
    }

    // simulates the dot product of two vectors
    public double dot(MyVector u) 
    {
        return ((x * u.x) + (y * u.y) + (w * u.w));
    }
}
