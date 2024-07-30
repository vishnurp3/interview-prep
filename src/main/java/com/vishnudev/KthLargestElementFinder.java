package com.vishnudev;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementFinder {

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>(k);

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Add null check to avoid potential NullPointerException
        Integer result = minHeap.peek();
        if (result == null) {
            throw new IllegalStateException("Heap is unexpectedly empty");
        }

        return result;
    }
}