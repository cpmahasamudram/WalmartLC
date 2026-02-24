package test.java.day09_advanced_dp_design_bits.walmart;

import main.java.day09_advanced_dp_design_bits.walmart.APILatencyAggregation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class APILatencyAggregationTest {

    private final APILatencyAggregation agg = new APILatencyAggregation();

    @Test
    void p50MedianOddCount() {
        agg.recordLatency("/api", 120);
        agg.recordLatency("/api", 200);
        agg.recordLatency("/api", 150);
        agg.recordLatency("/api", 300);
        agg.recordLatency("/api", 180);
        // sorted: [120, 150, 180, 200, 300], p50 index = ceil(0.5*5)-1 = 2 -> 180
        assertEquals(180.0, agg.getPercentile("/api", 50));
    }

    @Test
    void p90Latency() {
        agg.recordLatency("/checkout", 100);
        agg.recordLatency("/checkout", 200);
        agg.recordLatency("/checkout", 300);
        agg.recordLatency("/checkout", 400);
        agg.recordLatency("/checkout", 500);
        // sorted: [100,200,300,400,500], p90 index = ceil(0.9*5)-1 = 4 -> 500
        assertEquals(500.0, agg.getPercentile("/checkout", 90));
    }

    @Test
    void p99Latency() {
        agg.recordLatency("/search", 50);
        agg.recordLatency("/search", 100);
        agg.recordLatency("/search", 150);
        agg.recordLatency("/search", 200);
        agg.recordLatency("/search", 5000);
        // sorted: [50,100,150,200,5000], p99 index = ceil(0.99*5)-1 = 4 -> 5000
        assertEquals(5000.0, agg.getPercentile("/search", 99));
    }

    @Test
    void p100ReturnsMax() {
        agg.recordLatency("/api", 10);
        agg.recordLatency("/api", 20);
        agg.recordLatency("/api", 30);
        // p100 index = ceil(1.0*3)-1 = 2 -> 30
        assertEquals(30.0, agg.getPercentile("/api", 100));
    }

    @Test
    void noDataReturnsZero() {
        assertEquals(0.0, agg.getPercentile("/unknown", 50));
    }

    @Test
    void separateAPIsTrackedIndependently() {
        agg.recordLatency("/a", 100);
        agg.recordLatency("/b", 500);
        assertEquals(100.0, agg.getPercentile("/a", 50));
        assertEquals(500.0, agg.getPercentile("/b", 50));
    }
}
