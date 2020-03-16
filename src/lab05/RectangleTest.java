package lab05;
/**
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; **/

public class RectangleTest {/**
    RectangleTest(){

    }
    @Test
    void RectangleTesting() {
        Rectangle myRectangle = new Rectangle(11, 12);
        Rectangle myRectangle1 = new Rectangle(13, 14);
        Assertions.assertEquals(myRectangle.getArea(), (11*12));
        Assertions.assertEquals(myRectangle.getArea(), (13*14));


        // for instance myRectangle
        myRectangle.setHeight(20); // changing the height to 13
        myRectangle.setLength(22); // changing the length to 14
        Assertions.assertEquals(myRectangle.getArea(), (20*22)); // asserting if they are equal


        // for instance myRectangle1
        myRectangle1.setHeight(34); // changing the height to 15
        myRectangle1.setLength(35); // changing the length to 16
        Assertions.assertEquals(myRectangle1.getArea(), (34*35)); // asserting if they are equal

    }
**/
}