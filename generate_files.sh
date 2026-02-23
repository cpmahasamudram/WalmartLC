#!/bin/bash

BASE="/Users/cmaha/IdeaProjects/WalmartLC"
MAIN_BASE="$BASE/src/main/java"
TEST_BASE="$BASE/src/test/java"

# Files that already exist and should be skipped
SKIP_LIST=(
  "day01_arrays_hashing/walmart/SubarraySumEqualsK"
  "day01_arrays_hashing/walmart/ProductExceptSelf"
  "day01_arrays_hashing/walmart/GroupAnagrams"
  "day01_arrays_hashing/walmart/TrappingRainWater"
)

should_skip() {
  local key="$1"
  for s in "${SKIP_LIST[@]}"; do
    if [[ "$key" == "$s" ]]; then
      return 0
    fi
  done
  return 1
}

create_file() {
  local day="$1"
  local tag="$2"
  local class="$3"
  local key="$day/$tag/$class"

  if should_skip "$key"; then
    echo "SKIP: $key (already exists)"
    return
  fi

  local pkg="${day}.${tag}"
  local main_dir="$MAIN_BASE/$day/$tag"
  local test_dir="$TEST_BASE/$day/$tag"

  mkdir -p "$main_dir" "$test_dir"

  # Main file
  local main_file="$main_dir/${class}.java"
  if [[ ! -f "$main_file" ]]; then
    cat > "$main_file" << EOF
package ${pkg};

public class ${class} {
    // TODO: Implement
}
EOF
    echo "CREATED: $main_file"
  else
    echo "EXISTS:  $main_file"
  fi

  # Test file
  local test_file="$test_dir/${class}Test.java"
  if [[ ! -f "$test_file" ]]; then
    cat > "$test_file" << EOF
package ${pkg};

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ${class}Test {
    // TODO: Add test cases
}
EOF
    echo "CREATED: $test_file"
  else
    echo "EXISTS:  $test_file"
  fi
}

# Helper to create multiple files for a day/tag
create_batch() {
  local day="$1"
  local tag="$2"
  shift 2
  for class in "$@"; do
    create_file "$day" "$tag" "$class"
  done
}

echo "=== Generating LeetCode Study Plan Files ==="
echo ""

# DAY 1
echo "--- Day 1: Arrays & Hashing ---"
create_batch day01_arrays_hashing walmart \
  TwoSum SubarraySumEqualsK ProductExceptSelf GroupAnagrams TrappingRainWater
create_batch day01_arrays_hashing top150 \
  ContainsDuplicate ValidAnagram TopKFrequentElements LongestConsecutiveSequence BestTimeToBuyAndSellStock RotateArray

# DAY 2
echo "--- Day 2: Two Pointers & Sliding Window ---"
create_batch day02_two_pointers_sliding_window walmart \
  MoveZeroes SquaresOfSortedArray ThreeSum ContainerWithMostWater LongestSubstringWithoutRepeating SortColors ContainsDuplicateII MinimumWindowSubstring
create_batch day02_two_pointers_sliding_window top150 \
  ValidPalindrome FindAllAnagrams MinimumSizeSubarraySum MaxPointsFromCards

# DAY 3
echo "--- Day 3: Dynamic Programming ---"
create_batch day03_dynamic_programming walmart \
  ClimbingStairs CoinChange HouseRobberII TargetSum BestTimeBuySellCooldown JumpGame
create_batch day03_dynamic_programming top150 \
  MinCostClimbingStairs HouseRobber UniquePaths LongestIncreasingSubsequence WordBreak DecodeWays EditDistance

# DAY 4
echo "--- Day 4: Binary Trees ---"
create_batch day04_binary_trees walmart \
  MaxDepthBinaryTree BinaryTreeLevelOrderTraversal BottomViewBinaryTree BinaryTreeRightSideView ValidateBST ConstructBTPreorderInorder MaxWidthBinaryTree
create_batch day04_binary_trees top150 \
  InvertBinaryTree SymmetricTree LowestCommonAncestorBST LowestCommonAncestorBT KthSmallestBST DiameterOfBinaryTree PathSum BinaryTreeMaxPathSum SerializeDeserializeBT

# DAY 5
echo "--- Day 5: Graphs & Topological Sort ---"
create_batch day05_graphs_topological_sort walmart \
  NumberOfIslands CourseSchedule CourseScheduleII CloneGraph WordLadder
create_batch day05_graphs_topological_sort top150 \
  RottingOranges PacificAtlanticWaterFlow SurroundedRegions GraphValidTree NumberOfProvinces WallsAndGates NumberOfConnectedComponents RedundantConnection AccountsMerge AlienDictionary

# DAY 6
echo "--- Day 6: Heaps, Binary Search & Intervals ---"
create_batch day06_heaps_binary_search_intervals walmart \
  FindMedianFromDataStream KthLargestElement MergeIntervals MeetingRoomsII SearchInRotatedSortedArray MinDaysToMakeBouquets MinPlatforms
create_batch day06_heaps_binary_search_intervals top150 \
  BinarySearch MeetingRooms FindMinInRotatedSortedArray SearchA2DMatrix KokoEatingBananas FindPeakElement InsertInterval NonOverlappingIntervals MedianOfTwoSortedArrays

# DAY 7
echo "--- Day 7: Linked Lists & Design ---"
create_batch day07_linked_lists_design walmart \
  ReverseLinkedList DetectCycleLinkedList CopyListRandomPointer LRUCache FindTheCelebrity LFUCache MergeKSortedLists
create_batch day07_linked_lists_design top150 \
  MergeTwoSortedLists RemoveNthNodeFromEnd AddTwoNumbers ReorderList PalindromeLinkedList FlattenMultilevelDoublyLL InsertDeleteGetRandom DesignHitCounter

# DAY 8
echo "--- Day 8: Stacks, Backtracking & Strings ---"
create_batch day08_stacks_backtracking_strings walmart \
  ValidParentheses DailyTemperatures SubsetsII WordSearch
create_batch day08_stacks_backtracking_strings top150 \
  ImplementQueueUsingStacks MinStack Permutations GenerateParentheses LetterCombinationsPhone CombinationSum PalindromePartitioning EvaluateReversePolish BasicCalculatorII ImplementStackUsingQueues LargestRectangleInHistogram NQueens

# DAY 9
echo "--- Day 9: Advanced DP, Design & Bits ---"
create_batch day09_advanced_dp_design_bits walmart \
  ImplementTrie JukeboxDesign APILatencyAggregation
create_batch day09_advanced_dp_design_bits top150 \
  SingleNumber NumberOf1Bits CountingBits RomanToInteger LongestCommonSubsequence PartitionEqualSubsetSum MaximalSquare SetMatrixZeroes RotateImage DesignTwitter DesignCircularQueue DesignAddSearchWords TaskScheduler ReorganizeString TimeBasedKeyValueStore

# DAY 10
echo "--- Day 10: Hard Problems & Mock ---"
create_batch day10_hard_problems_mock walmart \
  SlidingWindowMedian FirstMissingPositive
create_batch day10_hard_problems_mock top150 \
  HappyNumber ReverseBits PowXN NextPermutation FlattenNestedListIterator IntegerToRoman MultiplyStrings JumpGameII ShoppingOffers MaxProfitJobScheduling SlidingWindowMaximum DesignInMemoryFileSystem LongestValidParentheses TextJustification RegularExpressionMatching WildcardMatching Candy BurstBalloons

echo ""
echo "=== Done! ==="
