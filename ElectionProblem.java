import java.util.ArrayList;

public class ElectionProblem {
    private static int votersA = 0, votersB = 0;

    private static String getResult() {

        if (votersA == votersB) {
            return "Coalition government";
        }
        return votersA > votersB ? "A" : "B";
    }

    private static ArrayList<Integer> getSupporters(String votersQueue) {
        ArrayList<Integer> voterIndices = new ArrayList<>();

        for (int i = 0; i < votersQueue.length(); i++) {
            char v = votersQueue.charAt(i);
            if (v == 'A' || v == 'B') {
                voterIndices.add(i);
            }
        }

        return voterIndices;
    }

    private static void addVotes(char contestant, int votes) {
        if (contestant == 'A') {
            votersA += votes;
        } else if (contestant == 'B') {
            votersB += votes;
        }
    }

    public static void runElection(String votersQueue) {
        ArrayList<Integer> voterIndices = getSupporters(votersQueue);

        for (int i = 0; i < voterIndices.size() - 1; i++) {
            int cur_i = voterIndices.get(i), next_i = voterIndices.get(i + 1);
            char current_voter = votersQueue.charAt(cur_i), next_voter = votersQueue.charAt(next_i);

            int votes = (next_i - cur_i - 1);

            // Adding the current voter's vote
            addVotes(current_voter, 1);

            // Influencer's vote range
            if (current_voter == next_voter) {
                // If same voters b/w the neutral people, then all will be influenced
                addVotes(current_voter, votes);
            } else if (current_voter == 'B' && next_voter == 'A') {
                // B moves toward right half
                addVotes(current_voter, votes / 2);

                // A moves toward left half
                addVotes(next_voter, votes / 2);
            }
        }

        // Adding the last voter's vote.
        addVotes(votersQueue.charAt(voterIndices.get(voterIndices.size() - 1)), 1);

        // Adding up votes at start and end neutral people
        if (voterIndices.size() > 0) {

            // If first voter is A, he moves towards start
            int balance = voterIndices.get(0);
            if (votersQueue.charAt(balance) == 'A') {
                addVotes('A', balance);

            }
            // If first voter is B, he moves towards end
            balance = voterIndices.get(voterIndices.size() - 1);
            if (votersQueue.charAt(balance) == 'B') {
                addVotes('B', votersQueue.length() - 1 - balance);
            }
        }

        System.out.println(getResult());
        // Reseting election
        votersA = 0;
        votersB = 0;
    }

    public static void main(String[] args) {
        String votersQueue = "----ABA--BB---A--BB--AAB---A--B-B---ABB--BBA----ABA--BB---A--B-B---ABB--BBA----ABA----A--B-B--A--B-B---ABB-";
        int n = votersQueue.length();
        System.out.println(n);
        System.out.println(votersQueue);
        runElection(votersQueue);
    }
}