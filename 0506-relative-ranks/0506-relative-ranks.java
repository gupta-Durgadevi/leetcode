

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        // Create a copy of the score array
        int[] sortedScore = score.clone();

        // Sort the copied array
        Arrays.sort(sortedScore);

        String[] result = new String[n];

        // Check each player's score
        for (int i = 0; i < n; i++) {

            int rank = 1;

            // Find the rank by comparing with sorted scores
            for (int j = n - 1; j >= 0; j--) {

                if (score[i] == sortedScore[j]) {
                    break;
                }

                rank++;
            }

            // Assign medals or rank
            if (rank == 1) {
                result[i] = "Gold Medal";
            } else if (rank == 2) {
                result[i] = "Silver Medal";
            } else if (rank == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(rank);
            }
        }

        return result;
    }
}
        
    
