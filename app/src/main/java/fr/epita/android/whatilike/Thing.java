package fr.epita.android.whatilike;

import java.util.ArrayList;

class Thing {
    private ArrayList<Thing> myList;
    private String name;
    private String description;
    private boolean like;

    public Thing(String name, String description, boolean like) {
        this.name = name;
        this.description = description;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
}
