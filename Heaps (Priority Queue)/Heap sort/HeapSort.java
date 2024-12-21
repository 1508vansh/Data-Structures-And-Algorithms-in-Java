import java.util.*;

class heapSort {// this is similar like merge sort, this also takes T.C = O(nlogn), and S.C =
                // O(n)...............
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int[] arr = { 4, 5, 0, 3452, 8, 124764, 9, 5, 6, 8 };
        for (var e : arr)
            q.add(e);
        int idx = 0;
        while (!q.isEmpty())
            arr[idx++] = q.remove();
        for (var e : arr)
            System.out.print(e + " ");
    }
}