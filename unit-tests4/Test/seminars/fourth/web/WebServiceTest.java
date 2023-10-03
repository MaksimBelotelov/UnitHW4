package seminars.fourth.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WebServiceTest {
    @Test
    void testWebServiceGet() {
        HttpClient clientMock = mock(HttpClient.class);
        WebService service = new WebService(clientMock);

        String url = "http://www.abc.com";

        when(clientMock.get(url)).thenReturn("GET Response Code :: 200\n" +
                "Это ответ на гет запрос от мока");

        assertEquals(service.sendGet(url),"GET Response Code :: 200\n" +
                "Это ответ на гет запрос от мока\n" + "GET DONE");

    }
}
