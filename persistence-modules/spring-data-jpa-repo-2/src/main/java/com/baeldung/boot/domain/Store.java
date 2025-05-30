package com.baeldung.boot.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Store {

    private Boolean active;
    @Id
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "STORE_ID")
    private List<Item> items = new ArrayList<>();
    private Long itemsSold;

    @ManyToOne
    @JoinColumn(name = "LOCATION_ID")
    private Location location;

    private String name;

    public Boolean getActive() {
        return active;
    }

    public Long getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getItemsSold() {
        return itemsSold;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setItemsSold(Long itemsSold) {
        this.itemsSold = itemsSold;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }
}
