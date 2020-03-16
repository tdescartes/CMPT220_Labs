package lab05;

public class Test {
    Test() {
    }

    public static void main(String[] args) {

        // creating instances Circle
        Rectangle myRectangle = new Rectangle(11, 12);
        System.out.println(myRectangle);

        Rectangle myRectangle1 = new Rectangle(11, 12);
        System.out.println(myRectangle1);

        //creating instance of Circle
        Circle myCircle = new Circle(10);
        System.out.println(myCircle);

        Circle myCircle1 = new Circle(10);
        System.out.println(myCircle1);

        System.out.println("-------------------------------------------------------");

        // for instance myRectangle
        myRectangle.setHeight(13); // changing the height to 13
        myRectangle.setLength(14); // changing the length to 14
        myRectangle.getArea();  // prompting getArea to calculate new area
        System.out.println(myRectangle); // printing the new area

        // for instance myRectangle1
        myRectangle1.setHeight(15); // changing the height to 15
        myRectangle1.setLength(16); // changing the length to 16
        myRectangle1.getArea();  // prompting getArea to calculate new area
        System.out.println(myRectangle1); // printing the new area

        // for instance myCircle
        myCircle.setRaduis(22); // changing the radius to 22
        myCircle.getArea(); // prompting the getArea to calculate new area
        System.out.println(myCircle);// printing to the new area


        // for instance myCircle1
        myCircle1.setRaduis(33); // changing the radius to 33
        myCircle1.getArea(); // prompting the getArea to calculate new area
        System.out.println(myCircle1);// printing to the new area

    }
}
