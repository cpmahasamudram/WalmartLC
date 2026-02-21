# 🎯 Walmart Coding Interview — Complete Prep Guide

> **162 problems** · 10-Day Study Plan · Top 150 + Recent Walmart Questions · Coaching Guide
> 
> `🔴 WALMART` = Verified from recent interviews (Jun 2025–Feb 2026)
> `🔵 TOP 150` = General prep from Top 150 question bank
> `🟣 BOTH` = In Top 150 AND recently asked at Walmart

---

## 📅 10-Day Study Plan (3 hours/day)

**Daily Structure:** ☀ Warm-Up (20 min) → 🔥 Core Walmart (70 min) → 📘 Top 150 Extras (50 min) → 🔴 Deep Dive (30 min) → 📝 Review (10 min)

> **If short on time:** Skip 📘 Extra sections → ~2 hrs/day, still covers all Walmart-verified problems.

### DAY 1: ARRAYS & HASHING

*HashMap, Prefix Sum, frequency counting — #1 Walmart topic*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 1 | ☀ Warm | 0:00 | **Two Sum** | 1 | 🟢 Easy | 🟣 BOTH | HashMap single-pass | Foundation. Know O(n) map approach cold. |
| 1 | ☀ Warm | 0:10 | **Contains Duplicate** | 217 | 🟢 Easy | 🔵 TOP 150 | HashSet check | One-liner with Set. Warm up hashing. |
| 1 | ☀ Warm | 0:15 | **Valid Anagram** | 242 | 🟢 Easy | 🔵 TOP 150 | Frequency count array | int[26] counter. Compare frequencies. |
| 1 | 🔥 Core | 0:20 | **Subarray Sum Equals K** | 560 | 🟡 Medium | 🔴 WALMART | Prefix Sum + HashMap | ★★★★★ #1 MOST ASKED. prefix[i]-prefix[j]=k. |
| 1 | 🔥 Core | 0:35 | **Product of Array Except Self** | 238 | 🟡 Medium | 🟣 BOTH | Prefix/Suffix products | Left pass × right pass. O(1) space trick. |
| 1 | 🔥 Core | 0:50 | **Group Anagrams** | 49 | 🟡 Medium | 🟣 BOTH | Sorted key HashMap | Sorted char[] as key. HashMap internals! |
| 1 | 🔥 Core | 1:05 | **Top K Frequent Elements** | 347 | 🟡 Medium | 🔵 TOP 150 | Bucket Sort / Heap | Bucket sort O(n) or PriorityQueue O(n log k). |
| 1 | 📘 Extra | 1:20 | **Longest Consecutive Sequence** | 128 | 🟡 Medium | 🔵 TOP 150 | HashSet + sequence start | Only start counting from sequence heads. |
| 1 | 📘 Extra | 1:35 | **Best Time to Buy and Sell Stock** | 121 | 🟢 Easy | 🔵 TOP 150 | Track min, compute max profit | Single pass. Foundation for all stock problems. |
| 1 | 📘 Extra | 1:45 | **Rotate Array** | 189 | 🟡 Medium | 🔵 TOP 150 | Reverse trick (3 reverses) | Reverse all → reverse first k → reverse rest. |
| 1 | 🔴 Deep | 2:00 | **Trapping Rain Water** | 42 | 🔴 Hard | 🔴 WALMART | Two Pointers O(1) space | ★★★★★ WALMART FAV. Know all 3 approaches. |
| 1 | 📝 Review | 2:30 | **Pattern Notes** | - | ⚪ - | ⚪ - | HashMap + Prefix Sum | When prefix sum vs sliding window? Write it down. |

### DAY 2: TWO POINTERS & SLIDING WINDOW

*Pointer techniques — 3Sum, sliding window are Walmart staples*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 2 | ☀ Warm | 0:00 | **Move Zeroes** | 283 | 🟢 Easy | 🔴 WALMART | Read/write two pointers | ★★★★ Walmart verified. In-place partition. |
| 2 | ☀ Warm | 0:10 | **Valid Palindrome** | 125 | 🟢 Easy | 🔵 TOP 150 | Two pointers inward | Skip non-alphanumeric. toLowerCase. |
| 2 | ☀ Warm | 0:15 | **Squares of a Sorted Array** | 977 | 🟢 Easy | 🔴 WALMART | Two pointers from ends | ★★★ Asked Feb 2025 Walmart iOS round. |
| 2 | 🔥 Core | 0:20 | **3Sum** | 15 | 🟡 Medium | 🔴 WALMART | Sort + fix one + two ptr | ★★★★ Asked at Principal level. Dedup carefully. |
| 2 | 🔥 Core | 0:40 | **Container With Most Water** | 11 | 🟡 Medium | 🟣 BOTH | Greedy two pointers | Move shorter side inward. Prove correctness. |
| 2 | 🔥 Core | 0:55 | **Longest Substring No Repeats** | 3 | 🟡 Medium | 🟣 BOTH | Sliding window + HashMap | Map stores last index for O(1) jump. |
| 2 | 🔥 Core | 1:10 | **Find All Anagrams in a String** | 438 | 🟡 Medium | 🔵 TOP 150 | Fixed-size sliding window | Window of size p. Compare freq arrays. |
| 2 | 📘 Extra | 1:25 | **Sort Colors (Dutch National Flag)** | 75 | 🟡 Medium | 🔴 WALMART | Three-pointer partition | ★★★★ Walmart SSE. lo/mid/hi pointers. |
| 2 | 📘 Extra | 1:40 | **Contains Duplicate II (K dist)** | 219 | 🟢 Easy | 🔴 WALMART | Sliding window HashSet | ★★★★ Walmart Jan 2025. Window of size k. |
| 2 | 📘 Extra | 1:50 | **Minimum Size Subarray Sum** | 209 | 🟡 Medium | 🔵 TOP 150 | Shrinking window | Expand right, shrink left while sum ≥ target. |
| 2 | 📘 Extra | 2:05 | **Max Points from Cards** | 1423 | 🟡 Medium | 🔵 TOP 150 | Prefix + suffix window | Take k from left/right. Min middle subarray. |
| 2 | 🔴 Deep | 2:15 | **Minimum Window Substring** | 76 | 🔴 Hard | 🟣 BOTH | Sliding window + freq map | Expand right, shrink left. Track 'formed' count. |
| 2 | 📝 Review | 2:45 | **Pattern Notes** | - | ⚪ - | ⚪ - | Two Ptr + Sliding Window | Sorted? → Two ptrs. Subarray? → Window. |

### DAY 3: DYNAMIC PROGRAMMING

*Coin Change & House Robber are ★★★★★. Cover linear, knapsack, state machine, grid DP*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 3 | ☀ Warm | 0:00 | **Climbing Stairs** | 70 | 🟢 Easy | 🟣 BOTH | Fibonacci DP | Base case + recurrence. Memo vs tabulation. |
| 3 | ☀ Warm | 0:10 | **Min Cost Climbing Stairs** | 746 | 🟢 Easy | 🔵 TOP 150 | Linear DP min choice | dp[i] = cost[i] + min(dp[i-1], dp[i-2]). |
| 3 | 🔥 Core | 0:20 | **Coin Change** | 322 | 🟡 Medium | 🔴 WALMART | Unbounded Knapsack | ★★★★★ Sep 2025. Show recursion→memo→tab. |
| 3 | 🔥 Core | 0:40 | **House Robber II** | 213 | 🟡 Medium | 🔴 WALMART | Circular linear DP | ★★★★★ Multiple times. Run twice: skip first OR last. |
| 3 | 🔥 Core | 0:55 | **Target Sum** | 494 | 🟡 Medium | 🔴 WALMART | Subset sum transform | ★★★★ Walmart. Transform to knapsack. |
| 3 | 🔥 Core | 1:10 | **House Robber** | 198 | 🟡 Medium | 🔵 TOP 150 | Linear DP skip/take | Foundation for House Robber II. |
| 3 | 📘 Extra | 1:25 | **Best Time Buy/Sell w/ Cooldown** | 309 | 🟡 Medium | 🔴 WALMART | State machine DP | ★★★★ Dec 2024. States: hold, sold, rest. |
| 3 | 📘 Extra | 1:40 | **Jump Game** | 55 | 🟡 Medium | 🔴 WALMART | Greedy max reach | Track farthest reachable. One pass. |
| 3 | 📘 Extra | 1:50 | **Unique Paths** | 62 | 🟡 Medium | 🔵 TOP 150 | Grid DP | dp[i][j] = dp[i-1][j] + dp[i][j-1]. |
| 3 | 📘 Extra | 2:00 | **Longest Increasing Subsequence** | 300 | 🟡 Medium | 🔵 TOP 150 | Binary search / DP | O(n log n) with patience sorting. |
| 3 | 📘 Extra | 2:10 | **Word Break** | 139 | 🟡 Medium | 🔵 TOP 150 | DP + HashSet | dp[i] = any dp[j] && word[j..i] in dict. |
| 3 | 📘 Extra | 2:20 | **Decode Ways** | 91 | 🟡 Medium | 🔵 TOP 150 | Linear DP 1/2 digit | Similar to climbing stairs with constraints. |
| 3 | 🔴 Deep | 2:30 | **Edit Distance** | 72 | 🟡 Medium | 🔵 TOP 150 | 2D DP (3 operations) | Insert/delete/replace. Classic 2D table. |
| 3 | 📝 Review | 2:50 | **Pattern Notes** | - | ⚪ - | ⚪ - | DP classification | Linear, knapsack, grid, state machine, interval. |

### DAY 4: BINARY TREES — BFS, DFS, BST

*Trees are top-3 at Walmart. Bottom View & Right Side View are ★★★★★*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 4 | ☀ Warm | 0:00 | **Maximum Depth of Binary Tree** | 104 | 🟢 Easy | 🟣 BOTH | Recursive DFS | max(left,right)+1. Foundation. |
| 4 | ☀ Warm | 0:08 | **Invert Binary Tree** | 226 | 🟢 Easy | 🔵 TOP 150 | Recursive swap | Swap left/right at each node. |
| 4 | ☀ Warm | 0:14 | **Symmetric Tree** | 101 | 🟢 Easy | 🔵 TOP 150 | Mirror check | Compare left.left vs right.right. |
| 4 | 🔥 Core | 0:20 | **Binary Tree Level Order Traversal** | 102 | 🟡 Medium | 🟣 BOTH | BFS Queue | Foundation for all view problems. |
| 4 | 🔥 Core | 0:35 | **Bottom View of Binary Tree** | - | 🟡 Medium | 🔴 WALMART | BFS + vertical order | ★★★★★ WALMART FAV. TreeMap<col, node>. |
| 4 | 🔥 Core | 0:50 | **Binary Tree Right Side View** | 199 | 🟡 Medium | 🔴 WALMART | BFS last per level | ★★★★ Asked at Walmart. Last node each level. |
| 4 | 🔥 Core | 1:05 | **Validate Binary Search Tree** | 98 | 🟡 Medium | 🟣 BOTH | Inorder / range check | Inorder sorted OR recursive min/max bounds. |
| 4 | 📘 Extra | 1:20 | **Lowest Common Ancestor of BST** | 235 | 🟡 Medium | 🔵 TOP 150 | BST property split | Go left if both < node, right if both >. |
| 4 | 📘 Extra | 1:30 | **Lowest Common Ancestor of BT** | 236 | 🟡 Medium | 🔵 TOP 150 | Postorder recursive | Return node if found, bubble up. |
| 4 | 📘 Extra | 1:42 | **Kth Smallest Element in BST** | 230 | 🟡 Medium | 🔵 TOP 150 | Inorder traversal | Inorder = sorted. Count to k. |
| 4 | 📘 Extra | 1:52 | **Diameter of Binary Tree** | 543 | 🟢 Easy | 🔵 TOP 150 | DFS max path | Track max(leftH + rightH) globally. |
| 4 | 📘 Extra | 2:02 | **Path Sum** | 112 | 🟢 Easy | 🔵 TOP 150 | DFS target reduction | Subtract node val, check leaf == 0. |
| 4 | 📘 Extra | 2:10 | **Construct BT Preorder+Inorder** | 105 | 🟡 Medium | 🔴 WALMART | Recursive build + map | ★★★ Walmart Bangalore. HashMap for index. |
| 4 | 📘 Extra | 2:22 | **Max Width of Binary Tree** | 662 | 🟡 Medium | 🔴 WALMART | BFS + index tracking | ★★★ Walmart. Track position indices. |
| 4 | 🔴 Deep | 2:32 | **Binary Tree Maximum Path Sum** | 124 | 🔴 Hard | 🔵 TOP 150 | DFS global max update | At each node: max single path vs full path. |
| 4 | 🔴 Deep | 2:45 | **Serialize/Deserialize BT** | 297 | 🔴 Hard | 🔵 TOP 150 | Preorder + delimiter | Preorder with nulls. Queue for deserialize. |
| 4 | 📝 Review | 2:55 | **Pattern Notes** | - | ⚪ - | ⚪ - | BFS vs DFS templates | BFS: queue+level. DFS: recursive return. |

