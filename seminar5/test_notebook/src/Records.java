public class Records {

    public String id;
    public String name;
    public String phone;
    public String info;

    public Records(String id, String name, String phone, String info) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.info = info;
    }

    public void show() {
        System.out.printf("ID record: %s \n", this.id);
        System.out.printf("Name: %s \n", this.name);
        System.out.printf("Phone: %s \n", this.phone);
        System.out.printf("Info: %s \n", this.info);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Records)) return false;
        Records that = (Records) o;
        return id == that.id &&
                name == that.name &&
                phone == that.phone &&
                info == that.info;
    }

}

