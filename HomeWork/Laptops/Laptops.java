package Laptops;

public class Laptops {
    String name;
    int ram;
    int hdd;
    String os;
    String colour;

    public Laptops(String name, int ram, int hdd, String os, String colour) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем жёсткого диска: %d Гб \n ОС: %s \n Цвет: %s\n",
                this.name, this.ram, this.hdd, this.os, this.colour);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptops) {
            return this.name.equals(((Laptops) obj).name) && this.ram == ((Laptops) obj).ram
                    && this.hdd == ((Laptops) obj).hdd && this.os.equals(((Laptops) obj).os)
                    && this.colour.equals(((Laptops) obj).colour);
        }
        return false;
    }

    public int getRam(){
        return this.ram;
    }
    public int getHDD(){
        return this.hdd;
    }
    public String getOS(){
        return this.os;
    }
    public String getColour(){
        return this.colour;
    }

}
