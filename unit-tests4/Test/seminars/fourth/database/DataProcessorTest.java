package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class DataProcessorTest {
    @Test
    void testDataProcessorClass() {
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);

        List<String> expectedResult = new ArrayList<>(Arrays.asList("res1", "res2"));

        String query = "SELECT * FROM mytable";

        when(database.query(query)).thenReturn(expectedResult);

        List<String> actualResult = dataProcessor.processData(query);

        assertEquals(actualResult, expectedResult);
    }
}