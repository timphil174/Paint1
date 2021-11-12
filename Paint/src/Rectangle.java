import java.awt.*;

public class Rectangle extends Figure{
    private int height=0;
    private int width=0;

    public void setBoundingBox(int heightBB,int widthBB){
        this.height=heightBB;
        this.width=widthBB;
    }
    public void draw(Graphics g){
    }

    public Rectangle(Point a, Color c){
        super(a,c);
        this.height=0;
        this.width=0;
        }
    }