### DAY 5: GRAPHS & TOPOLOGICAL SORT

*Course Schedule ★★★★★. Islands, clone, topo sort, union find*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 5 | ☀ Warm | 0:00 | **Number of Islands** | 200 | 🟡 Medium | 🔴 WALMART | DFS flood fill | ★★★★ Walmart SSE. Mark visited in-place. |
| 5 | 🔥 Core | 0:15 | **Course Schedule** | 207 | 🟡 Medium | 🔴 WALMART | Kahn's BFS topo sort | ★★★★★ Sep 2025. Both BFS and DFS expected! |
| 5 | 🔥 Core | 0:30 | **Course Schedule II** | 210 | 🟡 Medium | 🟣 BOTH | Kahn's + order output | Same as 207 but collect the ordering. |
| 5 | 🔥 Core | 0:45 | **Clone Graph** | 133 | 🟡 Medium | 🟣 BOTH | DFS + HashMap clone | HashMap old→new. Recursive clone. |
| 5 | 🔥 Core | 1:00 | **Rotting Oranges** | 994 | 🟡 Medium | 🔵 TOP 150 | Multi-source BFS | All rotten in queue at once. Track time. |
| 5 | 📘 Extra | 1:15 | **Pacific Atlantic Water Flow** | 417 | 🟡 Medium | 🔵 TOP 150 | Multi-source DFS | DFS from each ocean inward. Intersect. |
| 5 | 📘 Extra | 1:28 | **Surrounded Regions** | 130 | 🟡 Medium | 🔵 TOP 150 | Border DFS + flip | DFS from border Os. Flip remaining. |
| 5 | 📘 Extra | 1:40 | **Graph Valid Tree** | 261 | 🟡 Medium | 🔵 TOP 150 | Union Find / DFS | n-1 edges + no cycle = tree. |
| 5 | 📘 Extra | 1:52 | **Number of Provinces** | 547 | 🟡 Medium | 🔵 TOP 150 | DFS / Union Find | Adjacency matrix. Count components. |
| 5 | 📘 Extra | 2:05 | **Walls and Gates** | 286 | 🟡 Medium | 🔵 TOP 150 | Multi-source BFS | Start BFS from all gates simultaneously. |
| 5 | 📘 Extra | 2:15 | **Number of Connected Components** | 323 | 🟡 Medium | 🔵 TOP 150 | Union Find | Basic union find with path compression. |
| 5 | 📘 Extra | 2:22 | **Redundant Connection** | 684 | 🟡 Medium | 🔵 TOP 150 | Union Find cycle | Edge that creates cycle = redundant. |
| 5 | 📘 Extra | 2:30 | **Accounts Merge** | 721 | 🟡 Medium | 🔵 TOP 150 | Union Find + sort | Union emails, group by root. |
| 5 | 🔴 Deep | 2:38 | **Word Ladder** | 127 | 🔴 Hard | 🟣 BOTH | BFS level-by-level | BFS shortest transform. 26 chars per pos. |
| 5 | 🔴 Deep | 2:48 | **Alien Dictionary** | 269 | 🔴 Hard | 🔵 TOP 150 | Topo sort from char order | Build graph from word pair comparisons. |
| 5 | 📝 Review | 2:55 | **Pattern Notes** | - | ⚪ - | ⚪ - | BFS vs DFS vs Topo vs UF | Shortest=BFS. Exhaust=DFS. Deps=Topo. Comp=UF. |

### DAY 6: HEAPS, BINARY SEARCH & INTERVALS

*Median Stream ★★★★★. Binary Search on answer. Merge Intervals.*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 6 | ☀ Warm | 0:00 | **Binary Search** | 704 | 🟢 Easy | 🔵 TOP 150 | Classic BS template | lo=0, hi=n-1, while lo<=hi. Foundation. |
| 6 | ☀ Warm | 0:08 | **Meeting Rooms** | 252 | 🟢 Easy | 🔵 TOP 150 | Sort + overlap check | Sort by start. Any overlap = false. |
| 6 | 🔥 Core | 0:15 | **Find Median from Data Stream** | 295 | 🔴 Hard | 🔴 WALMART | Two Heaps max+min | ★★★★★ 3+ TIMES. MaxHeap lower, MinHeap upper. |
| 6 | 🔥 Core | 0:35 | **Kth Largest Element in Array** | 215 | 🟡 Medium | 🟣 BOTH | Min Heap size K | PriorityQueue in Java. Or quickselect. |
| 6 | 🔥 Core | 0:48 | **Merge Intervals** | 56 | 🟡 Medium | 🔴 WALMART | Sort + merge overlapping | ★★★★ Walmart iOS + multiple reports. |
| 6 | 🔥 Core | 1:00 | **Meeting Rooms II** | 253 | 🟡 Medium | 🟣 BOTH | Min Heap end times | Sort start, heap tracks room end times. |
| 6 | 🔥 Core | 1:15 | **Search in Rotated Sorted Array** | 33 | 🟡 Medium | 🔴 WALMART | Modified BS + pivot | ★★★ Determine sorted half first. |
| 6 | 📘 Extra | 1:30 | **Min Days to Make M Bouquets** | 1482 | 🟡 Medium | 🔴 WALMART | BS on answer | ★★★★ Walmart. BS on day, feasibility O(n). |
| 6 | 📘 Extra | 1:42 | **Find Min in Rotated Sorted Array** | 153 | 🟡 Medium | 🔵 TOP 150 | BS on rotation point | Compare mid with hi to find pivot. |
| 6 | 📘 Extra | 1:52 | **Search a 2D Matrix** | 74 | 🟡 Medium | 🔵 TOP 150 | Flatten + BS | Treat 2D as 1D. row=mid/cols, col=mid%cols. |
| 6 | 📘 Extra | 2:02 | **Koko Eating Bananas** | 875 | 🟡 Medium | 🔵 TOP 150 | BS on answer | Same pattern as Bouquets. Practice template. |
| 6 | 📘 Extra | 2:12 | **Find Peak Element** | 162 | 🟡 Medium | 🔵 TOP 150 | BS on slope | Move toward rising side. |
| 6 | 📘 Extra | 2:20 | **Insert Interval** | 57 | 🟡 Medium | 🔵 TOP 150 | Merge overlapping | Add all before, merge overlap, add after. |
| 6 | 📘 Extra | 2:28 | **Non-overlapping Intervals** | 435 | 🟡 Medium | 🔵 TOP 150 | Sort by end + greedy | Sort by end time. Count removals. |
| 6 | 📘 Extra | 2:36 | **Min Platforms (Railway)** | - | 🟡 Medium | 🔴 WALMART | Sort arrival/departure | ★★★★ Walmart GFG. Sweep line counters. |
| 6 | 🔴 Deep | 2:44 | **Median of Two Sorted Arrays** | 4 | 🔴 Hard | 🔵 TOP 150 | BS on partition | BS on smaller array. Match partitions. |
| 6 | 📝 Review | 2:55 | **Pattern Notes** | - | ⚪ - | ⚪ - | Heap + BS + Interval templates | PriorityQueue, BS lo/hi, sort-then-sweep. |

### DAY 7: LINKED LISTS & DESIGN (LRU/LFU)

*LRU Cache ★★★★★. Copy Random Pointer ★★★★. LL manipulation.*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 7 | ☀ Warm | 0:00 | **Reverse Linked List** | 206 | 🟢 Easy | 🟣 BOTH | Iterative prev/curr/next | Do it blind in 2 min. Foundation. |
| 7 | ☀ Warm | 0:08 | **Merge Two Sorted Lists** | 21 | 🟢 Easy | 🔵 TOP 150 | Two pointer merge | Dummy head. Compare and link. |
| 7 | ☀ Warm | 0:15 | **Detect Cycle in Linked List** | 141 | 🟢 Easy | 🔴 WALMART | Floyd's fast/slow | ★★★★ Walmart. Fast moves 2, slow moves 1. |
| 7 | 🔥 Core | 0:20 | **Copy List with Random Pointer** | 138 | 🟡 Medium | 🔴 WALMART | Interleave O(1) space | ★★★★ Walmart hiring drive. Know both approaches. |
| 7 | 🔥 Core | 0:38 | **LRU Cache** | 146 | 🟡 Medium | 🔴 WALMART | HashMap + Doubly LL | ★★★★★ #1 DESIGN PROBLEM. O(1) get/put. |
| 7 | 🔥 Core | 1:00 | **Remove Nth Node From End** | 19 | 🟡 Medium | 🔵 TOP 150 | Two pointers gap N | Fast pointer N ahead. When fast→null, slow→target. |
| 7 | 🔥 Core | 1:12 | **Add Two Numbers** | 2 | 🟡 Medium | 🔵 TOP 150 | Carry propagation | Sum digits + carry. Handle different lengths. |
| 7 | 📘 Extra | 1:25 | **Reorder List** | 143 | 🟡 Medium | 🔵 TOP 150 | Find mid + reverse + merge | Split, reverse second half, interleave. |
| 7 | 📘 Extra | 1:38 | **Palindrome Linked List** | 234 | 🟢 Easy | 🔵 TOP 150 | Reverse second half | Find mid, reverse, compare. |
| 7 | 📘 Extra | 1:48 | **Flatten Multilevel Doubly LL** | 430 | 🟡 Medium | 🔵 TOP 150 | DFS / Stack flatten | When child exists, DFS down, link back. |
| 7 | 📘 Extra | 2:00 | **Find the Celebrity** | 277 | 🟡 Medium | 🔴 WALMART | Two-pass elimination | ★★★★ Walmart 2025. Eliminate then verify. |
| 7 | 📘 Extra | 2:12 | **Insert Delete GetRandom O(1)** | 380 | 🟡 Medium | 🔵 TOP 150 | HashMap + ArrayList swap | Swap with last for O(1) remove. |
| 7 | 📘 Extra | 2:22 | **Design Hit Counter** | 362 | 🟡 Medium | 🔵 TOP 150 | Queue / circular buffer | Deque or circular array of 300. |
| 7 | 🔴 Deep | 2:30 | **LFU Cache** | 460 | 🔴 Hard | 🔴 WALMART | HashMap + freq DLL buckets | ★★★★ Walmart LLD follow-up. Min-freq eviction. |
| 7 | 🔴 Deep | 2:45 | **Merge K Sorted Lists** | 23 | 🔴 Hard | 🟣 BOTH | Min Heap of heads | PriorityQueue<ListNode>. O(n log k). |
| 7 | 📝 Review | 2:55 | **Pattern Notes** | - | ⚪ - | ⚪ - | LL techniques + cache design | Reverse, find mid, merge. LRU diagram. |

