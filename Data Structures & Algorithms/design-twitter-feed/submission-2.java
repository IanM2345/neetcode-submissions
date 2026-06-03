
class Twitter {
    private static int timeStamp = 0;
    private Map<Integer, List<Tweet>> tweets;
    private Map<Integer, Set<Integer>> following;

    private static class Tweet {
        int id;
        int time;
        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    public Twitter() {
        tweets = new HashMap<>();
        following = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        tweets.putIfAbsent(userId, new ArrayList<>());
        tweets.get(userId).add(new Tweet(tweetId, timeStamp++));
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a, b) -> b.time - a.time);

        for (Tweet t : tweets.getOrDefault(userId, new ArrayList<>())) pq.offer(t);

        for (int f : following.getOrDefault(userId, new HashSet<>()))
            for (Tweet t : tweets.getOrDefault(f, new ArrayList<>())) pq.offer(t);

        List<Integer> feed = new ArrayList<>();
        while (!pq.isEmpty() && feed.size() < 10) feed.add(pq.poll().id);

        return feed;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId)
            return;
        following.putIfAbsent(followerId, new HashSet<>());
        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        following.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
    }
}
