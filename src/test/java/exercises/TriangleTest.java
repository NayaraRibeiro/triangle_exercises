package exercises;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setUp(){
        triangle = new Triangle();
    }

    @Test
    public void shouldReturnAAsteriks(){

        assertThat(triangle.oneAsterisk(), is("*"));
    }

}