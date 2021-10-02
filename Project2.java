
// Create Matrix based on the three multiplied transformation matrix (using calculator)

// load inputImage
// create outputImage
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class Project2
{    
    public static void main(String[]  args)
    {
        BufferedImage inputImage = null;
        BufferedImage outputImage = null;
        try
        {
            inputImage = ImageIO.read(new File ("picture.jpg"));
            outputImage = ImageIO.read(new File ("picture.jpg"));
        } catch (IOException e) {}

        MyMatrix translateMatrix = new MyMatrix(0.3535, -0.3535, 277.5736, 0.3535, 0.3535, 16.1522, 0, 0, 1);
        for (int y = 0; y < inputImage.getHeight(); y++)
        {
            for (int x = 0; x < inputImage.getWidth(); x++) 
            {
                // Create a new vector
                MyVector v = new MyVector(x, y, 1.0);
                
                MyVector v_dash = translateMatrix.multiply(v);
                
                int x_dash = (int)v_dash.x;
                int y_dash = (int)v_dash.y;

                if (x_dash < 0) 
                    x_dash = 0;
                else if(x_dash >= inputImage.getWidth())
                    x_dash = inputImage.getWidth()-1;

                if (y_dash < 0) 
                    y_dash = 0;
                else if(y_dash >= inputImage.getHeight())
                    y_dash = inputImage.getHeight()-1;

                outputImage.setRGB(x,y, inputImage.getRGB(x_dash, y_dash));
            }
        }

        try
        {
            File outputFile = new File("newPicture.jpg");
            ImageIO.write(outputImage, "jpg", outputFile);
        } catch (IOException e) {}
    }

}