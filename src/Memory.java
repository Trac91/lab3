public class Memory {

    private String type;
    private int size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Memory()
    {
        this("Unknown",0);
    }

    public Memory(String type, int size) // indirectly set up
    {
        setType(type);
        setSize(size);
    }

    public String toString()
    {
        return String.format("Memory Type: %15s\n Size: %d GBytes \n", getType(),getSize());
    }
}
