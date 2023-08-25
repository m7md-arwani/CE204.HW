import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class activityTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @Test
    void testAddStudent() {
        // Given
        String input = "1\nMohammad\nMakkah";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // When

        activity.addStudent();

        // Then

        assertEquals("Mohammad", activity.h.get(1).getName());
        assertEquals("Makkah", activity.h.get(1).getAddress());

    }

    @Test
    void testRemoveStudent() {
        // Given
        String input = "2\n1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // When
        activity.removeStudent();
        // Then

        assertNull(activity.h.get(1));

    }
}
