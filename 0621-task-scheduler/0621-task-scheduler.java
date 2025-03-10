class Task implements Comparable<Task> {
    int frequency;
    int execution; // Fixed variable name

    Task(int f, int t) {
        this.frequency = f;
        this.execution = t;
    }

    public int compareTo(Task that) {
        return that.frequency - this.frequency; // Max heap based on frequency
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Frequency map
        HashMap<Character, Integer> freqmap = new HashMap<>();
        for (char ch : tasks) {
            freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
        }

        // Insert into max heap (PriorityQueue)
        PriorityQueue<Task> pq = new PriorityQueue<>();
        for (Character ch : freqmap.keySet()) {
            int freq = freqmap.get(ch);
            pq.offer(new Task(freq, 0));
        }

        Queue<Task> queue = new LinkedList<>();
        int time = 0;

        while (!queue.isEmpty() || !pq.isEmpty()) {
            time++;

            if (!pq.isEmpty()) {
                Task task = pq.poll();
                task.frequency--;

                if (task.frequency > 0) {
                    task.execution = time + n;
                    queue.offer(task);
                }
            }

            // Move tasks from queue back to priority queue if cooldown is over
            if (!queue.isEmpty() && queue.peek().execution == time) {
                pq.offer(queue.poll());
            }
        }
        return time;
    }
}