package exercises;

public class Triangle {
    private String asterisk = "*";


    public String oneAsterisk() {
        return asterisk;
    }

    public String horizontalLineOfAsteriks(Integer numberOfAsteriks) {
        String horizontalLineAsteriks = asterisk;
        for (int index = 0; index < numberOfAsteriks - 1; index ++) {
            horizontalLineAsteriks += "*";
        }
        return horizontalLineAsteriks;
    }


    public String verticalLineOfAsteriks(Integer numberOfAsteriks) {
        String verticalLineAsteriks = asterisk;
        for (int index = 0; index < numberOfAsteriks -1; index++) {
            verticalLineAsteriks += "\n*";
        }
        return verticalLineAsteriks;
    }
}
