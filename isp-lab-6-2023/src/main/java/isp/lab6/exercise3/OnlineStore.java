package isp.lab6.exercise3;

import java.util.*;

class OnlineStore {
    private final List<Product> products;
    private final Map<String, ActiveSession> sessions;

    public OnlineStore() {
        this.products = new ArrayList<>();
        this.sessions = new HashMap<>();
    }

    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        List<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(sortCriteria);
        return sortedProducts;
    }

    private void addSession(String username) {
        ActiveSession session = new ActiveSession(username);
        sessions.put(username, session);
    }

    private void removeSession(String username) {
        sessions.remove(username);
    }

    public void addToCart(String username, Product product, int quantity) {
        if (sessions.containsKey(username)) {
            ActiveSession session = sessions.get(username);
            session.addToCart(product, quantity);
        }
    }

    public String checkout(String username) {
        if (sessions.containsKey(username)) {
            ActiveSession session = sessions.get(username);
        }
        return username;
    }
}
