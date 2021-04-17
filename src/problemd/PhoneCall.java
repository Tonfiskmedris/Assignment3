package problemd;

public class PhoneCall {
    public String name;
    public int number;

    public void setPhoneCallName(String name){
        this.name = name;
    }

    public void setPhoneCallNumber(int number){
        this.number = number;
    }

    public void display(){
        System.out.println("Name of caller: " + name + ", phone number: " + number);
        System.out.println();
    }
}

