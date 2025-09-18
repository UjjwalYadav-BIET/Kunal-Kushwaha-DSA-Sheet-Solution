package LeetCode;

public class P744_Smallest_Letter_grtr_thn_trgt {

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        P744_Smallest_Letter_grtr_thn_trgt solver = new P744_Smallest_Letter_grtr_thn_trgt();

        char[] letters = {'c', 'f', 'j'};
        char target1 = 'j';
        System.out.println("Result : " + solver.nextGreatestLetter(letters, target1));
    }
}