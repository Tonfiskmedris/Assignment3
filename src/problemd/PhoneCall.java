package problemd;

//Klass för att skapa våra callers.
public class PhoneCall {
   private String name;
   private String number;

    public void setPhoneCallName(String name){
        this.name = name;
    }

    public void setPhoneCallNumber(String number){
        this.number = number;
    }

    public String getPhoneCallName() {
        return name;
    }

    public String getPhoneCallNumber() {
        return number;
    }

}

