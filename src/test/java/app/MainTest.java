package app;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link Main} object.
 */
public class MainTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        Main main = new Main();
        Assertions.assertNotNull(main);
    }

}
