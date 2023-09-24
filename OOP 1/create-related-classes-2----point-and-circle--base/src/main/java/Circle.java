public class Circle {
    int radius;
    Point center;

//    Circle(Point p, int radius){
//        this.center = p;
//        this.radius = radius;
//    }

    double getArea(){
        return (Math.PI)*(this.radius)*(this.radius);
    }

    double getParameter(){
        return 2*(Math.PI)*(this.radius);
    }

    boolean isOverlapping(Circle anotherCicle){
        int totalRadius = anotherCicle.radius + this.radius;
        int centerDist = (int)Math.sqrt(Math.pow(anotherCicle.center.x - this.center.x, 2) + Math.pow(anotherCicle.center.y - this.center.y, 2));

        if(centerDist <= totalRadius){
            return true;
        }

        return false;
    }

}
