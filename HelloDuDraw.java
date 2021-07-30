

import java.util.Scanner;
public class HelloDuDraw {

    /**
     * @param args the command line arguments
     */
        public static final int CANVAS_SIZE = 400;

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String expr = "";
        String colors = " red green blue yellow";
        System.out.print("Enter the color for your shape (red, green, blue, yellow) :");
        String color = sc.next().toLowerCase();
        
        if(!colors.contains(color.toLowerCase())){
            System.out.println("Invalid color. Drawing in black...");
            color="black";
        }
        expr+=color+" ";
        System.out.print("Would you like a filled shape? (yes or no) :");
        String filled = sc.next();
        
        expr+=filled+" ";
        System.out.print("Enter the shape you would like to draw: (circle, square, triangle) :");
        String shape = sc.next();
        expr+=shape;
        DUDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
        DUDraw.setXscale(0, CANVAS_SIZE);
        DUDraw.setYscale(0, CANVAS_SIZE);
        
        //make the pen thicker
        DUDraw.setPenRadius(15);
        
        switch(expr){
         case "red yes circle":
            
            //Make drawing line green
           DUDraw.setPenColor(DUDraw.RED);
           //Draw a filled square centered at (100,100)
           DUDraw.filledCircle(100, 100, 50);
           break;
           
          case "red no circle":
            
           DUDraw.setPenColor(DUDraw.RED);
           DUDraw.circle(100, 100, 50);
           break;
           
           case "green yes circle":
            
           DUDraw.setPenColor(DUDraw.GREEN);
           DUDraw.filledCircle(100, 100, 50);
           break;
           case "green no circle":
            
           DUDraw.setPenColor(DUDraw.GREEN);
           DUDraw.circle(100, 100, 50);
           break;
           
           case "blue yes circle":
            
           DUDraw.setPenColor(DUDraw.BLUE);
           DUDraw.filledCircle(100, 100, 50);
           break;
           case "blue no circle":
            
           DUDraw.setPenColor(DUDraw.BLUE);
           DUDraw.circle(100, 100, 50);
           break;
           
           case "yellow yes circle":
            
           DUDraw.setPenColor(DUDraw.YELLOW);
           DUDraw.filledCircle(100, 100, 50);
           break;
           case "yellow no circle":
            
           DUDraw.setPenColor(DUDraw.YELLOW);
           DUDraw.circle(100, 100, 50);
           break;
           
           case "black yes circle":
            
            //Make drawing line green
           DUDraw.setPenColor(DUDraw.BLACK);
           //Draw a filled square centered at (100,100)
           DUDraw.filledCircle(100,100,50);
           break;
           
          case "black no circle":
            
            //Make drawing line green
           DUDraw.setPenColor(DUDraw.BLACK);
           //Draw a filled square centered at (100,100)
           DUDraw.circle(100,100,50);
           break;
           
           
        
           case "red yes square":
            
            //Make drawing line green
           DUDraw.setPenColor(DUDraw.RED);
           //Draw a filled square centered at (100,100)
           DUDraw.filledSquare(100, 100, 50);
           break;
           
          case "red no square":
            
           DUDraw.setPenColor(DUDraw.RED);
           DUDraw.square(100, 100, 50);
           break;
           
           case "green yes square":
            
           DUDraw.setPenColor(DUDraw.GREEN);
           DUDraw.filledSquare(100, 100, 50);
           break;
           case "green no square":
            
           DUDraw.setPenColor(DUDraw.GREEN);
           DUDraw.square(100, 100, 50);
           break;
           
           case "blue yes square":
            
           DUDraw.setPenColor(DUDraw.BLUE);
           DUDraw.filledSquare(100, 100, 50);
           break;
           case "blue no square":
            
           DUDraw.setPenColor(DUDraw.BLUE);
           DUDraw.square(100, 100, 50);
           break;
           
           case "yellow yes square":
            
           DUDraw.setPenColor(DUDraw.YELLOW);
           DUDraw.filledSquare(100, 100, 50);
           break;
           case "yellow no square":
            
           DUDraw.setPenColor(DUDraw.YELLOW);
           DUDraw.square(100, 100, 50);
           break;
           
            case "black yes square":
            
            //Make drawing line green
           DUDraw.setPenColor(DUDraw.BLACK);
           //Draw a filled square centered at (100,100)
           DUDraw.filledSquare(100,100,50);
           break;
           
          case "black no square":
            
            //Make drawing line green
           DUDraw.setPenColor(DUDraw.BLACK);
           //Draw a filled square centered at (100,100)
           DUDraw.square(100,100,50);
           break;
           
           case "red yes triangle":
            
            //Make drawing line green
           DUDraw.setPenColor(DUDraw.RED);
           //Draw a filled square centered at (100,100)
           DUDraw.filledTriangle(100,100,100,200,200,200);
           break;
           
          case "red no triangle":
            
           DUDraw.setPenColor(DUDraw.RED);
           DUDraw.triangle(100,100,100,200,200,200);
           break;
           
           case "green yes triangle":
            
           DUDraw.setPenColor(DUDraw.GREEN);
           DUDraw.filledTriangle(100,100,100,200,200,200);
           break;
           case "green no triangle":
            
           DUDraw.setPenColor(DUDraw.GREEN);
           DUDraw.triangle(100,100,100,200,200,200);
           break;
           
           case "blue yes triangle":
            
           DUDraw.setPenColor(DUDraw.BLUE);
           DUDraw.filledTriangle(100,100,100,200,200,200);
           break;
           case "blue no triangle":
            
           DUDraw.setPenColor(DUDraw.BLUE);
           DUDraw.triangle(100,100,100,200,200,200);
           break;
           
           case "yellow yes triangle":
            
           DUDraw.setPenColor(DUDraw.YELLOW);
           DUDraw.filledTriangle(100,100,100,200,200,200);
           break;
           case "yellow no triangle":
            
           DUDraw.setPenColor(DUDraw.YELLOW);
           DUDraw.triangle(100,100,100,200,200,200);
           break;
           
          
           case "black yes triangle":
            
            //Make drawing line green
           DUDraw.setPenColor(DUDraw.BLACK);
           //Draw a filled square centered at (100,100)
           DUDraw.filledTriangle(100,100,100,200,200,200);
           break;
           
          case "black no triangle":
            
           DUDraw.setPenColor(DUDraw.BLACK);
           DUDraw.triangle(100,100,100,200,200,200);
           break;
                              
        }
        }
        

}
