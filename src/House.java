public class House {
    private String address;
    private String type;
    private double price;
    private Person owner;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public House()
    {
        this.address = "No Address Specified";
        this.type = "No Type Specified";
        this.price = 0.0;
        this.owner = new Person();
    }

    public House(String address, String type, double price,String n,int age,char g )
    {
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(new Person(n,age,g));
    }

    @Override
    public String toString() {
        return "Address: " + getAddress() + "\nType: " + getType() + "\nPrice: " + getPrice() +
                "\nOwner: " + owner.toString();
    }
}
