import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 200; // Set the cash value
        int expectedMilesValue = (int) (cashValue * 0.0035); // Calculate the expected miles value
        var rewardValue = new RewardValue(cashValue);

        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000; // Set the miles value
        double expectedCashValue = milesValue / 0.0035; // Calculate the expected cash value
        var rewardValue = new RewardValue(milesValue);

        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001); // Adding delta for approximate double comparison
    }
}
