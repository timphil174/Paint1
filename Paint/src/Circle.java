import java.awt.*;

public class Circle extends Ellipse {
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, heightBB);
    }

    public Circle(Point a, Color c){
        super(a,c);
    }
}