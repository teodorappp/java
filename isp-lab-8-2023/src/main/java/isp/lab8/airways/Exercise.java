package isp.lab8.airways;

public class Exercise {
    public static void main(String[] args) {

                // creati un obiect RouteManager cu folderul de baza specificat
                RouteManager routeManager = new RouteManager("routes");

                // creare ruta noua
                String routeName = "ExampleRoute";
                routeManager.createRoute(routeName);

                // adaugati waypointuri la ruta creata
                Waypoint waypoint1 = new Waypoint("Waypoint1", 46.7852, 23.6862, 415);
                Waypoint waypoint2 = new Waypoint("Waypoint2", 47.0548, 23.9212, 10460);
                Waypoint waypoint3 = new Waypoint("Waypoint3", 46.9804, 24.7365, 10900);
                Waypoint waypoint4 = new Waypoint("Waypoint4", 45.9467, 26.0217, 10200);

                routeManager.addWaypoint(routeName, waypoint1);
                routeManager.addWaypoint(routeName, waypoint2);
                routeManager.addWaypoint(routeName, waypoint3);
                routeManager.addWaypoint(routeName, waypoint4);

                // calculati si afisati distanta totala a rutei
                Route route = new Route(routeName);
                double totalDistance = route.calculateTotalDistance();
                System.out.println("Total distance of the route: " + totalDistance + " kilometers");
            }
        }

