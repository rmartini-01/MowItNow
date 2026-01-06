package app;


import app.entity.Direction;
import app.entity.Mower;
import app.parser.Parser;
import app.service.FileService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit-level testing for {@link Main} object.
 */
public class MainTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        Main main = new Main();
        Assertions.assertNotNull(main);
    }

    @Test
    public void emptyFileTest() {
        String input = "";
        FileService service = new FileService(new Parser());
        assertThrows(IllegalArgumentException.class, () -> {
            try (BufferedReader reader = new BufferedReader(new StringReader(input))) {
                service.loadMowers(reader);
            }
        });
    }

    @Test
    void missingInstructionTest() {
        String input =
                "5 5\n" +
                        "1 2 N\n";

        FileService service = new FileService(new Parser());

        assertThrows(IllegalArgumentException.class, () -> {
            try (BufferedReader reader = new BufferedReader(new StringReader(input))) {
                service.loadMowers(reader);
            }
        });
    }

    @Test
    void mower1FinalPositionShouldMatchExpected() throws Exception {
        String input =
                "5 5\n" +
                        "1 2 N\n" +
                        "GAGAGAGAA\n";

        FileService service = new FileService(new Parser());

        try (BufferedReader reader = new BufferedReader(new StringReader(input))) {
            List<Mower> mowers = service.loadMowers(reader);
            assertEquals(1, mowers.size());

            Mower m1 = mowers.get(0);

            assertEquals(1, m1.getPosition().getX());
            assertEquals(3, m1.getPosition().getY());
            assertEquals(Direction.N, m1.getDirection());
        }
    }
}