### DAY 8: STACKS, BACKTRACKING & STRINGS

*Valid Parentheses ★★★★. Monotonic stack. Backtracking template.*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 8 | ☀ Warm | 0:00 | **Valid Parentheses** | 20 | 🟢 Easy | 🔴 WALMART | Stack matching | ★★★★ Walmart SDE-III UI. Push/pop/match. |
| 8 | ☀ Warm | 0:08 | **Implement Queue using Stacks** | 232 | 🟢 Easy | 🔵 TOP 150 | Amortized two stack | Push stack → pop stack. Amortized O(1). |
| 8 | 🔥 Core | 0:15 | **Daily Temperatures** | 739 | 🟡 Medium | 🟣 BOTH | Monotonic decreasing stack | Push indices. Pop when curr > top. |
| 8 | 🔥 Core | 0:28 | **Min Stack** | 155 | 🟡 Medium | 🔵 TOP 150 | Dual stack / pair | Track min alongside each push. |
| 8 | 🔥 Core | 0:40 | **Subsets II** | 90 | 🟡 Medium | 🔴 WALMART | Backtrack + skip dupes | ★★★ Walmart. Sort, skip same at same level. |
| 8 | 🔥 Core | 0:52 | **Permutations** | 46 | 🟡 Medium | 🔵 TOP 150 | Swap / used array | Classic template. choose→explore→unchoose. |
| 8 | 🔥 Core | 1:05 | **Generate Parentheses** | 22 | 🟡 Medium | 🔵 TOP 150 | Open/close count | Add ( if open<n, ) if close<open. |
| 8 | 🔥 Core | 1:18 | **Word Search** | 79 | 🟡 Medium | 🟣 BOTH | DFS backtrack on grid | Grid DFS + visited. Backtrack by unmark. |
| 8 | 📘 Extra | 1:32 | **Letter Combinations Phone** | 17 | 🟡 Medium | 🔵 TOP 150 | Recursive combinations | Map digit→letters. Recursive build. |
| 8 | 📘 Extra | 1:42 | **Combination Sum** | 39 | 🟡 Medium | 🔵 TOP 150 | Unbounded + pruning | Can reuse elements. Sort + prune. |
| 8 | 📘 Extra | 1:52 | **Palindrome Partitioning** | 131 | 🟡 Medium | 🔵 TOP 150 | Partition + palindrome check | Try all cuts. Check palindrome at each. |
| 8 | 📘 Extra | 2:05 | **Evaluate Reverse Polish** | 150 | 🟡 Medium | 🔵 TOP 150 | Stack eval | Push nums, pop 2 on operator, push result. |
| 8 | 📘 Extra | 2:15 | **Basic Calculator II** | 227 | 🟡 Medium | 🔵 TOP 150 | Stack + operator precedence | Process * / immediately, + - defer to stack. |
| 8 | 📘 Extra | 2:25 | **Implement Stack using Queues** | 225 | 🟢 Easy | 🔵 TOP 150 | Push-costly approach | Rotate after each push. |
| 8 | 🔴 Deep | 2:32 | **Largest Rectangle in Histogram** | 84 | 🔴 Hard | 🔵 TOP 150 | Monotonic stack | Stack of indices. Width calculation. |
| 8 | 🔴 Deep | 2:44 | **N-Queens** | 51 | 🔴 Hard | 🔵 TOP 150 | Column/diagonal tracking | Track cols, diag1, diag2 sets. |
| 8 | 📝 Review | 2:55 | **Pattern Notes** | - | ⚪ - | ⚪ - | Stack types + backtrack | Monotonic: next greater. Backtrack: template. |

### DAY 9: ADVANCED DP, DESIGN, BITS & WALMART CUSTOM

*Cover remaining patterns. Walmart custom problems. LLD.*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 9 | ☀ Warm | 0:00 | **Single Number** | 136 | 🟢 Easy | 🔵 TOP 150 | XOR all elements | a^a=0, a^0=a. One pass. |
| 9 | ☀ Warm | 0:06 | **Number of 1 Bits** | 191 | 🟢 Easy | 🔵 TOP 150 | Brian Kernighan's | n & (n-1) removes lowest set bit. |
| 9 | ☀ Warm | 0:10 | **Counting Bits** | 338 | 🟢 Easy | 🔵 TOP 150 | DP + bit pattern | dp[i] = dp[i>>1] + (i&1). |
| 9 | ☀ Warm | 0:15 | **Roman to Integer** | 13 | 🟢 Easy | 🔵 TOP 150 | Map + subtraction rule | If curr < next, subtract. |
| 9 | 🔥 Core | 0:20 | **Longest Common Subsequence** | 1143 | 🟡 Medium | 🔵 TOP 150 | 2D DP classic | dp[i][j] = match? dp[i-1][j-1]+1 : max. |
| 9 | 🔥 Core | 0:33 | **Partition Equal Subset Sum** | 416 | 🟡 Medium | 🔵 TOP 150 | 0/1 Knapsack | Target = sum/2. Boolean DP array. |
| 9 | 🔥 Core | 0:45 | **Maximal Square** | 221 | 🟡 Medium | 🔵 TOP 150 | Grid DP min neighbors | dp[i][j] = min(top,left,diag)+1 if '1'. |
| 9 | 🔥 Core | 0:58 | **Implement Trie** | 208 | 🟡 Medium | 🔴 WALMART | TrieNode children array | ★★★ Walmart. insert/search/startsWith. |
| 9 | 🔥 Core | 1:12 | **Set Matrix Zeroes** | 73 | 🟡 Medium | 🔵 TOP 150 | First row/col flags | Use matrix itself as flag storage. |
| 9 | 🔥 Core | 1:22 | **Rotate Image** | 48 | 🟡 Medium | 🔵 TOP 150 | Transpose + reverse | Transpose then reverse each row. In-place. |
| 9 | 📘 Extra | 1:32 | **Design Twitter** | 355 | 🟡 Medium | 🔵 TOP 150 | HashMap + Heap merge | User→tweets map. Merge feeds with heap. |
| 9 | 📘 Extra | 1:44 | **Design Circular Queue** | 622 | 🟡 Medium | 🔵 TOP 150 | Array + head/tail ptrs | Modular arithmetic for wrap-around. |
| 9 | 📘 Extra | 1:54 | **Design Add & Search Words** | 211 | 🟡 Medium | 🔵 TOP 150 | Trie + DFS wildcard | DFS when hitting '.', try all children. |
| 9 | 📘 Extra | 2:06 | **Task Scheduler** | 621 | 🟡 Medium | 🔵 TOP 150 | Max Heap + cooldown | Most frequent first. Gap = n+1. |
| 9 | 📘 Extra | 2:16 | **Reorganize String** | 767 | 🟡 Medium | 🔵 TOP 150 | Max Heap alternate | Place most frequent, then next. Interleave. |
| 9 | 📘 Extra | 2:24 | **Time Based Key-Value Store** | 981 | 🟡 Medium | 🔵 TOP 150 | HashMap + BS on time | TreeMap or BS on timestamp list. |
| 9 | 🔴 Deep | 2:32 | **LLD: Jukebox / Ticket Booking** | - | 🟡 Medium | 🔴 WALMART | OOP + Strategy + Factory | ★★★ Walmart LLD. SOLID principles. Code in Java. |
| 9 | 🔴 Deep | 2:44 | **Custom: API Latency Aggregation** | - | 🟡 Medium | 🔴 WALMART | Parse + HashMap aggregate | ★★★ Walmart. Parse log strings, compute avg. |
| 9 | 📝 Review | 2:55 | **Pattern Notes** | - | ⚪ - | ⚪ - | DP + Design + Bit tricks | Review all DP types. SOLID. XOR tricks. |

### DAY 10: HARD PROBLEMS, REMAINING & MOCK INTERVIEWS

*Final day. Remaining hard problems + two timed mock interviews.*

| # | Phase | Time | Problem | LC# | Diff | Source | Pattern | Notes |
|---|-------|------|---------|-----|------|--------|---------|-------|
| 10 | ☀ Warm | 0:00 | **Happy Number** | 202 | 🟢 Easy | 🔵 TOP 150 | Floyd's cycle detection | Sum of digit squares. Cycle = not happy. |
| 10 | ☀ Warm | 0:06 | **Reverse Bits** | 190 | 🟢 Easy | 🔵 TOP 150 | Bit-by-bit reverse | Shift result left, add last bit of n. |
| 10 | ☀ Warm | 0:10 | **Pow(x, n)** | 50 | 🟡 Medium | 🔵 TOP 150 | Fast exponentiation | x^n = (x^(n/2))^2. Handle negative n. |
| 10 | 🔥 Core | 0:18 | **Next Permutation** | 31 | 🟡 Medium | 🔵 TOP 150 | Find pivot + swap | Find first decrease from right. Swap + reverse. |
| 10 | 🔥 Core | 0:30 | **Sliding Window Median** | 480 | 🔴 Hard | 🔴 WALMART | Two heaps + window | ★★★★ Walmart hard variant. Rebalance on slide. |
| 10 | 🔥 Core | 0:48 | **First Missing Positive** | 41 | 🔴 Hard | 🔴 WALMART | Cyclic sort / index map | ★★★ Walmart SDE-III UI. Place nums at index. |
| 10 | 🔥 Core | 1:00 | **Flatten Nested List Iterator** | 341 | 🟡 Medium | 🔵 TOP 150 | Stack flattening | Lazy flatten with stack of iterators. |
| 10 | 🔥 Core | 1:10 | **Integer to Roman** | 12 | 🟡 Medium | 🔵 TOP 150 | Greedy denomination | Map values desc. Subtract greedily. |
| 10 | 🔥 Core | 1:18 | **Multiply Strings** | 43 | 🟡 Medium | 🔵 TOP 150 | Grade school multiply | Digit-by-digit. result[i+j+1] += d1*d2. |
| 10 | 🔥 Core | 1:28 | **Jump Game II** | 45 | 🟡 Medium | 🔵 TOP 150 | BFS / greedy window | Track farthest in current jump range. |
| 10 | 📘 Extra | 1:36 | **Shopping Offers** | 638 | 🟡 Medium | 🔵 TOP 150 | DFS + memoization | Try each offer, recurse on remaining. |
| 10 | 📘 Extra | 1:46 | **Max Profit Job Scheduling** | 1235 | 🔴 Hard | 🔵 TOP 150 | Sort + DP + BS | Sort by end. dp[i] = max(skip, take+BS). |
| 10 | 📘 Extra | 1:58 | **Sliding Window Maximum** | 239 | 🔴 Hard | 🔵 TOP 150 | Monotonic deque | Deque keeps potential maxes. Pop expired. |
| 10 | 📘 Extra | 2:08 | **Design In-Memory File System** | 588 | 🔴 Hard | 🔵 TOP 150 | Trie with path nodes | Trie nodes as directories. ls/mkdir/write. |
| 10 | 📘 Extra | 2:16 | **Longest Valid Parentheses** | 32 | 🔴 Hard | 🔵 TOP 150 | Stack / DP | Stack: push indices. DP: dp[i] = extension. |
| 10 | 📘 Extra | 2:24 | **Text Justification** | 68 | 🔴 Hard | 🔵 TOP 150 | Greedy packing + padding | Pack words greedily. Distribute spaces. |
| 10 | 📘 Extra | 2:30 | **Regular Expression Matching** | 10 | 🔴 Hard | 🔵 TOP 150 | 2D DP + regex | dp[i][j] with '.' and '*' handling. |
| 10 | 📘 Extra | 2:36 | **Wildcard Matching** | 44 | 🔴 Hard | 🔵 TOP 150 | 2D DP + pattern | Similar to regex but simpler '*' rule. |
| 10 | 📘 Extra | 2:42 | **Candy** | 135 | 🔴 Hard | 🔵 TOP 150 | Two pass L→R, R→L | Left pass for rising. Right pass for falling. |
| 10 | 📘 Extra | 2:48 | **Burst Balloons** | 312 | 🔴 Hard | 🔵 TOP 150 | Interval DP | Think last balloon popped. dp[l][r]. |
| 10 | 📝 Review | 2:54 | **FINAL REVIEW** | - | ⚪ - | ⚪ - | All patterns checklist | Walk through every pattern. You're ready! 💪 |


