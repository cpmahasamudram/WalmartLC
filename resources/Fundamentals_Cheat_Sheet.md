# Fundamentals Cheat Sheet — Permutations, Combinations & Complexity Patterns

---

## 1. Permutations vs Combinations

### Permutations — Order MATTERS

**Formula:** P(n, r) = n! / (n - r)!

| Scenario | Formula | Example | Count |
|----------|---------|---------|-------|
| Arrange r items from n | P(n,r) = n!/(n-r)! | Pick 3 from {A,B,C,D} in order | 4!/1! = 24 |
| Arrange all n items | n! | Arrange {A,B,C} | 3! = 6 |
| Permutations with repetition | n^r | 4-digit PIN, digits 0-9 | 10^4 = 10000 |
| Permutations with duplicates | n! / (a! × b! × ...) | Arrange "AABB" | 4!/(2!×2!) = 6 |

**When to use:** Arranging, ordering, sequences, passwords, seating arrangements.

### Combinations — Order DOES NOT MATTER

**Formula:** C(n, r) = n! / (r! × (n - r)!)

| Scenario | Formula | Example | Count |
|----------|---------|---------|-------|
| Choose r items from n | C(n,r) = n!/(r!(n-r)!) | Choose 3 from {A,B,C,D} | 4!/(3!×1!) = 4 |
| Choose with repetition | C(n+r-1, r) | 3 scoops from 5 flavors | C(7,3) = 35 |
| Subsets of size r | C(n,r) | Teams of 3 from 10 | C(10,3) = 120 |
| All subsets | 2^n | All subsets of {A,B,C} | 2^3 = 8 |

**When to use:** Selecting, grouping, teams, subsets, "how many ways to choose".

### Quick Decision Guide

```
Does order matter?
├── YES → Permutation
│   ├── Can repeat? → n^r
│   └── No repeat?  → P(n,r) = n!/(n-r)!
└── NO  → Combination
    ├── Can repeat? → C(n+r-1, r)
    └── No repeat?  → C(n,r) = n!/(r!(n-r)!)
```

### Side-by-Side Example

