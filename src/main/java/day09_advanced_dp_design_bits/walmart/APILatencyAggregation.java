package main.java.day09_advanced_dp_design_bits.walmart;

import java.util.*;

/**
 * Custom Walmart - API Latency Aggregation
 * Difficulty: Medium | Source: WALMART
 *
 * Design a system that tracks API call latencies and returns percentile-based
 * aggregations. This is common in monitoring dashboards at Walmart to track
 * service health via p50 (median), p90, and p99 latencies.
 *
 * Implement the APILatencyAggregation class:
 * - void recordLatency(String api, int latencyMs) Records a latency value in
 *   milliseconds for the given API endpoint.
 * - double getPercentile(String api, int percentile) Returns the p-th percentile
 *   latency for the given API. If no data exists, return 0.0. Use nearest-rank
 *   method: index = ceil(percentile / 100.0 * n) - 1 on the sorted list.
 *
 * Example:
 *   APILatencyAggregation agg = new APILatencyAggregation();
 *   agg.recordLatency("/checkout", 120);
 *   agg.recordLatency("/checkout", 200);
 *   agg.recordLatency("/checkout", 150);
 *   agg.recordLatency("/checkout", 300);
 *   agg.recordLatency("/checkout", 180);
 *   agg.getPercentile("/checkout", 50);  -> 180.0 (p50 / median)
 *   agg.getPercentile("/checkout", 90);  -> 300.0 (p90)
 *   agg.getPercentile("/checkout", 99);  -> 300.0 (p99)
 *
 * Constraints:
 * - 1 <= latencyMs <= 10^6
 * - 1 <= percentile <= 100
 * - api is a non-null, non-empty string
 * - At most 10^5 calls to recordLatency and getPercentile combined
 *
 * PATTERN: HashMap + Sorted List (or TreeMap / Counting Sort)
 * HINT: Store latencies per API in a list. On getPercentile, sort the list and
 *       compute the index using nearest-rank: idx = ceil(p/100 * n) - 1.
 *       For optimization, consider maintaining a sorted structure or counting array.
 *
 * TIME: O(n log n) getPercentile (sort), O(1) record | SPACE: O(n) per API
 */
public class APILatencyAggregation {

    public APILatencyAggregation() {
        // TODO: Implement - initialize map of API name to list of latencies
    }

    public void recordLatency(String api, int latencyMs) {
        // TODO: Implement - add latency to the list for this API
    }

    public double getPercentile(String api, int percentile) {
        // TODO: Implement - sort latencies, compute nearest-rank index, return value
        return 0.0;
    }
}
