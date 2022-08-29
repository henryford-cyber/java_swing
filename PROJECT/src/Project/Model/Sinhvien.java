 
package Project.Model;

public class Sinhvien {

    private int id;
    private String name;
    private String birtday;
    private String gender;
    private String phonenumber;
    private String email;
    private String address;

    public Sinhvien() {
    }

    public Sinhvien(int id, String name, String birtday, String gender, String phonenumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.birtday = birtday;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
    }

    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirtday() {
        return birtday;
    }

    public void setBirtday(String birtday) {
        this.birtday = birtday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
