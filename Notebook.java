public class Notebook {
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Notebook(int ram, int hdd, String os, String color){
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String nout = new String();
        nout += "ОЗУ ";
        nout += ram; 
        nout += "\nHDD ";
        nout += hdd;
        nout += "\nОС ";
        nout +=  os;
        nout += "\nЦвет ";
        nout += color;
        
        return nout;
    }

    
   

    
}
