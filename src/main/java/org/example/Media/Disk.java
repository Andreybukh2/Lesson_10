package org.example.Media;

public class Disk {
    private int year;
    private String name;

    public Disk() {
    }

    @Override
    public String toString() {
        return "Disk{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
