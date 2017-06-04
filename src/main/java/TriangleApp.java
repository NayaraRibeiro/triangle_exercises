import exercises.Triangle;

public class TriangleApp {

    public static void main(String Args[]){
        Triangle triangle = new Triangle();

        System.out.println("One asterisk:\n" + triangle.oneAsterisk() + "\n");
        System.out.println( "Horizontal line of asterisks:\n" + triangle.horizontalLineOfAsteriks(8) + "\n");
        System.out.println("Vertical line of asterisks:\n" + triangle.verticalLineOfAsteriks(3) + "\n");
        System.out.println("Triangle aligned right: " + triangle.rightTriangle(3));





    }
}
