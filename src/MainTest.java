import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {
    private Main testing = new Main(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
    @Test
    void fullData() {
        String result = testing.fullData();
        assertEquals("venerdì 1 marzo 2002, 13:00",result,
                "Date is full");
    }

    @Test
    void mediumData() {
        String result = testing.mediumData();
        assertEquals("1 mar 2002, 13:00:00",result,
                "Date is medium");
    }

    @Test
    void shortData() {
        String result = testing.shortData();
        assertEquals("01/03/02, 13:00",result,
                "Date is short");
    }
}