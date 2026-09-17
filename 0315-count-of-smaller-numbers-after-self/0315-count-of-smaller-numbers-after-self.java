class Solution {

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        // [value, original index]
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort according to value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Fenwick Tree
        int[] bit = new int[n + 1];

        int[] ans = new int[n];

        int processed = 0;

        int i = 0;

        while (i < n) {

            int j = i;

            // Same value ka group
            while (j < n && arr[j][0] == arr[i][0]) {
                j++;
            }

            // Pehle answer nikalo
            for (int k = i; k < j; k++) {

                int index = arr[k][1];

                // processed - indexes <= current index
                ans[index] = processed - query(bit, index + 1);
            }

            // Ab same value ke indexes tree mein add karo
            for (int k = i; k < j; k++) {

                int index = arr[k][1];

                update(bit, index + 1);
                processed++;
            }

            i = j;
        }

        List<Integer> result = new ArrayList<>();

        for (int x : ans) {
            result.add(x);
        }

        return result;
    }

    // Add 1 at given position
    public void update(int[] bit, int index) {

        while (index < bit.length) {
            bit[index]++;
            index += index & -index;
        }
    }

    // Prefix sum: 1 se index tak kitne elements hain
    public int query(int[] bit, int index) {

        int sum = 0;

        while (index > 0) {
            sum += bit[index];
            index -= index & -index;
        }

        return sum;
    }
}