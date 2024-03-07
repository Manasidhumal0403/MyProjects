package ListCollection;

import java.util.ArrayList;
import java.util.List;

public class consecutive {


	    public static List<samcode> getTeamsWithConsecutiveLosses(List<samcode> teams, int consecutiveLosses) {
	        List<samcode> filteredTeams = new ArrayList<>();
	        for (samcode team : teams) {
	            List<String> results = team.getResults();
	            int lossCount = 0;
	            for (int i = results.size() - 1; i >= 0; i--) {
	                if (results.get(i).equals("L")) {
	                    lossCount++;
	                    if (lossCount >= consecutiveLosses) {
	                        filteredTeams.add(team);
	                        break;
	                    }
	                } else {
	                    lossCount = 0;
	                }
	            }
	        }
	        return filteredTeams;
	    }

	    public static double calculateAveragePoints(List<samcode> teams) {
	        int totalPoints = 0;
	        for (samcode team : teams) {
	            totalPoints += team.getPoints();
	        }
	        return (double) totalPoints / teams.size();
	    }

	    public static void main(String[] args) {
	        // Create teams with their details
	        List<samcode> teams = new ArrayList<>();
	        List<String> results1 = List.of("W", "L", "W", "L", "L");  // Example team 1 with 2 consecutive losses
	        List<String> results2 = List.of("W", "W", "W", "W", "W");  // Example team 2 with no consecutive losses
	        List<String> results3 = List.of("L", "L", "L", "L", "W");  // Example team 3 with 4 consecutive losses
	        teams.add(new samcode("Team 1", 10, results1));
	        teams.add(new samcode("Team 2", 15, results2));
	        teams.add(new samcode("Team 3", 5, results3));

	        // Get teams with 2 consecutive losses
	        int consecutiveLosses = 2;
	        List<samcode> filteredTeams = getTeamsWithConsecutiveLosses(teams, consecutiveLosses);

	        // Calculate average points of filtered teams
	        double averagePoints = calculateAveragePoints(filteredTeams);

	        // Print the results
	        System.out.println("Teams with " + consecutiveLosses + " consecutive losses:");
	        for (samcode team : filteredTeams) {
	            System.out.println(team.getName());
	        }
	        System.out.println("Average points of filtered teams: " + averagePoints);
	    }
	

}