---

## 🔥 Recent Walmart Coding Questions (Jun 2025 – Feb 2026)

> **Verified** from LeetCode Discuss, Glassdoor, GeeksforGeeks, Medium, CodingKaro — all real interview reports.

| # | Problem | LC# | Topic | Diff | Freq | Pattern | Source | Date | Role |
|---|---------|-----|-------|------|------|---------|--------|------|------|
| 1 | **Move Zeroes** | 283 | Arrays & Two Pointers | 🟢 Easy | ★★★★★ | Two Pointers (Swap) | O(n) | O(1) | LC Discuss Aug 2025; multiple reports |
| 2 | **Two Sum** | 1 | Arrays & Hashing | 🟢 Easy | ★★★★★ | Hash Map Lookup | O(n) | O(n) | GFG SDE3-UI Nov 2024; Walmart bonus Q |
| 3 | **Contains Duplicate II** | 219 | Arrays & Hashing | 🟢 Easy | ★★★★ | Sliding Window + Hash Set | O(n) | O(k) | LC SDE III Jan 2025 (Duplicates within k range) |
| 4 | **Maximum Subarray** | 53 | Arrays & DP | 🟡 Medium | ★★★★★ | Kadane's Algorithm | O(n) | O(1) | LC Discuss Aug 2025; multiple reports |
| 5 | **Subarray Sum Equals K** | 560 | Arrays & Prefix Sum | 🟡 Medium | ★★★★★ | Prefix Sum + Hash Map | O(n) | O(n) | LC SDE3 Dec 2024; Sept 2025 |
| 6 | **Product of Array Except Self** | 238 | Arrays | 🟡 Medium | ★★★★ | Prefix/Suffix Product | O(n) | O(1) | Glassdoor 2025 multiple reports |
| 7 | **Sort Colors** | 75 | Arrays & Two Pointers | 🟡 Medium | ★★★★ | Dutch National Flag | O(n) | O(1) | LC SSE Interview 2025 (0,1 matrix round) |
| 8 | **Trapping Rain Water** | 42 | Arrays & Two Pointers | 🔴 Hard | ★★★★ | Two Pointers / Stack | O(n) | O(1) | LC SDE III Jan 2025 Bangalore |
| 9 | **First Missing Positive** | 41 | Arrays | 🔴 Hard | ★★★★ | Cyclic Sort / Index Map | O(n) | O(1) | Medium SDE3-UI Nov 2024 |
| 10 | **Valid Parentheses** | 20 | Strings & Stack | 🟢 Easy | ★★★★★ | Stack Matching | O(n) | O(n) | Medium SDE3-UI Nov 2024; GFG 2025 |
| 11 | **Squares of a Sorted Array** | 977 | Arrays & Two Pointers | 🟢 Easy | ★★★★ | Two Pointers (Ends Inward) | O(n) | O(n) | Medium SDE-III iOS Feb 2025 |
| 12 | **Longest Palindromic Substring** | 5 | Strings & DP | 🟡 Medium | ★★★ | Expand Around Center | O(n²) | O(1) | LC Discuss 2025 string round |
| 13 | **String to Integer (atoi)** | 8 | Strings | 🟡 Medium | ★★★ | State Machine / Parsing | O(n) | O(1) | Glassdoor 2025 medium-hard string Q |
| 14 | **Reverse Linked List** | 206 | Linked List | 🟢 Easy | ★★★★★ | Iterative / Recursive | O(n) | O(1) | GFG SDE3 Jul 2025 (Round 1) |
| 15 | **Linked List Cycle** | 141 | Linked List | 🟢 Easy | ★★★★ | Floyd's Tortoise & Hare | O(n) | O(1) | GFG Senior SWE; LC 2025 |
| 16 | **LRU Cache** | 146 | Linked List & Design | 🟡 Medium | ★★★★★ | HashMap + Doubly LL | O(1) | O(capacity) | LC SDE3 Dec 2024; GFG Senior SWE |
| 17 | **LFU Cache** | 460 | Linked List & Design | 🔴 Hard | ★★★★ | HashMap + Freq Doubly LL | O(1) | O(capacity) | LC SDE3 Dec 2024; LC Discuss Aug 2025 |
| 18 | **Binary Tree Level Order Traversal** | 102 | Trees & BFS | 🟡 Medium | ★★★★★ | BFS Queue | O(n) | O(n) | GFG SDE3 Jul 2025 (spiral form variant) |
| 19 | **Binary Tree Zigzag Level Order** | 103 | Trees & BFS | 🟡 Medium | ★★★★★ | BFS + Alternating Direction | O(n) | O(n) | GFG SDE3 Jul 2025 (print tree spiral) |
| 20 | **Kth Smallest Element in BST** | 230 | Trees & BST | 🟡 Medium | ★★★★ | Inorder Traversal | O(h+k) | O(h) | GFG SDE3 Jul 2025 (Round 1 Q2) |
| 21 | **Validate Binary Search Tree** | 98 | Trees & BST | 🟡 Medium | ★★★★ | Inorder Traversal / Range | O(n) | O(h) | Glassdoor 2025; LC Discuss |
| 22 | **Two Sum IV - Input is a BST** | 653 | Trees & Hashing | 🟢 Easy | ★★★ | BST Traversal + Hash Set | O(n) | O(n) | LC Discuss Aug 2025 (Fresher 2022/repeated 2025) |
| 23 | **Binary Tree Game (Custom)** | - | Trees & DFS | 🔴 Hard | ★★★ | DFS Game Theory / Subtree Score | O(n) | O(h) | LC SDE III Aug 2025 (tree player game) |
| 24 | **Serialize and Deserialize BT** | 297 | Trees & Design | 🔴 Hard | ★★★ | Preorder + Queue | O(n) | O(n) | Glassdoor 2025; recurring question |
| 25 | **Number of Islands** | 200 | Graphs & DFS/BFS | 🟡 Medium | ★★★★★ | DFS/BFS Flood Fill | O(m·n) | O(m·n) | LC SSE Interview 2025 (0,1 matrix) |
| 26 | **Course Schedule** | 207 | Graphs & Topological Sort | 🟡 Medium | ★★★★★ | Kahn's BFS / DFS Cycle | O(V+E) | O(V+E) | LC SDE III Sept 2025; Aug 2025 |
| 27 | **Course Schedule II** | 210 | Graphs & Topological Sort | 🟡 Medium | ★★★★ | Kahn's BFS | O(V+E) | O(V+E) | LC SDE III Aug 2025 (scheduling variant) |
| 28 | **Spiral Matrix** | 54 | Matrix & Simulation | 🟡 Medium | ★★★★ | Layer-by-Layer Traversal | O(m·n) | O(1) | GFG SDE On-Campus 2024; GFG SDE3 Jul 2025 |
| 29 | **Climbing Stairs** | 70 | Dynamic Programming | 🟢 Easy | ★★★★ | Fibonacci DP | O(n) | O(1) | Medium SDE-III iOS Feb 2025 (recursion + memo) |
| 30 | **House Robber II** | 213 | Dynamic Programming | 🟡 Medium | ★★★★★ | Circular DP (Two Passes) | O(n) | O(1) | LC SDE3 Dec 2024 (Round 1 Q1) |
| 31 | **Coin Change** | 322 | Dynamic Programming | 🟡 Medium | ★★★★ | Unbounded Knapsack | O(n·amt) | O(amt) | LC SDE III Sept 2025 (memo + tabulation) |
| 32 | **Best Time to Buy and Sell Stock with Cooldown** | 309 | Dynamic Programming | 🟡 Medium | ★★★★ | State Machine DP | O(n) | O(1) | Medium TechieContent Dec 2024 SDE III |
| 33 | **Min Number of Days to Make m Bouquets** | 1482 | Binary Search & Greedy | 🟡 Medium | ★★★ | Binary Search on Answer | O(n log d) | O(1) | Medium TechieContent Dec 2024 SDE III |
| 34 | **Jump Game** | 55 | DP / Greedy | 🟡 Medium | ★★★ | Greedy Max Reach | O(n) | O(1) | LC Discuss Aug 2025 (Walmart SWE-III) |
| 35 | **Subsets II** | 90 | Backtracking | 🟡 Medium | ★★★ | Sort + Skip Duplicates | O(2^n) | O(n) | LC Discuss Aug 2025 (Walmart SWE-III) |
| 36 | **Find Median from Data Stream** | 295 | Heap | 🔴 Hard | ★★★★★ | Two Heaps (Max + Min) | O(log n) | O(n) | LC SDE III Aug 2025 (variation asked) |
| 37 | **Search in Rotated Sorted Array** | 33 | Binary Search | 🟡 Medium | ★★★★ | Modified BS + Pivot | O(log n) | O(1) | GFG SDE3 Instahyre 2025 (Round 2) |
| 38 | **Merge Intervals** | 56 | Intervals & Sorting | 🟡 Medium | ★★★★★ | Sort + Merge Overlapping | O(n log n) | O(n) | Medium SDE-III iOS Feb 2025; Glassdoor 2025 |
| 39 | **Minimum Platforms (Meeting Rooms variant)** | - | Intervals & Sorting | 🟡 Medium | ★★★★ | Sort Arrival/Departure | O(n log n) | O(n) | GFG recurring; Glassdoor 2025 |
| 40 | **Combination Sum (No Duplicates variant)** | 40 | Backtracking | 🟡 Medium | ★★★ | Sort + Skip Duplicates | O(2^n) | O(n) | GFG SDE3 Instahyre 2025 (Round 1) |
| 41 | **Subsets** | 78 | Backtracking | 🟡 Medium | ★★★ | Include/Exclude | O(2^n) | O(n) | GFG SDE3 Instahyre 2025 (print all subsets) |
| 42 | **Stack Implementation (from scratch)** | - | Stack | 🟢 Easy | ★★★★ | Array-based Stack | O(1) | O(n) | GFG SDE3 Jul 2025 (Round 2) |
| 43 | **Priority Queue Basics** | - | Heap / Queue | 🟢 Easy | ★★★ | Min/Max Heap Operations | O(log n) | O(n) | GFG SDE3 Jul 2025 (Round 2) |
| 44 | **Design HashMap** | 706 | Design | 🟢 Easy | ★★★★ | Array of Buckets + Chaining | O(1) avg | O(n) | GFG SDE3 Jul 2025 (HashMap internals) |
| 45 | **Implement SET using Primitives** | - | Design | 🟡 Medium | ★★★ | Hash-based Set | O(1) avg | O(n) | LC SDE III Jan 2025 Bangalore |
| 46 | **Design Connection Pool** | - | Design & OOP | 🟡 Medium | ★★★ | Pool Pattern + Thread Safety | O(1) | O(n) | LC SSE Interview 2025 (LLD round) |
| 47 | **Design Event Calendar (Meeting Scheduler)** | - | Design & OOP | 🟡 Medium | ★★★ | Interval + Room Booking | O(n log n) | O(n) | GFG SDE3 Jul 2025 (LLD round) |
| 48 | **Design Jukebox** | - | Design & OOP | 🟡 Medium | ★★★ | State Pattern + OOP | - | - | LC SDE III Aug 2025 (LLD round) |
| 49 | **Design Instagram/Facebook Feed** | - | Design & HLD | 🔴 Hard | ★★★ | Fan-out + Feed Ranking | - | - | LC SDE3 Dec 2024 (HLD round) |
| 50 | **Gas Station** | 134 | Greedy | 🟡 Medium | ★★★ | Circular Greedy Sum | O(n) | O(1) | LC Discuss Aug 2025 (Fresher round) |
| 51 | **Average API Latency from Log String** | - | String Parsing & HashMap | 🟡 Medium | ★★★ | Parse + Group + Average | O(n) | O(n) | LC SDE III Jan 2025 (custom Q3) |
| 52 | **SQL: Highest Salary per Department** | - | SQL & Joins | 🟡 Medium | ★★★ | GROUP BY + Subquery/Window | - | - | GFG SDE3 Instahyre 2025 |
| 53 | **SQL: Customers Who Never Bought Product** | - | SQL & LEFT JOIN | 🟡 Medium | ★★★ | LEFT JOIN + IS NULL / NOT IN | - | - | GFG SDE3 Instahyre 2025 (no subquery follow-up) |
| 54 | **Course Schedule + Subarray Sum Equals K + House Robber II appeared in 3+ independent reports. Heap (Find Median) is the #1 asked Hard question.** |  |  | ⚪  |  |  |  |  |  |
| 55 | **2025 interviews heavily mix DSA + Java internals + LLD in same round. Expect HashMap internals, volatile keyword, design patterns alongside coding.** |  |  | ⚪  |  |  |  |  |  |
| 56 | **~25% Easy (warm-up/bonus), ~55% Medium (core evaluation), ~20% Hard (differentiator). SDE-III gets 2-3 problems per round.** |  |  | ⚪  |  |  |  |  |  |
| 57 | **Walmart frequently asks custom problems NOT on LeetCode: API latency parsing, connection pool design, event calendar LLD, Jukebox design.** |  |  | ⚪  |  |  |  |  |  |
| 58 | **Nearly all 2025 reports confirm Java is primary language. Expect: HashMap internals, multithreading (volatile, CompletableFuture), design patterns (Strategy, Singleton).** |  |  | ⚪  |  |  |  |  |  |
| 59 | **Round 1: DSA (2-3 problems, 60 min) → Round 2: LLD + HLD + Java (60 min) → Round 3: Hiring Manager (resume deep dive + system questions).** |  |  | ⚪  |  |  |  |  |  |
| 60 | **Karat (for US roles), HackerEarth/HackerRank (for India OA), Google Meet/Teams (for live rounds). Code in IDE, dry-run test cases.** |  |  | ⚪  |  |  |  |  |  |
| 61 | **1) Always explain approach BEFORE coding  2) Discuss time/space  3) Prepare LFU/LRU Cache implementation  4) Know Kafka internals for HM round** |  |  | ⚪  |  |  |  |  |  |
| 62 | **3Sum** | 15 | Arrays & Two Pointers | 🟡 Medium | ★★★★ | Sort + Two Pointers | LeetCode Discuss (Principal Eng) | 2025 | Principal Eng |
| 63 | **Contains Duplicate Within K Distance** | 219 | Arrays & Hashing | 🟢 Easy | ★★★★ | Sliding Window + HashSet | LeetCode Discuss (SDE-III Bangalore) | Jan 2025 | SDE-III |
| 64 | **Best Time to Buy & Sell Stock w/ Cooldown** | 309 | Dynamic Programming | 🟡 Medium | ★★★★ | State Machine DP | Medium (TechieContent SDE-III) | Dec 2024 | SDE-III |
| 65 | **Target Sum** | 494 | Dynamic Programming | 🟡 Medium | ★★★★ | 0/1 Knapsack Variant | CodingKaro (Walmart interview) | 2025 | SDE-III |
| 66 | **Bottom View of Binary Tree** | - | Trees & BFS | 🟡 Medium | ★★★★★ | BFS + Vertical Order Map | LeetCode + GFG (3+ reports) | Jun 2024–2025 | SDE-III |
| 67 | **Binary Tree Right Side View** | 199 | Trees & BFS | 🟡 Medium | ★★★★ | BFS Last in Level | GFG (SDE-III Hyderabad) | 2025 | SDE-III |
| 68 | **Maximum Width of Binary Tree** | 662 | Trees & BFS | 🟡 Medium | ★★★ | BFS + Index Tracking | LeetCode Discuss (SDE-III Bangalore) | Jun 2024–2025 | SDE-III |
| 69 | **Construct BT from Preorder & Inorder** | 105 | Trees & Recursion | 🟡 Medium | ★★★ | Recursive Build + HashMap | LeetCode Discuss (SDE-III Bangalore) | Jun 2024–2025 | SDE-III |
| 70 | **Left Boundary Traversal of BT** | - | Trees & DFS | 🟡 Medium | ★★★ | DFS Boundary Walk | LeetCode Discuss (SDE-III Bangalore) | Jun 2024 | SDE-III |
| 71 | **Largest Perimeter Island (Custom)** | - | Graphs & DFS | 🟡 Medium | ★★★ | DFS + Perimeter Tracking | LeetCode Discuss (SSE DSA round) | 2025 | SSE |
| 72 | **Graph DFS + Binary Search (min of max)** | - | Graphs & Binary Search | 🟡 Medium | ★★★ | BS on Answer + DFS | CodingKaro (DSA round) | 2025 | SDE-III |
| 73 | **Sliding Window Median** | 480 | Heap & Sliding Window | 🔴 Hard | ★★★★ | Two Heaps + Window | CodingKaro (Walmart learning) | 2025 | SDE-III |
| 74 | **Priority Queue for Order Processing** | - | Heap & Design | 🟡 Medium | ★★★ | Custom Comparator PQ | LeetCode Discuss (SDE-III hiring drive) | 2025 | SDE-III |
| 75 | **Copy List with Random Pointer** | 138 | Linked List & Hashing | 🟡 Medium | ★★★★ | Interleave / HashMap O(1) | CodingKaro (in-person hiring drive) | 2025 | SDE-III |
| 76 | **Detect Cycle in Linked List** | 141 | Linked List | 🟢 Easy | ★★★★ | Floyd's Tortoise & Hare | GFG (SDE-III, multiple reports) | 2024–2025 | SDE-III |
| 77 | **Min Days to Make M Bouquets** | 1482 | Binary Search | 🟡 Medium | ★★★★ | Binary Search on Answer | LeetCode + Medium (TechieContent) | Jun–Dec 2024 | SDE-III |
| 78 | **Find the Celebrity** | 277 | Design & Arrays | 🟡 Medium | ★★★★ | Two-pass Elimination | CodingKaro + LeetCode (SDE-III) | 2025 | SDE-III |
| 79 | **Design Connection Pool (Custom LLD)** | - | Design / OOP | 🟡 Medium | ★★★ | OOP + Strategy Pattern | LeetCode Discuss (SSE LLD round) | 2025 | SSE |
| 80 | **Design Jukebox (Custom LLD)** | - | Design / OOP | 🟡 Medium | ★★★ | OOP + State Pattern | LeetCode Discuss (SDE-III LLD) | Aug 2025 | SDE-III |
| 81 | **Design Message Delivery System (LLD)** | - | Design / OOP | 🟡 Medium | ★★★ | Strategy + Factory Pattern | LeetCode Discuss (SDE-III hiring drive) | 2025 | SDE-III |
| 82 | **Min Platforms (Railway Station)** | - | Intervals & Sorting | 🟡 Medium | ★★★★ | Sort Arrival/Departure | GFG (SDE-III, 2+ reports) | 2024–2025 | SDE-III |
| 83 | **Longest Substring Without Repeating Chars** | 3 | Strings & Sliding Window | 🟡 Medium | ★★★ | Sliding Window + Set | Glassdoor (Senior SWE prep tips) | 2025 | Senior SWE |
| 84 | **Group Anagrams** | 49 | Strings & Hashing | 🟡 Medium | ★★★ | Sorted Key HashMap | Glassdoor (Senior SWE prep tips) | 2025 | Senior SWE |
| 85 | **Calculate Avg Latency per API (Custom)** | - | Strings & HashMap | 🟡 Medium | ★★★ | Parsing + HashMap Aggregation | LeetCode Discuss (SDE-III Bangalore) | Jan 2025 | SDE-III |
| 86 | **Implement SET using Primitives (Custom)** | - | Design / Hashing | 🟡 Medium | ★★★ | Array + Hashing from Scratch | LeetCode Discuss (SDE-III Bangalore) | Jan 2025 | SDE-III |
| 87 | **Split 0s/1s String for Max Score** | - | Arrays & Prefix Sum | 🟡 Medium | ★★★ | Prefix Count Optimization | LeetCode Discuss (SDE-3 algo round) | 2025 | SDE-III |
| 88 | **Interleave Digits and Alphabets** | - | Strings & Two Pointers | ⚪ Easy-Medium | ★★★ | Two-Pass Separation + Merge | LeetCode Discuss (SDE-3 algo round) | 2025 | SDE-III |
| 89 | **Binary Tree Two-Player Game (Custom)** | - | Trees & DFS/Game Theory | 🔴 Hard | ★★★ | DFS + Minimax Variant | LeetCode Discuss (SDE-III) | Aug 2025 | SDE-III |

