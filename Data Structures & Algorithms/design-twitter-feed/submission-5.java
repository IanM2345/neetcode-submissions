class Twitter {
    private static int timeStamp = 0;
    private Map<Integer, List<Tweet>> map;
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
        map = new HashMap<>();
        following = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        map.putIfAbsent(userId, new ArrayList<>());
        map.get(userId).add(new Tweet(tweetId, timeStamp++));
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> queue = new PriorityQueue<>((a, b) -> b.time - a.time);

        for (Tweet t : map.getOrDefault(userId, new ArrayList<>())) {
            queue.offer(t);
        }

        for (int f : following.getOrDefault(userId, new HashSet<>())) {
            for (Tweet t : map.getOrDefault(f, new ArrayList<>())) {
                queue.offer(t);
            }
        }

        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty() && list.size() < 10) {
            list.add(queue.poll().id);
        }
        return list;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return;
        }
        following.putIfAbsent(followerId, new HashSet<>());
        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        following.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
    }
}
