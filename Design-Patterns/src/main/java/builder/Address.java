package builder;

public class Address {

    private String fName;
    private String lName;
    private String fNo;
    private String society;
    private int pin;

    private Address(Builder b) {
        this.fName = b.fName;
        this.lName = b.lName;
        this.pin = b.pin;
        this.fNo = b.fNo;
        this.society = b.society;
    }

    public static class Builder{

        private String fName;
        private String lName;
        private String fNo;
        private String society;
        private int pin;

        Builder(String fName,String lName,int pin){
            this.fName = fName;
            this.lName = lName;
            this.pin = pin;
        }
        public Builder fNo(String fNo){
            this.fNo = fNo;
            return this;
        }

        public Builder society(String society){
            this.society = society;
            return this;
        }

        public Address build(){
            return new Address(this);
        }

    }

}

class Client{
    public static void main(String[] args) {
        Address address = new Address.Builder("Saurabh","Tiwari",500081).fNo("C301").society("laburnum Park").build();
    }
}
