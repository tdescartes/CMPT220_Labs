package lab05;

public class Rectangle {
    private double height;
    private double length;
    private double area;

   public Rectangle(){

   }

   public Rectangle(double height, double length ){

       this.height= height;
       this.length= length;

      // calling the setArea private void method
       setArea();

   }


    // return length
    public double getLength(){
        return length;
    }

    // set a new length
    public void setLength(double nlength){
        this.length= nlength;
    }

    // return height
   public double getHeight(){
       return height;
   }

    // set a new height
   public void setHeight(double nheight){
       this.height= nheight;
   }

   // calculating the area.
   private void setArea(){
        this.area= this.length * this.height;
   }

    // return length
    public double getArea(){
       setArea();
       return this.area;
   }

    // toString method that is describe instance attribute
   public String toString(){
       return ("The length is "+ length +", the height is "+ height + ", and the area is " +area );
   }

   public static void main(String[] args){
       /** creating myRectangle object**/

       Rectangle myRectangle= new Rectangle(21, 34);

        // printing the string from my object.
       System.out.println(myRectangle);
   }

}
