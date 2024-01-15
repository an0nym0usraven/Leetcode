class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        final PriorityQueue<Integer> small = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        final PriorityQueue<Integer> large = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
        final Map<Integer, Integer> toDeleteMap = new HashMap<>();
        double[] res = new double[nums.length-k+1];

        for (int i = 0; i < k - 1; i++) {
            small.add(nums[i]);
        }
        for (int j = 0; j < (k - 1)/2; j++) {
            large.add(small.poll());
        }

        byte balance = (byte) ((k-1) % 2);
        
        for (int i = 0; i < res.length; i++) {
            // adding new
            int toAdd = nums[i+k-1];
            if (small.peek() == null || toAdd <= small.peek()) {
                small.add(toAdd);
                balance += 1;
            } else {
                large.add(toAdd);
                balance -= 1;
            }

            // balance
            while (balance < 0) {
                small.add(large.poll());
                balance += 2;
            }
            while (balance > 1) {
                large.add(small.poll());
                balance -= 2;
            }

            // delete outgoing values
            while (toDeleteMap.getOrDefault(small.peek(), 0) > 0) {
                toDeleteMap.put(small.peek(), toDeleteMap.get(small.peek()) - 1);
                small.poll();
            }
            while (toDeleteMap.getOrDefault(large.peek(), 0) > 0) {
                toDeleteMap.put(large.peek(), toDeleteMap.get(large.peek()) - 1);
                large.poll();
            }

            // calculating median
            res[i] = k % 2 == 1 ? (double) small.peek() : (double) (large.peek()&small.peek()) + (large.peek()^small.peek())/2.0;

            // marking deleted
            int toDelete = nums[i];
            toDeleteMap.put(toDelete, toDeleteMap.getOrDefault(toDelete, 0) + 1);
            if (toDelete <= small.peek())
                balance -= 1;
            else
                balance += 1;
        }
        return res;
    }
}