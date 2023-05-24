package isp.lab8.airways;

import java.io.File;

public class RouteManager {
    private String baseFolder;

    public RouteManager(String baseFolder) {
        this.baseFolder = baseFolder;
    }

    public void createRoute(String routeName) {
        String routeFolder = getRouteFolderPath(routeName);
        File folder = new File(routeFolder);
        if (!folder.exists()) {
            folder.mkdir();
        }
    }

    public void deleteRoute(String routeName) {
        String routeFolder = getRouteFolderPath(routeName);
        File folder = new File(routeFolder);
        if (folder.exists()) {
            deleteFolder(folder);
        }
    }

    public void addWaypoint(String routeName, Waypoint waypoint) {
        String routeFolder = getRouteFolderPath(routeName);
        String waypointFile = getWaypointFilePath(routeFolder, waypoint.getName());
        // Serializare sau salvare waypoint în format JSON în fișierul waypointFile
    }

    private String getRouteFolderPath(String routeName) {
        return baseFolder + File.separator + routeName;
    }

    private String getWaypointFilePath(String routeFolder, String waypointName) {
        return routeFolder + File.separator + waypointName + ".json";
    }

    private void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    file.delete();
                }
            }
        }
        folder.delete();
    }
}

