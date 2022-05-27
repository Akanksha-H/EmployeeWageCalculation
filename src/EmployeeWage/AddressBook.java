package EmployeeWage;
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS_BOOK");
        AddressBook User = new AddressBook("Anika","Arora","Juhu","Juhu","Mumbai",
                "Maharashtra","Anika@gmail.com", 45,4521245);
    }
    AddressBook(String firstName, String lastName, String locality, String area, String city,
                String state, String email, int zip, int number)
    {
        System.out.println("Details of User"+ "\n" + "FirstName = " + firstName + "\n" + "LastName = " +lastName +
                            "\n" + "Locality = "+locality + "\n" + "Area = "+area + "\n" + "City = "+city + "\n" +
                            "State = "+ state + "\n" + "Email =" +email + "\n" + "Zip =" + zip + "\n" +"Number = "
                            + number);
    }
}

