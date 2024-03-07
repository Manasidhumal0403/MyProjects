package ListCollection;
import java.util.ArrayList;
import java.util.List;
public class Planet {
	    private String surfaceGases;
	    private int numMoons;
	    private boolean hasRings;

	    public Planet(String surfaceGases, int numMoons, boolean hasRings) {
	        this.surfaceGases = surfaceGases;
	        this.numMoons = numMoons;
	        this.hasRings = hasRings;
	    }

	    public String getSurfaceGases() {
	        return surfaceGases;
	    }

	    public int getNumMoons() {
	        return numMoons;
	    }

	    public boolean hasRings() {
	        return hasRings;
	    }

	    public static int countMoonsWithRings(List<Planet> planets) {
	        int totalMoonsWithRings = 0;
	        for (Planet planet : planets) {
	            if (planet.hasRings()) {
	                totalMoonsWithRings += planet.getNumMoons();
	            }
	        }
	        return totalMoonsWithRings;
	    }

	    public static int countTotalMoons(List<Planet> planets) {
	        int totalMoons = 0;
	        for (Planet planet : planets) {
	            totalMoons += planet.getNumMoons();
	        }
	        return totalMoons;
	    }

	    public static void main(String[] args) {
	        List<Planet> planets = new ArrayList<>();

	        // Creating instances of planets
	        Planet earth = new Planet("Nitrogen, Oxygen", 1, false);
	        Planet mars = new Planet("Carbon dioxide", 2, false);
	        Planet saturn = new Planet("Hydrogen, Helium", 82, true);

	        planets.add(earth);
	        planets.add(mars);
	        planets.add(saturn);

	        int totalMoonsWithRings = countMoonsWithRings(planets);
	        int totalMoons = countTotalMoons(planets);

	        System.out.println("Total moons of all planets with rings: " + totalMoonsWithRings);
	        System.out.println("Total moons of all planets: " + totalMoons);
	    }
	

        
	}


