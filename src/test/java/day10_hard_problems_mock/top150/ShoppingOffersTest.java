package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.ShoppingOffers;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingOffersTest {

    private final ShoppingOffers solution = new ShoppingOffers();

    @Test
    void basicCase() {
        assertEquals(14, solution.shoppingOffers(
                Arrays.asList(2, 5),
                Arrays.asList(Arrays.asList(3, 0, 5), Arrays.asList(1, 2, 10)),
                Arrays.asList(3, 2)));
    }

    @Test
    void threeItems() {
        assertEquals(11, solution.shoppingOffers(
                Arrays.asList(2, 3, 4),
                Arrays.asList(Arrays.asList(1, 1, 0, 4), Arrays.asList(2, 2, 1, 9)),
                Arrays.asList(1, 2, 1)));
    }

    @Test
    void noSpecialOffersBetter() {
        assertEquals(4, solution.shoppingOffers(
                Arrays.asList(1, 1),
                Arrays.asList(Arrays.asList(1, 1, 100)),
                Arrays.asList(2, 2)));
    }

    @Test
    void zeroNeeds() {
        assertEquals(0, solution.shoppingOffers(
                Arrays.asList(2, 3),
                Arrays.asList(Arrays.asList(1, 1, 4)),
                Arrays.asList(0, 0)));
    }

    @Test
    void singleItemSingleOffer() {
        assertEquals(3, solution.shoppingOffers(
                Arrays.asList(5),
                Arrays.asList(Arrays.asList(2, 3)),
                Arrays.asList(2)));
    }

    @Test
    void multipleOfferApplications() {
        assertEquals(10, solution.shoppingOffers(
                Arrays.asList(10),
                Arrays.asList(Arrays.asList(1, 5)),
                Arrays.asList(2)));
    }
}
