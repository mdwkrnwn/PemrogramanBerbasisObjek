package P1.BikeDemo;

public class RoadBike extends Bike {
    private int tiredWidth;

    public void setTireWidth(int width){
        tiredWidth = width;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width: " + tiredWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}
