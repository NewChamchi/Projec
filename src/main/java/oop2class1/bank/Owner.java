package oop2class1.bank;

public class Owner {
    private String name;
    private String address;
    private String phone;

    public Owner(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void showOwner() {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("phone = " + phone);
    }

    public void modifyInformation() {}
}
