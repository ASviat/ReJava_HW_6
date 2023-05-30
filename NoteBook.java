public class NoteBook {
    private String name;
    private int ram;
    int hdd;
    String os;
    String color;

    public NoteBook(String name, int ram, int hdd, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public boolean equals(Object obj) {
        NoteBook t = (NoteBook) obj;
        return ram == t.ram;
    }

    @Override
    public String toString() {

        return String.format("Name = %s, RAM = %d GB, HDD = %d GB, OS = %s, Color = %s", name, ram, hdd, os, color);
    }

}