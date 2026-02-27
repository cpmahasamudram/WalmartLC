package day01_arrays_hashing.walmart;

import java.util.*;

/**
 * LC 332 - Reconstruct Itinerary
 * Difficulty: Hard | Source: WALMART
 *
 * You are given a list of airline tickets where tickets[i] = [from_i, to_i]
 * represent the departure and arrival airports. Reconstruct the itinerary
 * in order and return it.
 *
 * All tickets belong to a man who departs from "JFK". The itinerary must begin with "JFK".
 * If there are multiple valid itineraries, return the one with the smallest lexical order.
 *
 * You must use all the tickets once and only once.
 *
 * Example 1:
 *   Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
 *   Output: ["JFK","MUC","LHR","SFO","SJC"]
 *
 * Example 2:
 *   Input: tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
 *   Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
 *
 * Constraints:
 * - 1 <= tickets.length <= 300
 * - tickets[i].length == 2
 * - from_i.length == 3, to_i.length == 3
 * - from_i and to_i consist of uppercase English letters
 * - from_i != to_i
 *
 * PATTERN: Hierholzer's Algorithm (Eulerian Path) + DFS
 *
 * APPROACH:
 *   This is finding an Eulerian path — visit every EDGE (ticket) exactly once.
 *
 *   1. Build adjacency list: Map<String, PriorityQueue<String>>
 *      PriorityQueue gives lexical order automatically.
 *
 *   2. DFS from "JFK". At each node, keep visiting the smallest neighbor
 *      (poll from PriorityQueue) until stuck.
 *
 *   3. When stuck (no more neighbors), add current airport to the FRONT of result.
 *      This is the key insight — Hierholzer's builds the path in reverse.
 *
 *   Why add to front?
 *     When you're stuck at a dead end, that airport must be the LAST in the path.
 *     By adding to front, the first stuck node ends up at the end of the result.
 *
 *   Example walkthrough: [["JFK","MUC"],["MUC","LHR"],["LHR","SFO"],["SFO","SJC"]]
 *     DFS: JFK → MUC → LHR → SFO → SJC (stuck!)
 *     Add to front: SJC → [SJC]
 *     Backtrack to SFO (stuck) → [SFO, SJC]
 *     Backtrack to LHR (stuck) → [LHR, SFO, SJC]
 *     Backtrack to MUC (stuck) → [MUC, LHR, SFO, SJC]
 *     Backtrack to JFK (stuck) → [JFK, MUC, LHR, SFO, SJC] ✓
 *
 * TIME COMPLEXITY: O(E log E)
 *   - E = number of tickets (edges)
 *   - Building PriorityQueues: O(E log E) for all insertions
 *   - DFS visits each edge exactly once: O(E)
 *   - addFirst on LinkedList: O(1)
 *   - Dominated by PriorityQueue operations: O(E log E)
 *
 * SPACE COMPLEXITY: O(E + V)
 *   - Adjacency list stores all edges: O(E)
 *   - Recursion stack depth: O(E) worst case (all edges in one chain)
 *   - Result list: O(E + 1) = O(E)
 */
public class ReconstructItinerary {

    public List<String> findItinerary(List<List<String>> tickets) {
        // TODO: Implement your solution here
        // 1. Build graph: Map<String, PriorityQueue<String>>
        // 2. DFS from "JFK"
        // 3. Add to front of result when stuck (no more outgoing edges)
        return new ArrayList<>();
    }
}
