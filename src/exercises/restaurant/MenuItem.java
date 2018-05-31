package org.launchcode.java.demos.java4python;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String desc, String category, boolean isNew) {
        this.price = price;
        this.description = desc;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean isNew() {
        return this.isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                ", description='" + description + '\'' +
                "price=" + price +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}