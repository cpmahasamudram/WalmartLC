package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.DesignTwitter;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DesignTwitterTest {

    @Test
    void basicPostAndFeed() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 5);
        assertEquals(List.of(5), twitter.getNewsFeed(1));
    }

    @Test
    void followAndSeeTweets() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 5);
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        assertEquals(List.of(6, 5), twitter.getNewsFeed(1));
    }

    @Test
    void unfollowRemovesTweets() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 5);
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        twitter.unfollow(1, 2);
        assertEquals(List.of(5), twitter.getNewsFeed(1));
    }

    @Test
    void emptyNewsFeed() {
        DesignTwitter twitter = new DesignTwitter();
        assertTrue(twitter.getNewsFeed(1).isEmpty());
    }

    @Test
    void feedLimitedToTenTweets() {
        DesignTwitter twitter = new DesignTwitter();
        for (int i = 1; i <= 15; i++) {
            twitter.postTweet(1, i);
        }
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(10, feed.size());
        assertEquals(15, feed.get(0));  // most recent first
        assertEquals(6, feed.get(9));   // 10th most recent
    }

    @Test
    void ownTweetsAlwaysVisible() {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 10);
        twitter.postTweet(1, 20);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(List.of(20, 10), feed);
    }
}
