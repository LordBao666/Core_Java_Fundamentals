package com.lordbao.concreteCollection.entity;

import java.util.Objects;

/**
 * @Author Lord_Bao
 * @Date 2024/5/16 20:42
 * @Version 1.0
 */
public class Item implements Comparable<Item> {
    private int id;
    private String description;

    public Item() {
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Item(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id;
    }



    @Override
    public int compareTo(Item o) {
        return Integer.compare(id,o.id);
    }
}
