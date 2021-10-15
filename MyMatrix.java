// 3x3 : 2d transforms
public class MyMatrix 
{
    public MyVector row[];

    // Constructor for a 3x3 matrix consisting of doubles
    public MyMatrix(double x1, double y1, double w1, double x2, double y2, double w2, double x3, double y3, double w3)
    {
        // 3x3 matrix consists of 3 vector objects
        row = new MyVector[3];
        row[0] = new MyVector(x1, y1, w1);
        row[1] = new MyVector(x2, y2, w2);
        row[2] = new MyVector(x3, y3, w3);
    }

    // simulates the process of scaling a matrix by a vector u
    MyVector multiply(MyVector u) {
        double x_dash = row[0].dot(u);
        double y_dash = row[1].dot(u);
        double w_dash = row[2].dot(u);
        return new MyVector(x_dash, y_dash, w_dash);
    }

}