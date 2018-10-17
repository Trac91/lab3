import javax.swing.*;

public class HouseDriver {
    public static void main(String[] args) {

        String address;
        String type;
        double price;
        Person owner;
        String name;
        int age;
        char gender;


        // House h = new House("Tralee","Mansion",123456,"JB",28,'m');


        House h1 = new House();
        System.out.println(h1.toString());

        address = JOptionPane.showInputDialog("Enter Address");
        h1.setAddress(address);
        System.out.println(h1.toString());
        type = JOptionPane.showInputDialog("Enter Type");
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter Price"));
        //h = new House(name,age,gender);

        name = JOptionPane.showInputDialog("Enter name");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        gender = JOptionPane.showInputDialog("Enter Gender: ").charAt(0);


        House h2 = new House(address, type, price, name, age, gender);
        System.out.println(h2.toString());
        // System.out.println(house.toString(address,type,price,name,age,gender));


    }
}
