package isp.lab8.airways;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private String name;
    private List<Waypoint> waypoints;

    public Route(String name) {
        this.name = name;
        this.waypoints = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWaypoint(Waypoint waypoint) {
        waypoints.add(waypoint);
    }

    public void removeWaypoint(Waypoint waypoint) {
        waypoints.remove(waypoint);
    }

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    public double calculateTotalDistance() {
        double totalDistance = 0.0;

        for (int i = 0; i < waypoints.size() - 1; i++) {
            Waypoint currentWaypoint = waypoints.get(i);
            Waypoint nextWaypoint = waypoints.get(i + 1);
            double distance = calculateDistance(
                    currentWaypoint.getLatitude(), currentWaypoint.getLongitude(),
                    nextWaypoint.getLatitude(), nextWaypoint.getLongitude()
            );
            totalDistance += distance;
        }

        return totalDistance;
    }

        public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
            int earthRadius = 6371; // Radius of the Earth in kilometers
            double dLat = Math.toRadians(lat2 - lat1);
            double dLon = Math.toRadians(lon2 - lon1);
            double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                    Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                            Math.sin(dLon / 2) * Math.sin(dLon / 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            double distance = earthRadius * c;
            return distance;
        }

}


