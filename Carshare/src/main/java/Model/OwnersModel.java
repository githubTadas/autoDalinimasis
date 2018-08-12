package Model;

public class OwnersModel {

    private String id;
    private String name;
    private String contactNo;
    private String address;
    private String email;

    public OwnersModel () {
    }

    public OwnersModel(String id, String name, String contactNo, String address, String email) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getContactNo() {
        return contactNo;
    }


    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
}

