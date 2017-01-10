

/**
 * Write a description of class Color_Lab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Color_Lab
{
    public static void main(String[] args)
    {
        //MaxBlue
        int pixels = p1.getPixels();
        
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setBlue(255);
        }
                
        //MaxRed
        pixels = p2.getPixels();
        
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setRed(255);
        }
        
        //MaxGreen
        pixels = p3.getPixels();
        
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setGreen(255);
        }

        //Negate
        pixels = p4.getPixels();
        
        for (Pixel pixelObj : pixels)
        {
            blue = 255 - pixelObj.getBlue();
            red = 255 - pixelObj.getRed();
            green = 255 - pixelObj.getGreen();
            
            negative = new Color(red,blue,green);
        }
    }
}
