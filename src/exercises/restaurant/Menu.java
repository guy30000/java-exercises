package org.launchcode.java.demos.java4python;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastModified;
    private ArrayList<MenuItem> items;
    private String category;

    public Menu(String category) {
        this.lastModified = new Date();
        this.items = new ArrayList<>();
        this.category = category;
    }

    public void add(MenuItem item) {
        this.items.add(item);
        this.lastModified = new Date();
    }

    public void remove(MenuItem item) {
        this.items.remove(item);
        this.lastModified = new Date();
    }

    public Date getLastModified() {
        return this.lastModified;
    }

    @Override
    public String toString() {
        String result = "Menu{" +
                "lastModified=" + lastModified +
                ", category='" + category + '\'' +
                '}';
        for(MenuItem mi : items) {
            result += mi.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        MenuItem cake = new MenuItem(5, "cake", "dessert", false);
        MenuItem chips = new MenuItem(7, "chips", "entree", false);

        Menu m = new Menu("Everything");

        m.add(cake);
        m.add(chips);

        System.out.println(m);
    }
}