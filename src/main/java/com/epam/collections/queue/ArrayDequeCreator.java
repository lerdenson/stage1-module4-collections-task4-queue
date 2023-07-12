package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(firstQueue.remove());
        ad.add(firstQueue.remove());
        ad.add(secondQueue.remove());
        ad.add(secondQueue.remove());

        boolean firstPriority = true;
        while (firstQueue.size() > 0 || secondQueue.size() > 0) {
            if (firstPriority) {
                firstQueue.add(ad.removeLast());
                ad.add(firstQueue.remove());
                ad.add(firstQueue.remove());
            } else {
                secondQueue.add(ad.removeLast());
                ad.add(secondQueue.remove());
                ad.add(secondQueue.remove());
            }
            firstPriority = !firstPriority;
        }

        return ad;
    }
}
