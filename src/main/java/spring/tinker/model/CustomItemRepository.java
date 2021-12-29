package spring.tinker.model;

public interface CustomItemRepository {
    void updateItemQuantity(String name, float newQuantity);
}
