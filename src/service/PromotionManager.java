// PromotionManager.java
package service;
import model.Promotion;
import model.PromotionObserver;
import model.PromotionSubject;

import java.util.ArrayList;
import java.util.List;

public class PromotionManager implements PromotionSubject {
    private static PromotionManager instance;
    private List<PromotionObserver> observers;
    private List<Promotion> activePromotions;

    private PromotionManager() {
        this.observers = new ArrayList<>();
        this.activePromotions = new ArrayList<>();
    }

    public static PromotionManager getInstance() {
        if (instance == null) {
            instance = new PromotionManager();
        }
        return instance;
    }

    @Override
    public void registerObserver(PromotionObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(PromotionObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Promotion promotion) {
        for (PromotionObserver observer : observers) {
            observer.update(promotion);
        }
    }

    public void addPromotion(Promotion promotion) {
        activePromotions.add(promotion);
        notifyObservers(promotion);
    }

    public void removePromotion(String promoCode) {
        activePromotions.removeIf(p -> p.getPromoCode().equals(promoCode));
    }

    public Promotion getPromotionByCode(String promoCode) {
        for (Promotion promotion : activePromotions) {
            if (promotion.getPromoCode().equalsIgnoreCase(promoCode)) {
                return promotion;
            }
        }
        return null;
    }

    public List<Promotion> getActivePromotions() {
        return new ArrayList<>(activePromotions);
    }

    public void loadPromotionsFromDatabase() {
        try {
            backend.DatabaseManager db = backend.DatabaseManager.getInstance();
            ArrayList<Promotion> promotions = db.getAllPromotions();
            activePromotions.clear();
            activePromotions.addAll(promotions);
        } catch (Exception e) {
            System.err.println("Error loading promotions from database: " + e.getMessage());
        }
    }
}