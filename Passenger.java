public class Passenger {

    private String name;
    private int age;
    private long phoneNo;

    public Passenger(String name, int age, long phoneNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