---

## 📋 Top 150 Walmart Coding Questions

> Ordered by frequency (★★★★★ = most asked), grouped by topic, then by difficulty ascending.

| # | Problem | LC# | Topic | Diff | Freq | Pattern | Time | Space |
|---|---------|-----|-------|------|------|---------|------|-------|
| 1 | **Two Sum** | 1 | Arrays & Hashing | 🟢 Easy | ★★★★★ | Hash Map Lookup | O(n) | O(n) |
| 2 | **Best Time to Buy and Sell Stock** | 121 | Arrays | 🟢 Easy | ★★★★★ | Kadane's / Sliding Window | O(n) | O(1) |
| 3 | **Valid Anagram** | 242 | Strings & Hashing | 🟢 Easy | ★★★★★ | Frequency Count | O(n) | O(1) |
| 4 | **Group Anagrams** | 49 | Strings & Hashing | 🟡 Medium | ★★★★★ | Hash Map + Sorted Key | O(n·k log k) | O(n·k) |
| 5 | **Product of Array Except Self** | 238 | Arrays | 🟡 Medium | ★★★★★ | Prefix/Suffix Product | O(n) | O(1) |
| 6 | **Contains Duplicate** | 217 | Arrays & Hashing | 🟢 Easy | ★★★★★ | Hash Set | O(n) | O(n) |
| 7 | **Maximum Subarray** | 53 | Arrays | 🟡 Medium | ★★★★★ | Kadane's Algorithm | O(n) | O(1) |
| 8 | **3Sum** | 15 | Arrays & Two Pointers | 🟡 Medium | ★★★★★ | Sort + Two Pointers | O(n²) | O(1) |
| 9 | **Merge Intervals** | 56 | Arrays & Sorting | 🟡 Medium | ★★★★★ | Sort + Merge | O(n log n) | O(n) |
| 10 | **Top K Frequent Elements** | 347 | Arrays & Hashing | 🟡 Medium | ★★★★★ | Bucket Sort / Heap | O(n) | O(n) |
| 11 | **Longest Substring Without Repeating Characters** | 3 | Strings & Sliding Window | 🟡 Medium | ★★★★★ | Sliding Window + Set | O(n) | O(min(n,m)) |
| 12 | **Valid Parentheses** | 20 | Strings & Stack | 🟢 Easy | ★★★★★ | Stack Matching | O(n) | O(n) |
| 13 | **Move Zeroes** | 283 | Arrays & Two Pointers | 🟢 Easy | ★★★★ | Two Pointers (Swap) | O(n) | O(1) |
| 14 | **Container With Most Water** | 11 | Arrays & Two Pointers | 🟡 Medium | ★★★★ | Two Pointers (Greedy) | O(n) | O(1) |
| 15 | **Rotate Array** | 189 | Arrays | 🟡 Medium | ★★★★ | Reverse Trick | O(n) | O(1) |
| 16 | **Longest Consecutive Sequence** | 128 | Arrays & Hashing | 🟡 Medium | ★★★★ | Hash Set + Sequence Start | O(n) | O(n) |
| 17 | **Subarray Sum Equals K** | 560 | Arrays & Prefix Sum | 🟡 Medium | ★★★★ | Prefix Sum + Hash Map | O(n) | O(n) |
| 18 | **Trapping Rain Water** | 42 | Arrays & Two Pointers | 🔴 Hard | ★★★★ | Two Pointers / Stack | O(n) | O(1) |
| 19 | **Minimum Window Substring** | 76 | Strings & Sliding Window | 🔴 Hard | ★★★★ | Sliding Window + Freq Map | O(n) | O(m) |
| 20 | **Find All Anagrams in a String** | 438 | Strings & Sliding Window | 🟡 Medium | ★★★★ | Sliding Window + Freq | O(n) | O(1) |
| 21 | **String to Integer (atoi)** | 8 | Strings | 🟡 Medium | ★★★★ | State Machine / Parsing | O(n) | O(1) |
| 22 | **Longest Palindromic Substring** | 5 | Strings & DP | 🟡 Medium | ★★★★ | Expand Around Center | O(n²) | O(1) |
| 23 | **First Missing Positive** | 41 | Arrays | 🔴 Hard | ★★★★ | Cyclic Sort / Index Map | O(n) | O(1) |
| 24 | **Next Permutation** | 31 | Arrays | 🟡 Medium | ★★★ | Find Pivot + Swap | O(n) | O(1) |
| 25 | **Spiral Matrix** | 54 | Arrays & Matrix | 🟡 Medium | ★★★ | Layer-by-Layer Traversal | O(m·n) | O(1) |
| 26 | **Reverse Linked List** | 206 | Linked List | 🟢 Easy | ★★★★★ | Iterative / Recursive | O(n) | O(1) |
| 27 | **Merge Two Sorted Lists** | 21 | Linked List | 🟢 Easy | ★★★★★ | Two Pointer Merge | O(n+m) | O(1) |
| 28 | **Linked List Cycle** | 141 | Linked List | 🟢 Easy | ★★★★★ | Floyd's Tortoise & Hare | O(n) | O(1) |
| 29 | **Remove Nth Node From End of List** | 19 | Linked List | 🟡 Medium | ★★★★ | Two Pointers (Gap) | O(n) | O(1) |
| 30 | **Add Two Numbers** | 2 | Linked List | 🟡 Medium | ★★★★ | Carry Propagation | O(max(n,m)) | O(max(n,m)) |
| 31 | **LRU Cache** | 146 | Linked List & Design | 🟡 Medium | ★★★★★ | HashMap + Doubly LL | O(1) | O(capacity) |
| 32 | **Merge K Sorted Lists** | 23 | Linked List & Heap | 🔴 Hard | ★★★★ | Min Heap / Divide & Conquer | O(n log k) | O(k) |
| 33 | **Copy List with Random Pointer** | 138 | Linked List & Hashing | 🟡 Medium | ★★★ | Interleave / Hash Map | O(n) | O(1) |
| 34 | **Reorder List** | 143 | Linked List | 🟡 Medium | ★★★ | Find Mid + Reverse + Merge | O(n) | O(1) |
| 35 | **Flatten a Multilevel Doubly LL** | 430 | Linked List | 🟡 Medium | ★★★ | DFS / Stack | O(n) | O(n) |
| 36 | **Binary Tree Level Order Traversal** | 102 | Trees & BFS | 🟡 Medium | ★★★★★ | BFS Queue | O(n) | O(n) |
| 37 | **Maximum Depth of Binary Tree** | 104 | Trees & DFS | 🟢 Easy | ★★★★★ | Recursive DFS | O(n) | O(h) |
| 38 | **Validate Binary Search Tree** | 98 | Trees & BST | 🟡 Medium | ★★★★★ | Inorder Traversal / Range | O(n) | O(h) |
| 39 | **Invert Binary Tree** | 226 | Trees & DFS | 🟢 Easy | ★★★★ | Recursive Swap | O(n) | O(h) |
| 40 | **Lowest Common Ancestor of BST** | 235 | Trees & BST | 🟡 Medium | ★★★★ | BST Property Split | O(h) | O(1) |
| 41 | **Lowest Common Ancestor of BT** | 236 | Trees & BFS/DFS | 🟡 Medium | ★★★★ | Recursive Postorder | O(n) | O(h) |
| 42 | **Binary Tree Zigzag Level Order** | 103 | Trees & BFS | 🟡 Medium | ★★★★ | BFS + Alternating Direction | O(n) | O(n) |
| 43 | **Serialize and Deserialize BT** | 297 | Trees & Design | 🔴 Hard | ★★★★ | Preorder + Queue | O(n) | O(n) |
| 44 | **Kth Smallest Element in BST** | 230 | Trees & BST | 🟡 Medium | ★★★★ | Inorder Traversal | O(h+k) | O(h) |
| 45 | **Construct BT from Preorder & Inorder** | 105 | Trees & Recursion | 🟡 Medium | ★★★ | Recursive Build + HashMap | O(n) | O(n) |
| 46 | **Symmetric Tree** | 101 | Trees & DFS | 🟢 Easy | ★★★ | Mirror Check Recursive | O(n) | O(h) |
| 47 | **Path Sum** | 112 | Trees & DFS | 🟢 Easy | ★★★ | DFS + Target Reduction | O(n) | O(h) |
| 48 | **Binary Tree Right Side View** | 199 | Trees & BFS | 🟡 Medium | ★★★ | BFS Last in Level | O(n) | O(n) |
| 49 | **Diameter of Binary Tree** | 543 | Trees & DFS | 🟢 Easy | ★★★ | DFS Max Path | O(n) | O(h) |
| 50 | **Binary Tree Maximum Path Sum** | 124 | Trees & DFS | 🔴 Hard | ★★★ | DFS Global Max Update | O(n) | O(h) |
| 51 | **Number of Islands** | 200 | Graphs & DFS/BFS | 🟡 Medium | ★★★★★ | DFS/BFS Flood Fill | O(m·n) | O(m·n) |
| 52 | **Clone Graph** | 133 | Graphs & DFS | 🟡 Medium | ★★★★ | DFS + HashMap Clone | O(V+E) | O(V) |
| 53 | **Course Schedule** | 207 | Graphs & Topological Sort | 🟡 Medium | ★★★★ | Topological Sort (BFS/DFS) | O(V+E) | O(V+E) |
| 54 | **Course Schedule II** | 210 | Graphs & Topological Sort | 🟡 Medium | ★★★★ | Kahn's BFS | O(V+E) | O(V+E) |
| 55 | **Word Ladder** | 127 | Graphs & BFS | 🔴 Hard | ★★★★ | BFS Level-by-Level | O(M²·N) | O(M²·N) |
| 56 | **Pacific Atlantic Water Flow** | 417 | Graphs & DFS | 🟡 Medium | ★★★ | Multi-source DFS | O(m·n) | O(m·n) |
| 57 | **Graph Valid Tree** | 261 | Graphs & Union Find | 🟡 Medium | ★★★ | Union Find / DFS Cycle | O(V+E) | O(V) |
| 58 | **Alien Dictionary** | 269 | Graphs & Topological Sort | 🔴 Hard | ★★★ | Topo Sort from Char Order | O(C) | O(1) |
| 59 | **Rotting Oranges** | 994 | Graphs & BFS | 🟡 Medium | ★★★★ | Multi-source BFS | O(m·n) | O(m·n) |
| 60 | **Walls and Gates** | 286 | Graphs & BFS | 🟡 Medium | ★★★ | Multi-source BFS | O(m·n) | O(m·n) |
| 61 | **Climbing Stairs** | 70 | Dynamic Programming | 🟢 Easy | ★★★★★ | Fibonacci DP | O(n) | O(1) |
| 62 | **Coin Change** | 322 | Dynamic Programming | 🟡 Medium | ★★★★★ | Unbounded Knapsack | O(n·amount) | O(amount) |
| 63 | **Longest Increasing Subsequence** | 300 | Dynamic Programming | 🟡 Medium | ★★★★ | Binary Search / DP | O(n log n) | O(n) |
| 64 | **House Robber** | 198 | Dynamic Programming | 🟡 Medium | ★★★★ | Linear DP (Skip/Take) | O(n) | O(1) |
| 65 | **Word Break** | 139 | Dynamic Programming | 🟡 Medium | ★★★★ | DP + Hash Set | O(n²·m) | O(n) |
| 66 | **Unique Paths** | 62 | Dynamic Programming | 🟡 Medium | ★★★★ | Grid DP | O(m·n) | O(n) |
| 67 | **Edit Distance** | 72 | Dynamic Programming | 🟡 Medium | ★★★★ | 2D DP (3 Operations) | O(m·n) | O(m·n) |
| 68 | **Longest Common Subsequence** | 1143 | Dynamic Programming | 🟡 Medium | ★★★ | 2D DP Classic | O(m·n) | O(m·n) |
| 69 | **Decode Ways** | 91 | Dynamic Programming | 🟡 Medium | ★★★ | Linear DP (1/2 digit) | O(n) | O(1) |
| 70 | **Partition Equal Subset Sum** | 416 | Dynamic Programming | 🟡 Medium | ★★★ | 0/1 Knapsack | O(n·sum) | O(sum) |
| 71 | **Maximal Square** | 221 | Dynamic Programming | 🟡 Medium | ★★★ | Grid DP (min neighbors) | O(m·n) | O(n) |
| 72 | **Jump Game** | 55 | Dynamic Programming / Greedy | 🟡 Medium | ★★★★ | Greedy Max Reach | O(n) | O(1) |
| 73 | **Regular Expression Matching** | 10 | Dynamic Programming | 🔴 Hard | ★★★ | 2D DP + Regex | O(m·n) | O(m·n) |
| 74 | **Wildcard Matching** | 44 | Dynamic Programming | 🔴 Hard | ★★★ | 2D DP + Pattern | O(m·n) | O(m·n) |
| 75 | **Burst Balloons** | 312 | Dynamic Programming | 🔴 Hard | ★★★ | Interval DP | O(n³) | O(n²) |
| 76 | **Binary Search** | 704 | Binary Search | 🟢 Easy | ★★★★★ | Classic BS Template | O(log n) | O(1) |
| 77 | **Search in Rotated Sorted Array** | 33 | Binary Search | 🟡 Medium | ★★★★★ | Modified BS + Pivot | O(log n) | O(1) |
| 78 | **Find Minimum in Rotated Sorted Array** | 153 | Binary Search | 🟡 Medium | ★★★★ | BS on Rotation Point | O(log n) | O(1) |
| 79 | **Search a 2D Matrix** | 74 | Binary Search & Matrix | 🟡 Medium | ★★★★ | Flatten + BS | O(log(m·n)) | O(1) |
| 80 | **Median of Two Sorted Arrays** | 4 | Binary Search | 🔴 Hard | ★★★★ | BS on Partition | O(log(min(m,n))) | O(1) |
| 81 | **Koko Eating Bananas** | 875 | Binary Search | 🟡 Medium | ★★★ | BS on Answer | O(n log m) | O(1) |
| 82 | **Find Peak Element** | 162 | Binary Search | 🟡 Medium | ★★★ | BS on Slope | O(log n) | O(1) |
| 83 | **Time Based Key-Value Store** | 981 | Binary Search & Design | 🟡 Medium | ★★★ | HashMap + BS on Time | O(log n) | O(n) |
| 84 | **Min Stack** | 155 | Stack | 🟡 Medium | ★★★★ | Dual Stack / Pair Stack | O(1) | O(n) |
| 85 | **Daily Temperatures** | 739 | Stack | 🟡 Medium | ★★★★ | Monotonic Stack | O(n) | O(n) |
| 86 | **Evaluate Reverse Polish Notation** | 150 | Stack | 🟡 Medium | ★★★ | Stack Eval | O(n) | O(n) |
| 87 | **Largest Rectangle in Histogram** | 84 | Stack | 🔴 Hard | ★★★★ | Monotonic Stack | O(n) | O(n) |
| 88 | **Basic Calculator II** | 227 | Stack | 🟡 Medium | ★★★ | Stack + Operator Precedence | O(n) | O(n) |
| 89 | **Implement Queue using Stacks** | 232 | Stack & Queue | 🟢 Easy | ★★★ | Amortized Two Stack | O(1) amortized | O(n) |
| 90 | **Sliding Window Maximum** | 239 | Deque | 🔴 Hard | ★★★ | Monotonic Deque | O(n) | O(k) |
| 91 | **Kth Largest Element in an Array** | 215 | Heap / Quickselect | 🟡 Medium | ★★★★★ | Min Heap / Quickselect | O(n) | O(k) |
| 92 | **Find Median from Data Stream** | 295 | Heap | 🔴 Hard | ★★★★ | Two Heaps (Max + Min) | O(log n) | O(n) |
| 93 | **Task Scheduler** | 621 | Heap & Greedy | 🟡 Medium | ★★★ | Max Heap + Cooldown | O(n log n) | O(1) |
| 94 | **Meeting Rooms II** | 253 | Heap & Intervals | 🟡 Medium | ★★★★ | Min Heap End Times | O(n log n) | O(n) |
| 95 | **Reorganize String** | 767 | Heap & Greedy | 🟡 Medium | ★★★ | Max Heap + Alternate | O(n log n) | O(n) |
| 96 | **Letter Combinations of a Phone Number** | 17 | Backtracking | 🟡 Medium | ★★★★ | Recursive Combinations | O(4^n) | O(n) |
| 97 | **Permutations** | 46 | Backtracking | 🟡 Medium | ★★★★ | Swap / Used Array | O(n!) | O(n) |
| 98 | **Subsets** | 78 | Backtracking | 🟡 Medium | ★★★★ | Include/Exclude | O(2^n) | O(n) |
| 99 | **Combination Sum** | 39 | Backtracking | 🟡 Medium | ★★★ | Unbounded + Pruning | O(2^t) | O(t) |
| 100 | **Word Search** | 79 | Backtracking & Matrix | 🟡 Medium | ★★★★ | DFS + Visited Matrix | O(m·n·4^L) | O(L) |
| 101 | **N-Queens** | 51 | Backtracking | 🔴 Hard | ★★★ | Column/Diagonal Tracking | O(n!) | O(n) |
| 102 | **Generate Parentheses** | 22 | Backtracking | 🟡 Medium | ★★★★ | Open/Close Count | O(4^n/√n) | O(n) |
| 103 | **Palindrome Partitioning** | 131 | Backtracking | 🟡 Medium | ★★★ | Partition + Palindrome Check | O(n·2^n) | O(n) |
| 104 | **Design HashMap** | 706 | Design | 🟢 Easy | ★★★★ | Array of Buckets + Chaining | O(1) avg | O(n) |
| 105 | **Implement Trie (Prefix Tree)** | 208 | Trie & Design | 🟡 Medium | ★★★★ | TrieNode Children Array | O(m) | O(m) |
| 106 | **Design Add and Search Words** | 211 | Trie & Design | 🟡 Medium | ★★★ | Trie + DFS for Wildcard | O(m) | O(m) |
| 107 | **Design Twitter** | 355 | Design & OOP | 🟡 Medium | ★★★ | HashMap + Heap Merge | O(n log k) | O(n) |
| 108 | **Insert Delete GetRandom O(1)** | 380 | Design | 🟡 Medium | ★★★★ | HashMap + ArrayList Swap | O(1) | O(n) |
| 109 | **Serialize and Deserialize Binary Tree** | 297 | Design & Trees | 🔴 Hard | ★★★★ | Preorder + Delimiter | O(n) | O(n) |
| 110 | **Jump Game II** | 45 | Greedy | 🟡 Medium | ★★★ | BFS / Greedy Window | O(n) | O(1) |
| 111 | **Gas Station** | 134 | Greedy | 🟡 Medium | ★★★ | Circular Greedy Sum | O(n) | O(1) |
| 112 | **Candy** | 135 | Greedy | 🔴 Hard | ★★★ | Two Pass (L→R, R→L) | O(n) | O(n) |
| 113 | **Non-overlapping Intervals** | 435 | Greedy & Intervals | 🟡 Medium | ★★★ | Sort by End + Greedy | O(n log n) | O(1) |
| 114 | **Number of Connected Components** | 323 | Union Find | 🟡 Medium | ★★★ | Union Find / DFS | O(V+E) | O(V) |
| 115 | **Redundant Connection** | 684 | Union Find | 🟡 Medium | ★★★ | Union Find Cycle Detect | O(n·α(n)) | O(n) |
| 116 | **Accounts Merge** | 721 | Union Find & DFS | 🟡 Medium | ★★★ | Union Find + Sort | O(n·k·log(n·k)) | O(n·k) |
| 117 | **Single Number** | 136 | Bit Manipulation | 🟢 Easy | ★★★★ | XOR All Elements | O(n) | O(1) |
| 118 | **Number of 1 Bits** | 191 | Bit Manipulation | 🟢 Easy | ★★★ | Brian Kernighan's | O(log n) | O(1) |
| 119 | **Counting Bits** | 338 | Bit Manipulation & DP | 🟢 Easy | ★★★ | DP + Bit Pattern | O(n) | O(n) |
| 120 | **Reverse Bits** | 190 | Bit Manipulation | 🟢 Easy | ★★★ | Bit-by-Bit Reverse | O(1) | O(1) |
| 121 | **Set Matrix Zeroes** | 73 | Matrix | 🟡 Medium | ★★★★ | First Row/Col as Flags | O(m·n) | O(1) |
| 122 | **Rotate Image** | 48 | Matrix | 🟡 Medium | ★★★★ | Transpose + Reverse | O(n²) | O(1) |
| 123 | **Word Search II** | 212 | Matrix & Trie | 🔴 Hard | ★★★ | Trie + DFS Backtrack | O(m·n·4^L) | O(sum of words) |
| 124 | **Insert Interval** | 57 | Intervals | 🟡 Medium | ★★★★ | Merge Overlapping | O(n) | O(n) |
| 125 | **Meeting Rooms** | 252 | Intervals & Sorting | 🟢 Easy | ★★★ | Sort + Overlap Check | O(n log n) | O(1) |
| 126 | **Pow(x, n)** | 50 | Math & Recursion | 🟡 Medium | ★★★ | Fast Exponentiation | O(log n) | O(log n) |
| 127 | **Happy Number** | 202 | Math & Hashing | 🟢 Easy | ★★★ | Floyd's Cycle Detection | O(log n) | O(1) |
| 128 | **Roman to Integer** | 13 | Math & Strings | 🟢 Easy | ★★★ | Map + Subtraction Rule | O(n) | O(1) |
| 129 | **Integer to Roman** | 12 | Math & Strings | 🟡 Medium | ★★★ | Greedy Denomination | O(1) | O(1) |
| 130 | **Multiply Strings** | 43 | Math & Strings | 🟡 Medium | ★★★ | Grade School Multiply | O(m·n) | O(m+n) |
| 131 | **Implement Stack using Queues** | 225 | Stack & Queue | 🟢 Easy | ★★★ | Push-costly / Pop-costly | O(n) push | O(n) |
| 132 | **Design Circular Queue** | 622 | Design & Queue | 🟡 Medium | ★★★ | Array + Head/Tail Pointers | O(1) | O(k) |
| 133 | **Maximum Profit in Job Scheduling** | 1235 | DP & Binary Search | 🔴 Hard | ★★★ | Sort + DP + BS | O(n log n) | O(n) |
| 134 | **Range Sum Query - Mutable** | 307 | Segment Tree / BIT | 🟡 Medium | ★★★ | Segment Tree / Fenwick | O(log n) | O(n) |
| 135 | **Design Hit Counter** | 362 | Design & Queue | 🟡 Medium | ★★★★ | Queue / Circular Buffer | O(1) | O(300) |
| 136 | **Minimum Number of Platforms** | - | Intervals & Sorting | 🟡 Medium | ★★★★ | Sort Arrival/Departure | O(n log n) | O(n) |
| 137 | **Shopping Offers** | 638 | DP & Backtracking | 🟡 Medium | ★★★ | DFS + Memoization | O(n^m) | O(n^m) |
| 138 | **Maximum Points You Can Obtain from Cards** | 1423 | Sliding Window | 🟡 Medium | ★★★ | Prefix + Suffix Window | O(k) | O(1) |
| 139 | **Sort Colors** | 75 | Arrays & Two Pointers | 🟡 Medium | ★★★★ | Dutch National Flag | O(n) | O(1) |
| 140 | **Minimum Size Subarray Sum** | 209 | Sliding Window | 🟡 Medium | ★★★ | Shrinking Window | O(n) | O(1) |
| 141 | **Design In-Memory File System** | 588 | Design & Trie | 🔴 Hard | ★★★ | Trie with Path Nodes | O(m+n) | O(n) |
| 142 | **LFU Cache** | 460 | Design & Linked List | 🔴 Hard | ★★★ | HashMap + Freq Doubly LL | O(1) | O(capacity) |
| 143 | **Flatten Nested List Iterator** | 341 | Stack & Design | 🟡 Medium | ★★★ | Stack Flattening | O(1) avg | O(d) |
| 144 | **Longest Valid Parentheses** | 32 | Stack & DP | 🔴 Hard | ★★★ | Stack / DP | O(n) | O(n) |
| 145 | **Text Justification** | 68 | Strings & Greedy | 🔴 Hard | ★★★ | Greedy Packing + Padding | O(n) | O(n) |
| 146 | **Valid Palindrome** | 125 | Strings & Two Pointers | 🟢 Easy | ★★★★ | Two Pointers Inward | O(n) | O(1) |
| 147 | **Palindrome Linked List** | 234 | Linked List | 🟢 Easy | ★★★ | Reverse Second Half | O(n) | O(1) |
| 148 | **Number of Provinces** | 547 | Graphs & Union Find | 🟡 Medium | ★★★ | DFS / Union Find | O(n²) | O(n) |
| 149 | **Min Cost Climbing Stairs** | 746 | Dynamic Programming | 🟢 Easy | ★★★ | Linear DP | O(n) | O(1) |
| 150 | **Surrounded Regions** | 130 | Graphs & DFS | 🟡 Medium | ★★★ | Border DFS + Flip | O(m·n) | O(m·n) |

