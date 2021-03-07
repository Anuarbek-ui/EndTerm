package entities;

public class Customer {
    private int customer_id;
    private String customer_name;
    private String date_of_birth;
    private String gender;
    private String phone_number;
    private String email;
    private String country;
    private String ageGroup;
    private double availableFunds;

    public Customer(int customer_id, String customer_name, String date_of_birth, String gender, String phone_number, String email, String country, String ageGroup, double availableFunds) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.phone_number = phone_number;
        this.email = email;
        this.country = country;
        this.ageGroup = ageGroup;
        this.availableFunds = availableFunds;
    }

    public Customer(String ageGroup) {
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", gender='" + gender + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", ageGroup='" + ageGroup + '\'' +
                ", availableFunds=" + availableFunds +
                '}';
    }
}
