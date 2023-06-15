package com.hasibul.chineselanguage;

/* loaded from: classes3.dex */
public class ListItem {
    private String description;
    private int id;
    private int thumbnail;
    private String title;

    public ListItem(int id, int thumbnail, String title, String description) {
        this.id = id;
        this.thumbnail = thumbnail;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public int getThumbnail() {
        return this.thumbnail;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }
}
