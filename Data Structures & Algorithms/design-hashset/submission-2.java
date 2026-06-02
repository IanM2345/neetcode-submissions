class MyHashSet {
    private boolean [] x;
    public MyHashSet() {
        x = new boolean[1000000];
    }
    
    public void add(int key) {
        x[key]=true;
    }
    
    public void remove(int key) {
        x[key]=false;
    }
    
    public boolean contains(int key) {
        return x[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */