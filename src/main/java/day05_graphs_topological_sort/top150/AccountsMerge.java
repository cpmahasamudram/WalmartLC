package main.java.day05_graphs_topological_sort.top150;

import java.util.List;

/**
 * LC 721 - Accounts Merge
 * Difficulty: Medium | Source: TOP 150
 *
 * Given a list of accounts where each element accounts[i] is a list of strings, where the
 * first element accounts[i][0] is a name, and the rest of the elements are emails representing
 * emails of the account. Now, we would like to merge these accounts. Two accounts definitely
 * belong to the same person if there is some common email to both accounts. After merging,
 * return the accounts in the following format: the first element of each account is the name,
 * and the rest are emails in sorted order. Accounts can be returned in any order.
 *
 * Example 1:
 *   Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],
 *                      ["John","johnsmith@mail.com","john00@mail.com"],
 *                      ["Mary","mary@mail.com"],
 *                      ["John","johnnybravo@mail.com"]]
 *   Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],
 *            ["Mary","mary@mail.com"],
 *            ["John","johnnybravo@mail.com"]]
 *
 * Example 2:
 *   Input: accounts = [["Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"],
 *                      ["Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"],
 *                      ["Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"],
 *                      ["Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"],
 *                      ["Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co"]]
 *   Output: [["Ethan","Ethan0@m.co","Ethan4@m.co","Ethan5@m.co"],
 *            ["Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3@m.co"],
 *            ["Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo3@m.co"],
 *            ["Kevin","Kevin0@m.co","Kevin3@m.co","Kevin5@m.co"],
 *            ["Fern","Fern0@m.co","Fern1@m.co","Fern5@m.co"]]
 *
 * Constraints:
 * - 1 <= accounts.length <= 1000
 * - 2 <= accounts[i].length <= 10
 * - 1 <= accounts[i][j].length <= 30
 * - accounts[i][0] consists of English letters
 * - accounts[i][j] (j > 0) is a valid email
 *
 * PATTERN: Union-Find on emails
 * HINT: Map each email to an account index. For each account, union all its emails with
 *       the first email. After processing, group emails by their root representative.
 *       For each group, sort the emails and prepend the account name.
 *
 * TIME: O(N * K * alpha(N*K)) where N = accounts, K = max emails per account | SPACE: O(N * K)
 */
public class AccountsMerge {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        // TODO: Implement your solution here
        return List.of();
    }
}
