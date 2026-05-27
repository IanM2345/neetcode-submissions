class DynamicArray {
    private int [] arr;
    private int length;
    private int cap;
    public DynamicArray(int capacity) {
        this.length=0;
        this.cap=capacity;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i]= n;
    }

    public void pushback(int n) {
        if(length == cap){
            resize();
        }
        arr[length]=n;
        length++;
    }

    public int popback() {
        if(length>0){
            length--;
        }
        return arr[length];
    }

    private void resize() {
        cap*=2;
        int [] newArr = new int[cap];
        for (int i=0; i<length; i++){
            newArr[i]= arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return cap;
    }
}
