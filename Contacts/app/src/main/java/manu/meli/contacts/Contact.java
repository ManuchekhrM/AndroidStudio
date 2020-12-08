package manu.meli.contacts;

public class Contact {
    private int id;
    private String name;
    private String lastName;
    private String gmail;
    private String phone;

    public Contact(int id, String name, String lastName, String gmail, String phone) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gmail = gmail;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
