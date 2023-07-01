package org.example.Media;

public class VideoDisk extends Disk {
    @Override
    public String toString() {
        return "VideoDisk{" +
                "producer='" + producer + '\'' +
                ", director='" + director + '\'' +
                ", countOfMinutes=" + countOfMinutes  + '\'' +
                "year=" + getYear() +
                ", name='" + getName() + '\'' +
                '}';

    }

    private String producer;

    public String getProducer() {
        return producer;
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getCountOfMinutes() {
        return countOfMinutes;
    }

    public void setCountOfMinutes(int countOfMinutes) {
        this.countOfMinutes = countOfMinutes;
    }

    private String director;
    private int countOfMinutes;

    public VideoDisk() {
    }
}