Pick 2 from {A, B, C}:
- **Permutations** (order matters): AB, BA, AC, CA, BC, CB → **6** = P(3,2) = 3!/1! = 6
- **Combinations** (order doesn't matter): {A,B}, {A,C}, {B,C} → **3** = C(3,2) = 3!/(2!×1!) = 3

---

## 2. Common LC Patterns — Time & Space Complexity

### Arrays & Hashing

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Hash Map lookup | O(n) | O(n) | Two Sum, Subarray Sum = K |
| Prefix Sum | O(n) | O(n) | Subarray Sum = K, Range Sum |
| Prefix/Suffix Product | O(n) | O(1)* | Product Except Self |
| Frequency Count | O(n) | O(n) | Group Anagrams, Top K Frequent |
| Kadane's Algorithm | O(n) | O(1) | Maximum Subarray |

### Two Pointers

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Sorted array two pointers | O(n) | O(1) | Two Sum II, Container With Water |
| Sort + two pointers | O(n log n) | O(1) | 3Sum, Sort Colors |
| Fast/slow pointers | O(n) | O(1) | Linked List Cycle, Find Middle |
| Read/write pointers | O(n) | O(1) | Move Zeroes, Remove Duplicates |

### Sliding Window

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Fixed-size window | O(n) | O(1) | Find All Anagrams, Max Points Cards |
| Variable-size window | O(n) | O(k) | Longest Substring No Repeats, Min Window Substring |
| Window + freq map | O(n) | O(m) | Minimum Window Substring |

### Binary Search

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Classic BS | O(log n) | O(1) | Binary Search, Search 2D Matrix |
| BS on rotated array | O(log n) | O(1) | Search in Rotated Sorted Array |
| BS on answer | O(n log d) | O(1) | Koko Eating Bananas, Min Days Bouquets |
| BS on partition | O(log min(m,n)) | O(1) | Median of Two Sorted Arrays |

### Dynamic Programming

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Linear DP (1D) | O(n) | O(n) or O(1) | Climbing Stairs, House Robber |
| Knapsack (0/1) | O(n × W) | O(W) | Partition Equal Subset Sum, Target Sum |
| Unbounded Knapsack | O(n × W) | O(W) | Coin Change |
| Grid DP (2D) | O(m × n) | O(m × n) | Unique Paths, Maximal Square |
| String DP (2D) | O(m × n) | O(m × n) | Edit Distance, LCS |
| State Machine DP | O(n × states) | O(states) | Buy/Sell Stock w/ Cooldown |
| Interval DP | O(n³) | O(n²) | Burst Balloons |

### Trees

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| DFS recursive | O(n) | O(h) | Max Depth, Validate BST, Path Sum |
| BFS level-order | O(n) | O(w) | Level Order, Right Side View, Bottom View |
| Inorder traversal (BST) | O(n) | O(h) | Kth Smallest, Validate BST |
| Postorder (bottom-up) | O(n) | O(h) | LCA, Diameter, Max Path Sum |

*h = height (O(log n) balanced, O(n) worst), w = max width*

### Graphs

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| DFS flood fill | O(V + E) | O(V) | Number of Islands, Surrounded Regions |
| BFS shortest path | O(V + E) | O(V) | Word Ladder, Rotting Oranges |
| Multi-source BFS | O(V + E) | O(V) | Rotting Oranges, Walls and Gates |
| Topological Sort (Kahn's) | O(V + E) | O(V) | Course Schedule I & II |
| Union Find | O(n × α(n)) ≈ O(n) | O(n) | Redundant Connection, Accounts Merge |

### Heaps

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Top K / Min Heap of size K | O(n log k) | O(k) | Kth Largest Element |
| Two Heaps (max + min) | O(n log n) | O(n) | Find Median from Stream |
| Merge K sorted | O(n log k) | O(k) | Merge K Sorted Lists |

### Stacks

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Matching/validation | O(n) | O(n) | Valid Parentheses |
| Monotonic stack | O(n) | O(n) | Daily Temperatures, Largest Rectangle |
| Expression evaluation | O(n) | O(n) | Reverse Polish, Basic Calculator |

### Backtracking

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Subsets | O(2^n) | O(n) | Subsets, Subsets II |
| Permutations | O(n!) | O(n) | Permutations |
| Combinations | O(C(n,k)) | O(k) | Combination Sum |
| Generate valid sequences | O(4^n / sqrt(n)) | O(n) | Generate Parentheses (Catalan) |
| Grid backtracking | O(m × n × 4^L) | O(L) | Word Search (L = word length) |

### Linked List

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Reverse (iterative) | O(n) | O(1) | Reverse Linked List |
| Fast/slow (find mid) | O(n) | O(1) | Palindrome LL, Reorder List |
| Merge two lists | O(n + m) | O(1) | Merge Two Sorted Lists |
| HashMap + DLL (cache) | O(1) get/put | O(capacity) | LRU Cache, LFU Cache |

### Intervals

| Pattern | Time | Space | Example Problems |
|---------|------|-------|-----------------|
| Sort + merge | O(n log n) | O(n) | Merge Intervals |
| Sort + sweep line | O(n log n) | O(n) | Meeting Rooms II, Min Platforms |
| Sort by end + greedy | O(n log n) | O(1) | Non-overlapping Intervals |

---

## 3. Complexity Cheat Sheet — Growth Rates

```
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2^n) < O(n!)

n = 10:
  O(1)       = 1
  O(log n)   = 3
  O(n)       = 10
  O(n log n) = 33
  O(n²)      = 100
  O(2^n)     = 1,024
  O(n!)      = 3,628,800

n = 20:
  O(n²)      = 400
  O(2^n)     = 1,048,576
  O(n!)      = 2.4 × 10^18  (impossible to compute)
```

### Constraint-Based Complexity Hints

| Constraint (n) | Target Complexity | Typical Pattern |
|----------------|-------------------|-----------------|
| n ≤ 10 | O(n!) or O(2^n) | Backtracking, brute force |
| n ≤ 20 | O(2^n) | Bitmask DP, backtracking |
| n ≤ 500 | O(n³) | Interval DP, Floyd-Warshall |
| n ≤ 5,000 | O(n²) | Two loops, 2D DP |
| n ≤ 10^5 | O(n log n) | Sorting, heap, BS + linear |
| n ≤ 10^6 | O(n) | Hash map, prefix sum, two pointers |
| n ≤ 10^9 | O(log n) | Binary search, math |

---

## 4. Sorting Algorithm Complexities

| Algorithm | Best | Average | Worst | Space | Stable? |
|-----------|------|---------|-------|-------|---------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | No |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | No |
| Counting Sort | O(n + k) | O(n + k) | O(n + k) | O(k) | Yes |
| Radix Sort | O(d × (n+k)) | O(d × (n+k)) | O(d × (n+k)) | O(n+k) | Yes |
| Bucket Sort | O(n + k) | O(n + k) | O(n²) | O(n) | Yes |

*Java's Arrays.sort(): dual-pivot QuickSort for primitives, TimSort (merge sort variant) for objects. Both O(n log n) average.*

---

## 5. Java Data Structure Operations

| Structure | Access | Search | Insert | Delete | Notes |
|-----------|--------|--------|--------|--------|-------|
| Array | O(1) | O(n) | O(n) | O(n) | Fixed size |
| ArrayList | O(1) | O(n) | O(1)* | O(n) | *amortized append |
| LinkedList | O(n) | O(n) | O(1) | O(1) | If you have the node |
| HashMap | - | O(1)* | O(1)* | O(1)* | *amortized, O(n) worst |
| TreeMap | - | O(log n) | O(log n) | O(log n) | Sorted keys |
| HashSet | - | O(1)* | O(1)* | O(1)* | *amortized |
| PriorityQueue | peek O(1) | O(n) | O(log n) | O(log n) | Min-heap default |
| Stack | peek O(1) | O(n) | O(1) | O(1) | LIFO |
| ArrayDeque | peek O(1) | O(n) | O(1)* | O(1)* | Faster than Stack/LinkedList |
