package exercises;

public class Triangle {

    private String asterisk = "*";

    public String oneAsterisk() {
        return asterisk;
    }

    public String horizontalLineOfAsteriks(Integer numberOfAsterisks) {
        String horizontalLineAsteriks = asterisk;
        for (int index = 0; index < numberOfAsterisks - 1; index ++) {
            horizontalLineAsteriks += asterisk;
        }
        return horizontalLineAsteriks;
    }

    public String verticalLineOfAsteriks(Integer numberOfAsterisks) {
        String verticalLineAsterisks = asterisk;
        for (int index = 0; index < numberOfAsterisks - 1; index++) {
            verticalLineAsterisks += "\n" + asterisk;
        }
        return verticalLineAsterisks;
    }

    public String rightTriangle(Integer numberOfLines) {
        String rightTriangle = "";
        String addAsterisks = "";
        for(int index = 0; index < numberOfLines; index ++) {
            addAsterisks += asterisk;
            rightTriangle += "\n" + addAsterisks;
        }
        return rightTriangle;
    }
}