---

## 📊 Topic Strategy & Priority

| Topic | Count | Walmart Focus & Patterns | Study Strategy | Priority |
|-------|-------|--------------------------|----------------|----------|
| **Arrays & Strings** | ~30 | Two Pointers, Sliding Window, Prefix Sum, Hash Map — core of Walmart interviews | Master Two Sum, Product of Array, Merge Intervals first. Then sliding window variants. | 🔴 Critical |
| **Linked Lists** | ~10 | Reversal, merge, cycle detection, LRU Cache — design + implementation | Practice iterative reversal blind. LRU Cache is a must-know. | 🔴 Critical |
| **Trees & BST** | ~15 | BFS/DFS traversals, validation, serialization — very frequent at Walmart | Level order + validate BST are top picks. Know iterative + recursive. | 🔴 Critical |
| **Graphs** | ~10 | BFS/DFS, topological sort, union find — supply chain / network modeling | Number of Islands → Course Schedule → Word Ladder progression. | 🟡 High |
| **Dynamic Programming** | ~15 | Knapsack, linear DP, grid DP — inventory / pricing optimization | Start with Climbing Stairs, Coin Change. Build to Edit Distance. | 🟡 High |
| **Binary Search** | ~8 | Rotated arrays, search on answer — core algorithmic thinking | Master the 3 templates. Rotated array is a Walmart favorite. | 🟡 High |
| **Stack & Queue** | ~7 | Monotonic stack, expression evaluation — parsing / processing | Daily Temperatures + Valid Parentheses are must-do. | 🟢 Medium |
| **Heap / Priority Queue** | ~5 | Top K, median stream, scheduling — real-time system design | Kth Largest + Find Median are most asked. | 🟡 High |
| **Backtracking** | ~8 | Permutations, subsets, word search — combinatorial problems | Know the template: choose → explore → unchoose. | 🟢 Medium |
| **Design / OOP** | ~6 | LRU/LFU Cache, Trie, HashMap — system components | LRU Cache is #1 most asked design coding problem at Walmart. | 🔴 Critical |
| **Greedy** | ~4 | Intervals, scheduling, optimization — logistics problems | Sort-first greedy pattern. Merge/insert intervals. | 🟢 Medium |
| **Union Find** | ~3 | Connected components, cycle detection — network problems | Know path compression + union by rank. | 🟢 Medium |
| **Bit Manipulation** | ~4 | XOR tricks, counting bits — quick wins for easy rounds | Single Number is free points. Know common bit tricks. | 🔵 Low |
| **Matrix** | ~3 | Rotation, zeroing, word search — spatial reasoning | Rotate Image + Set Matrix Zeroes — in-place tricks. | 🟢 Medium |
| **Intervals** | ~4 | Merge, insert, meeting rooms — scheduling / logistics | Sort by start time. Walmart loves meeting rooms II. | 🟡 High |

