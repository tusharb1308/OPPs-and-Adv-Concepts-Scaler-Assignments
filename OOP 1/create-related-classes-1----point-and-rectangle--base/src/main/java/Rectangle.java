public class Rectangle {
    int height;
    int width;
    Point topLeft;

//    Rectangle(int height, int width, Point p){
//        this.height = height;
//        this.width = width;
//        this.topLeft.x = p.x;
//        this.topLeft.y = p.y;
//    }

    int getArea(){
        return (this.height)*(this.width);
    }

    int getParameter(){
        return 2*(this.height + this.width);
    }

    Point getBottomRight(){
        this.topLeft.x += this.width;
        this.topLeft.y -= this.height;

        return topLeft;
    }

}
