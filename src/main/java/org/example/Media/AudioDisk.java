package org.example.Media;

public class AudioDisk extends Disk {
    private String singer;
    private int countTracks;

    @Override
    public String toString() {
        return "AudioDisk{" +
                "singer='" + singer + '\'' +
                ", countTracks=" + countTracks + '\'' +
                "year=" + getYear() +
                ", name='" + getName() + '\'' +
                '}';
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCountTracks() {
        return countTracks;
    }

    public void setCountTracks(int countTracks) {
        this.countTracks = countTracks;
    }

    public AudioDisk() {
    }

}