---

## 🎓 Walmart Interview Coaching Guide


**INTERVIEW FORMAT:** Walmart typically has 4-5 rounds: Phone Screen (1 coding), Virtual Onsite (2-3 coding + 1 system design + 1 behavioral). Senior roles add HLD round.

**TIME MANAGEMENT:** 45 min per coding round. Spend 5 min understanding, 5 min planning, 25 min coding, 10 min testing. Don't jump into code.

**COMMUNICATION:** Think out loud. Explain your approach BEFORE coding. Discuss trade-offs. Ask clarifying questions first.


### WALMART VALUES TO SHOW

**Customer First:** Talk about how your solution serves the end user. eCommerce scale = billions of products, millions of concurrent users.

**Respect for Individual:** Show collaborative thinking: 'I'd discuss with the team...' 'A peer review would help here...'

**Strive for Excellence:** Optimize your solution. Always discuss time/space complexity. Offer improvements after initial solution.

**Act with Integrity:** Be honest about what you know and don't know. If stuck, explain your thought process clearly.


### CODING ROUND STRATEGY

**Step 1: Clarify:** Repeat the problem. Ask about edge cases, input size, constraints. 'Can the array be empty?' 'Are there duplicates?'

**Step 2: Examples:** Walk through 1-2 examples by hand. Use the given example + create your own edge case.

