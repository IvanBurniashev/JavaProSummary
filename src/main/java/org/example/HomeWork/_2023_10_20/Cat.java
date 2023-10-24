package org.example.HomeWork._2023_10_20;

public class Cat {
    private String name;
    private Boolean isHangry;

    public Cat(String name, Boolean isHangry) {
        this.name = name;
        this.isHangry = isHangry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isHangry() {
        return isHangry;
    }

    public void setHangry(Boolean hangry) {
        isHangry = hangry;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", isHangry=" + isHangry +
                '}';
    }
}
