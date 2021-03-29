package EX2;

public class Test {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        PhoneNumber phoneNumber1 = new PhoneNumber("0869613108","Viet","Do");
        PhoneNumber phoneNumber2 = new PhoneNumber("0869615408","nam","nguyen");
        PhoneNumber phoneNumber3 = new PhoneNumber("0946546587","nga","nguyen");
        PhoneNumber phoneNumber4 = new PhoneNumber("0869614408","thanh","Do");

        phoneBook.AddPhoneNumber(phoneNumber1);
        phoneBook.AddPhoneNumber(phoneNumber2);
        phoneBook.AddPhoneNumber(phoneNumber3);
        phoneBook.AddPhoneNumber(phoneNumber4);

        System.out.println("Find by phone number: "+phoneBook.FindPhoneNumber("0869613108").getFirstName());

        System.out.println("Get count: "+phoneBook.GetCount());

        System.out.println("Get phone number by index: "+phoneBook.GetPhoneNumber(2).getNumber());

        System.out.println("Find by last name: "+phoneBook.FindPhoneNumbersByLastName("Do").get(0).getFirstName());

    }
}
