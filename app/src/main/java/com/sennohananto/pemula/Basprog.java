package com.sennohananto.pemula;

import java.io.Serializable;

public class Basprog implements Serializable {
    private Integer img;
    private String title, desc, desclong, born, founder, site;

    public Basprog(Integer img, String title, String desc, String desclong, String born, String founder, String site) {
        this.img = img;
        this.title = title;
        this.desc = desc;
        this.desclong = desclong;
        this.born = born;
        this.founder = founder;
        this.site = site;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesclong() {
        return desclong;
    }

    public void setDesclong(String desclong) {
        this.desclong = desclong;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }
}
