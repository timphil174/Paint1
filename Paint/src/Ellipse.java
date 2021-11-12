import java.awt.*;

public class Ellipse extends Figure{
    private int semiAxisX;
    private int semiAxisY;

    public Ellipse(Point a, Color c){
        super(a,c);
        this.semiAxisY=0;
        this.semiAxisX=0;
    }

    public void setBoundingBox(int heightBB,int widthBB) {
        this.semiAxisX = widthBB/2;
        this.semiAxisY = heightBB/2;
    }

    public int getSemiAxisX(){
        return semiAxisX;
    }

    public int getSemiAxisY(){
        return semiAxisX;
    }

    public void draw(Graphics g){}

}
