class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        // Last digit se start karo
        for (int i = n - 1; i >= 0; i--) {

            // Agar digit 9 se chhoti hai
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Agar digit 9 hai
            digits[i] = 0;
        }

        // Agar saari digits 9 thi
        int[] ans = new int[n + 1];
        ans[0] = 1;

        return ans;
    }
}