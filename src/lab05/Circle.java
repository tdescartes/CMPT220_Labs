package lab05;

public class Circle {
    private double raduis;
    private double area;

    public Circle(){

    }

    public Circle(double raduis){
        this.raduis= raduis;

        // calling the setArea private void method
        setArea();

    }

    // return radius
    public double getRaduis(){
        return raduis;
    }

    // set a new radius
    public void setRaduis(double nradius){
        this.raduis= nradius;
    }

    // calculating the area.
    private void setArea(){
        this.area= this.raduis * this.raduis* Math.PI ;
    }

    // return length
    public double getArea(){
        setArea();
        return this.area;
    }

    // toString method that is describe instance attribute
    public String toString(){
        return ("The radius "+ raduis +", and the area is " + area );
    }

    public static void main(String[] args){
        /** creating myCircle object**/

        Circle myCircle= new Circle(22);

        // printing the string from my object.
        System.out.println(myCircle);
    }


}
