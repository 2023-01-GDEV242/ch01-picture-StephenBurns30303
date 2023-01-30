/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 *
 *This picture is a combination between an abstract art piece and some company
 *logo you tend to see in scifi games.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Stephen M. Burns
 * @version 2023.30.23
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;
    private Triangle ship;
    private Square beam1;
    private Square beam2;
    private Circle sun2;
    private Person hidden;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        ship= new Triangle();
        beam1=new Square();
        beam2 =new Square();
        sun2 = new Circle();
        hidden= new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            ship.changeSize(120, 120);
            ship.changeColor("black");
            ship.moveVertical(60);
            ship.makeVisible();
            
            hidden.changeSize(20,20);
            hidden.changeColor("white");
            hidden.moveVertical(60);
            hidden.moveHorizontal(30);
            hidden.makeVisible();
            
            beam1.changeSize(60);
            beam2.changeSize(60);
            beam1.moveVertical(70);
            beam2.moveVertical(80);
            beam1.moveHorizontal(20);
            beam2.moveHorizontal(40);
            beam1.changeColor("yellow");
            beam2.changeColor("yellow");
            beam1.makeVisible();
            beam2.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
           
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            sun2.changeColor("black");
            sun2.moveHorizontal(100);
            sun2.moveVertical(40);
            sun2.changeSize(60);
            sun2.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        sun.changeColor("white");
        ship.changeColor("white");
        beam1.changeColor("white");
        beam2.changeColor("white");
        hidden.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        sun2.changeColor("black");
        ship.changeColor("black");
        beam1.changeColor("yellow");
        beam2.changeColor("yellow");
        hidden.changeColor("white");
    }
}
