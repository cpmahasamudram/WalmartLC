package main.java.day09_advanced_dp_design_bits.top150;

import java.util.*;

/**
 * LC 355 - Design Twitter
 * Difficulty: Medium | Source: Top 150
 *
 * Design a simplified version of Twitter where users can post tweets,
 * follow/unfollow another user, and see the 10 most recent tweets in
 * the user's news feed.
 *
 * Implement the Twitter class:
 * - Twitter() Initializes your twitter object.
 * - void postTweet(int userId, int tweetId) Composes a new tweet with ID tweetId
 *   by the user userId. Each call will be made with a unique tweetId.
 * - List<Integer> getNewsFeed(int userId) Retrieves the 10 most recent tweet IDs
 *   in the user's news feed. Each item must be posted by users who the user follows
 *   or by the user themselves. Tweets must be ordered from most recent to least recent.
 * - void follow(int followerId, int followeeId) The user with ID followerId follows
 *   the user with ID followeeId.
 * - void unfollow(int followerId, int followeeId) The user with ID followerId
 *   unfollows the user with ID followeeId.
 *
 * Example:
 *   Twitter twitter = new Twitter();
 *   twitter.postTweet(1, 5);
 *   twitter.getNewsFeed(1);       -> [5]
 *   twitter.follow(1, 2);
 *   twitter.postTweet(2, 6);
 *   twitter.getNewsFeed(1);       -> [6, 5]
 *   twitter.unfollow(1, 2);
 *   twitter.getNewsFeed(1);       -> [5]
 *
 * Constraints:
 * - 1 <= userId, followerId, followeeId <= 500
 * - 0 <= tweetId <= 10^4
 * - All tweets have unique IDs.
 * - At most 3 * 10^4 calls to postTweet, getNewsFeed, follow, unfollow.
 *
 * PATTERN: HashMap + Merge K Sorted Lists (Min-Heap)
 * HINT: Map userId -> list of (timestamp, tweetId). Map userId -> set of followees.
 *       For getNewsFeed, collect tweet lists from user + followees, use a max-heap
 *       to merge and retrieve the 10 most recent tweets.
 *
 * TIME: O(k log k) getNewsFeed where k = followees count, O(1) post/follow/unfollow | SPACE: O(users * tweets)
 */
public class DesignTwitter {

    public DesignTwitter() {
        // TODO: Implement - initialize maps for tweets and follow relationships
    }

    public void postTweet(int userId, int tweetId) {
        // TODO: Implement - add tweet with timestamp to user's tweet list
    }

    public List<Integer> getNewsFeed(int userId) {
        // TODO: Implement - merge k sorted tweet lists using heap, return top 10
        return new ArrayList<>();
    }

    public void follow(int followerId, int followeeId) {
        // TODO: Implement - add followeeId to followerId's follow set
    }

    public void unfollow(int followerId, int followeeId) {
        // TODO: Implement - remove followeeId from followerId's follow set
    }
}
