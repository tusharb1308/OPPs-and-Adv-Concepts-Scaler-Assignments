public class Car implements Comparable<Car>{
    int Price;
    int Speed;

//    Car(int Price, int Speed){
//        this.Price = Price;
//        this.Speed = Speed;
//    }

    @Override
    public int compareTo(Car otherCar){
        return Price - otherCar.Price;
    }
}
