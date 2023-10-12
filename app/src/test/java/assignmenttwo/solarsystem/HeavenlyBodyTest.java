package assignmenttwo.solarsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import orderinheaven.HeavenlyBody;

class HeavenlyBodyTest {

    // Dummy implementation of HeavenlyBody to facilitate testing
    private static class TestHeavenlyBody extends HeavenlyBody {
        TestHeavenlyBody(String name, int avgRadiusInKm, double averageTemperature) {
            super(name, avgRadiusInKm, averageTemperature);
        }
    }

    @Test
    void testSetValidAverageTemperature() {
        TestHeavenlyBody testBody = new TestHeavenlyBody("Test", 1000, 20.0);
        testBody.setAverageTemperature(100.0);
        Assertions.assertEquals(100.0, testBody.getAverageTemperature());
    }

    @Test
    void testSetInvalidAverageTemperature() {
        TestHeavenlyBody testBody = new TestHeavenlyBody("Test", 1000, 20.0);
        Assertions.assertThrows(IllegalArgumentException.class, () -> testBody.setAverageTemperature(500.0));
    }
}
