import java.awt.*;

public class Square extends Rectangle{
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, heightBB);
    }

    public Square(Point a, java.awt.Color c){

        super(a,c);
    }
}
