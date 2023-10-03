package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class WeatherReporterTest {
    @Test
    void weatherReporterClassTest() {
        WeatherService weatherService = mock(WeatherService.class);

        when(weatherService.getCurrentTemperature()).thenReturn(23);

        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        assertThat(weatherReporter.generateReport())
                .isEqualTo("Текущая температура: " + 23 + " градусов.");
    }

}