**Step 3: Approach:** State brute force first, then optimize. 'A brute force would be O(n²), but we can use a hash map for O(n).'

**Step 4: Code:** Write clean, modular code. Use meaningful variable names. Handle edge cases upfront.

**Step 5: Test:** Trace through your code with the examples. Test edge cases: empty input, single element, duplicates.

**Step 6: Optimize:** Discuss follow-ups. 'If the array was sorted, we could use binary search.' Show depth of knowledge.


### WALMART-SPECIFIC THEMES

**eCommerce Scale:** Think about: inventory management, cart checkout, price matching, recommendation engines, search ranking.

**Distributed Systems:** Walmart operates massive microservices. Expect questions on caching (LRU), rate limiting, load balancing.

**Real-time Processing:** Order processing, fraud detection, supply chain tracking — streaming and event-driven patterns.

**Data Structures for Scale:** Tries for autocomplete/search, heaps for top-K products, graphs for supply chain networks.


**DIFFICULTY DISTRIBUTION:** Expect: 30% Easy (warm-up round), 50% Medium (core rounds), 20% Hard (senior/staff differentiator).

**LANGUAGE CHOICE:** Java is preferred at Walmart (Spring ecosystem). Python also accepted. Know your language's stdlib well.

**COMMON MISTAKES:** 1) Not asking questions first  2) Jumping to code  3) Ignoring edge cases  4) Not testing  5) Poor variable naming


---

## 💡 Key Insights from Recent Walmart Interviews

### Top 5 Most Asked Problems (2025-2026)

| Rank | Problem | LC# | Times Reported | Key Insight |
|------|---------|-----|----------------|-------------|
| 🥇 1 | **Subarray Sum Equals K** | 560 | 4+ interviews | Always paired with another medium/hard. Prefix sum + HashMap. |
| 🥈 2 | **Trapping Rain Water** | 42 | 3+ interviews | Often a bonus question. Know all 3 approaches (brute, DP, two ptr). |
| 🥉 3 | **Find Median from Data Stream** | 295 | 3+ interviews | Code in Java. Interviewers drill into heap internals. |
| 4 | **Course Schedule** | 207 | 3+ interviews | Both BFS (Kahn's) and DFS cycle detection expected as follow-up. |
| 5 | **LRU Cache** | 146 | 3+ interviews | Appears in BOTH coding rounds and LLD rounds. Must-know. |

### Interview Format (Typical SDE-III)

```
Round 1: DSA Coding (60 min)
  → 2 LeetCode problems (1 Medium + 1 Medium/Hard)
  → Explain approach BEFORE coding
  → Dry run on test cases expected

Round 2: Java/LLD + HLD (60 min)
  → Java internals: HashMap, volatile, CompletableFuture, Streams
  → LLD: Jukebox, Connection Pool, Ticket Booking, Cache
  → HLD: eCommerce system, notification system, Twitter feed

Round 3: Hiring Manager (60 min)
  → Deep resume dive (every line)
  → Behavioral (STAR format)
  → System design discussion
  → Microservices, Kafka, Redis questions
```

### Quick Pattern Reference

```java
// Sliding Window Template
int left = 0;
for (int right = 0; right < n; right++) {
    // expand: add nums[right] to window
    while (/* window invalid */) {
        // shrink: remove nums[left] from window
        left++;
    }
    // update answer
}

// Binary Search on Answer Template
int lo = minPossible, hi = maxPossible;
while (lo < hi) {
    int mid = lo + (hi - lo) / 2;
    if (feasible(mid)) hi = mid;
    else lo = mid + 1;
}
return lo;

// Backtracking Template
void backtrack(List<List<Integer>> res, List<Integer> path, int[] nums, int start) {
    res.add(new ArrayList<>(path));
    for (int i = start; i < nums.length; i++) {
        path.add(nums[i]);           // choose
        backtrack(res, path, nums, i + 1); // explore
        path.remove(path.size() - 1); // unchoose
    }
}

// BFS Level Order Template
Queue<TreeNode> queue = new LinkedList<>();
queue.offer(root);
while (!queue.isEmpty()) {
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        // process node
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}

// Kahn's Topological Sort (BFS)
int[] indegree = new int[numCourses];
// build adjacency list and indegree
Queue<Integer> queue = new LinkedList<>();
for (int i = 0; i < numCourses; i++)
    if (indegree[i] == 0) queue.offer(i);
while (!queue.isEmpty()) {
    int course = queue.poll();
    // process course
    for (int next : adj.get(course)) {
        if (--indegree[next] == 0) queue.offer(next);
    }
}

// LRU Cache Core Structure
class LRUCache {
    Map<Integer, Node> map = new HashMap<>();
    Node head = new Node(), tail = new Node(); // sentinel
    int capacity;
    // get: map lookup → move to head → return val
    // put: map lookup → update/create → move to head → evict if over capacity
}
```

---

## ✅ Progress Tracker

| Day | Theme | Total | Completed | Notes |
|-----|-------|-------|-----------|-------|
| Day 1 | Arrays & Hashing | ~15 | ☐ | |
| Day 2 | Two Pointers & Sliding Window | ~16 | ☐ | |
| Day 3 | Dynamic Programming | ~16 | ☐ | |
| Day 4 | Binary Trees | ~18 | ☐ | |
| Day 5 | Graphs & Topological Sort | ~18 | ☐ | |
| Day 6 | Heaps, Binary Search & Intervals | ~18 | ☐ | |
| Day 7 | Linked Lists & Cache Design | ~18 | ☐ | |
| Day 8 | Stacks, Backtracking & Strings | ~18 | ☐ | |
| Day 9 | Advanced DP, Design, Bits & Custom | ~18 | ☐ | |
| Day 10 | Hard Problems & Remaining | ~20 | ☐ | |

---

*Generated for Walmart SDE-III interview prep. Good luck!* 💪