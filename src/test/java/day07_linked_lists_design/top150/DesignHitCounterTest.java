package test.java.day07_linked_lists_design.top150;

import main.java.day07_linked_lists_design.top150.DesignHitCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignHitCounterTest {

    @Test
    void basicOperations() {
        DesignHitCounter counter = new DesignHitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        assertEquals(3, counter.getHits(4));
    }

    @Test
    void hitsExpire() {
        DesignHitCounter counter = new DesignHitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        counter.hit(300);
        assertEquals(4, counter.getHits(300));
        assertEquals(3, counter.getHits(301)); // hit(1) expired
    }

    @Test
    void allExpired() {
        DesignHitCounter counter = new DesignHitCounter();
        counter.hit(1);
        assertEquals(0, counter.getHits(301));
    }

    @Test
    void multipleHitsSameTimestamp() {
        DesignHitCounter counter = new DesignHitCounter();
        counter.hit(1);
        counter.hit(1);
        counter.hit(1);
        assertEquals(3, counter.getHits(1));
    }
}
