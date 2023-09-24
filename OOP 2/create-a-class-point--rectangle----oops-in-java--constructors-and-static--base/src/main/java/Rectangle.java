public class Rectangle {
    Point topLeft;
    Point bottomRight;
    
    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY){
//        this.topLeft.x = topLeftX;
//        this.topLeft.y = topLeftY;
//        this.bottomRight.x = bottomRightX;
//        this.bottomRight.y = bottomRightY;

        this.topLeft = new Point(topLeftX, topLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
    }

    public Rectangle(Point topLeft, Point bottomRight){
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
        this.topLeft = new Point(topLeft.x, topLeft.y);
        this.bottomRight = new Point(bottomRight.x, bottomRight.y);
    }

    public Rectangle(Rectangle r){
//        this.topLeft = r.topLeft;
//        this.bottomRight = r.bottomRight;
        this.topLeft = new Point(r.topLeft.x, r.topLeft.y);
        this.bottomRight = new Point(r.bottomRight.x, r.bottomRight.y);
    }
}
