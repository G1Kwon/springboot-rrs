package kr.co.plateland.rrs.domain;

public class Restaurant {

    private final long id;
    private final String name;
    private final String address;

    //생성자
    public Restaurant(long id, String name, String address) {
        //멤버변수
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation() {
        return name + " in " + address;
    }
}
