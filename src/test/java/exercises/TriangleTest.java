package exercises;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Triangle();
    }

    @Test
    public void shouldReturnAAsterik() {
        assertThat(triangle.oneAsterisk(), is("*"));
    }

    @Test
    public void shouldReturnAHorizontalLineOfAsteriks() {
        assertThat(triangle.horizontalLineOfAsteriks(8), is("********"));
    }

    @Test
    public void shouldReturnAVerticalLineOfAsteriks() {
        assertThat(triangle.verticalLineOfAsteriks(3), is("*\n*\n*"));
    }
}