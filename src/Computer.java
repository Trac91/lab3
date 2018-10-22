public class Computer implements IDable {

    private String ID;
    private String make;
    protected Memory memory;

    public Computer(String id, String make, String memType, int memSize)
    {
        setID(id);
        setMake(make);
        memory = new Memory(memType,memSize);
    }

    public String toString()
    {
        return String.format("ID: %15s\n Make: %15s\n %s ", getID(), getMake(),memory.toString());
    }


    @Override
    public void setID(String id) {

    }

    public String getID() {
        return ID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
