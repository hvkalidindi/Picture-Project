/**  * Kevin Hayes  
* Test Picture Classes  
*
* @author (Kevin Hayes)  
* @version (10-19-2016)
*/
import java.awt.*;
import java.util.*;
import java.util.List;
public class TestPicture {
    /**      
    * main method, to test the picture      
    *      
    */   
   public static void main(String[] args)  
   {     
       //String fileName = FileChooser.pickAFile();
       //Picture pictObj = new Picture(fileName);
       //pictObj.explore(); 
       
       //String fileName = FileChooser.pickAFile();
       
       
       Picture mark = new Picture("images\\blue-mark.jpg");
      
       /*
       int[] numbers = new int[10];
       System.out.println(numbers[5] + "-1" );
       //[] this is an array
       Pixel [] pixels;
       //gets all of the pixels in picture and assigns to pixels array
       
       //pixels = mark.getPixels();
       //System.out.println(pixels.length);
   
       System.out.println(pixels[17]);
       System.out.println(pixels[17].getColor());
       
       pixels[17].setColor(Color.blue);
       */
       /*
       //for each loop spot is a ?
       for (Pixel spot : pixels)
       System.out.println( spot );
       
       //loop indexes the array to access
       for (int i = 0; i<pixels.length;i++)
            System.out.println(pixels[i].getRed() );
       */
       /**
        * Method to clear the red from picture
        * @param none
        * @return none
        *
      
       for (Pixel spot : pixels)
       {
           //set the red value of the current pixel to the new value
           spot.setBlue(0);
        }
       mark.explore();       
       */
       /*
       Picture baby = new Picture("images\\beach.jpg");
      
       pixels = baby.getPixels();
       
       Color color;
       Color color2 = new Color(69,69,69);
       for (Pixel pixelObj : pixels)
       {//PixelObj is the current pixel/spot
           
           //get the current color 
           color = pixelObj.getColor();
           
           //get a lighter color
           color = color.brighter();
           
           //set the pixel color to lighter color
           pixelObj.setColor(color2);
           
        }
        baby.explore();
        */
        
       Picture beach = new Picture("images/beach.jpg");
       Pixel[] pixelArray = beach.getPixels();
       beach.explore();
       int value = 0;
       
       Color color;
       beach.explore();
       for (Pixel spot : pixelArray)
       {//PixelObj is the current pixel/spot
          value = spot.getBlue();
          spot.setBlue((int) (value * 0.7));
          
          value = spot.getGreen();
          spot.setGreen((int) (value * 0.7));
           
        }
        beach.explore();

    }
}

