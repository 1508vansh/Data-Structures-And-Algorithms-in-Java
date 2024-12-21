class MinHeap {
    private int[] arr;
    private int size = -1;
    private int rear = -1;

    MinHeap(int size) {
        arr = new int[size];
    }

    private void UpHeaping(int ci, int p) {// swap until the child become greater than the parent.............
        while (arr[ci] < arr[p] && p >= 0) {
            int temp = arr[ci];
            arr[ci] = arr[p];
            arr[p] = temp;
            ci = p;
            p = (p - 1) / 2;
        }
    }

    private void DownHeaping(int ci, int p) {// swap until the current peek element gets it's correct position........
        while (ci <= rear && arr[ci] < arr[p]) {
            int temp = arr[p];
            arr[p] = arr[ci];
            arr[ci] = temp;
            p = ci;
            int left = (ci * 2) + 1;
            int right = (ci * 2) + 2;
            ci = arr[left] < arr[right] ? left : right;
        }
    }

    void add(int val) throws Exception {
        if (rear == arr.length - 1) {
            throw new Exception("Heap ka size full ho gya h vmro");
        } else {
            arr[++rear] = val;
            int p = (rear - 1) / 2;
            UpHeaping(rear, p);
        }
    }

    int remove() throws Exception {
        if (rear == -1) {
            throw new Exception("Heap Empty H Vmro");
        }
        int x = arr[0];
        int temp = arr[0];// swap first value with last.........
        arr[0] = arr[rear];
        arr[rear] = temp;
        rear--;// minus the rear...........
        int p = 0;
        int left = (p * 2) + 1;
        int right = (p * 2) + 2;
        int ci = arr[left] < arr[right] ? left : right;
        DownHeaping(ci, p);
        return x;
    }

    int peek() throws Exception {
        if (rear == -1)
            throw new Exception("Heap is empty vmro");
        return arr[0];
    }

    int size() {
        return rear + 1;
    }

    public static void main(String[] args) throws Exception {
        MinHeap h = new MinHeap(10);
        h.add(100);
        h.add(1);
        h.add(5);
        h.add(1983);
        h.add(2);
        h.add(-23);
        h.add(0);
        System.out.println(h.peek() + " is the minimum element");
        System.out.println("Size of the MinHeap is " + h.size());
        System.out.println(h.remove() + " is removed");
        System.out.println(h.peek() + " is the minimum element");
        System.out.println(h.remove() + " is removed");
        System.out.println(h.peek() + " is the minimum element");
    }
}
