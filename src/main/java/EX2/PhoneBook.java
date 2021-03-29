package EX2;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private PhoneNumber[] Number = new PhoneNumber[10];
    private int count = 0;

    public PhoneBook() {
    }

    public PhoneNumber[] getNumber() {
        return Number;
    }

    public void setNumber(PhoneNumber[] number) {
        Number = number;
    }

    public void AddPhoneNumber(PhoneNumber phoneNumber) {
        if (phoneNumber != null) {
            Number[count] = phoneNumber;
            count++;
        } else {
            System.out.println("Undefined!");
        }
    }

    public PhoneNumber GetPhoneNumber(int index) {
        if (index >= count) {
            return null;
        }
        return Number[index];
    }

    public int GetCount() {
        return count;
    }

    public PhoneNumber FindPhoneNumber(String phoneNumber) {
        for (int i = 0; i < count; i++) {
            if (phoneNumber.equals(Number[i].getNumber()))
                return Number[i];
        }
        return null;
    }

    public List<PhoneNumber> FindPhoneNumbersByLastName(String lastName){
        List<PhoneNumber> rs = new ArrayList<>();
        for (int i = 0; i<count; i++){
            if (lastName.equals(Number[i].getLastName()))
                rs.add(Number[i]);
        }
        return rs;
    }
}
