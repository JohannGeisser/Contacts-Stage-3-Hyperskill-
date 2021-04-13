import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Organization extends Contact {

    String address;

    //public Organization(String name, String address, String number) {
    //    super(name, number);
    //    this.address = address;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (checkPhoneNumber(number)) {
            this.number = number;
        } else {
            System.out.println("No valid number");
            this.number = "[no number]";
        }
    }

    public void addContact() {

        Scanner scanner = new Scanner(System.in);
        Organization organization = new Organization();

        System.out.println("Enter the organization name:");
        organization.setName(scanner.nextLine());
        System.out.println("Enter the address:");
        organization.setAddress(scanner.nextLine());
        System.out.println("Enter the number:");
        organization.setNumber(scanner.nextLine());

        Contact contact = organization;


    }

    private boolean checkPhoneNumber(String number) {

        Pattern pattern = Pattern.compile("[0-9]{8}");

        Matcher matcher = pattern.matcher(number);
        return matcher.matches();

    }

    @Override
    public String toString() {
        return "Organization name: " + name  + '\n' +
                "Address: " + address + '\n' +
                "Number: " + number + '\n';
    }



}
