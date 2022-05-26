package EmployeeWage;
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS_BOOK");

        ContactVariables firstContact = new ContactVariables();
        firstContact.firstName= "Alok";
        firstContact.lastName = "Avasthi";
        firstContact.area = "New Mumbai";
        firstContact.city= "Mumbai";
        firstContact.zip = "452452";
        firstContact.number = "452613455";
        firstContact.state = "Maharashtra";
        firstContact.email = "A.a@gmail.com";

        //System.out.println(firstContact.firstName + "\n" + firstContact.email + "\n" + firstContact.lastName +
                //"\n" + firstContact.city);

        String[][] AddressBook = new String[10][8];

        AddressBook[1][0] = firstContact.firstName;
        AddressBook[1][1] = firstContact.lastName;
        AddressBook[1][2] = firstContact.area;
        AddressBook[1][3] = firstContact.city;
        AddressBook[1][4] = firstContact.zip;
        AddressBook[1][5] = firstContact.number;
        AddressBook[1][6] = firstContact.state;
        AddressBook[1][7] = firstContact.email;

        System.out.println(AddressBook[1][0] + "\n" + AddressBook[1][1] + "\n" + AddressBook[1][5]);
    }
}
