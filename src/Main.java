import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();


        while (true) {
            System.out.println("Enter action (add, remove, edit, count, info, exit):");
            String action = scanner.next();
            switch (action) {
                case "add":

                    while (true) {

                        System.out.println("Enter the type (person, organization):");
                        String type = scanner.next();

                        if (type.equals("person")) {
                            Person person = new Person();
                            System.out.println("Enter the name:");
                            person.setName(scanner.next());
                            System.out.println("Enter the surname:");
                            person.setSurname(scanner.next());
                            System.out.println("Enter the birthday:");
                            person.setBirthday(scanner.next());
                            System.out.println("Enter the gender:");
                            person.setGender(scanner.next());
                            System.out.println("Enter the number:");
                            person.setNumber(scanner.next());
                            System.out.println("");
                            phoneBook.addEntry(person);
                            break;
                        } else if (type.equals("organization")) {
                            Organization organization = new Organization();
                            System.out.println("Enter the organization name:");
                            organization.setName(scanner.next());
                            System.out.println("Enter the address:");
                            organization.setAddress(scanner.next());
                            System.out.println("Enter the number:");
                            organization.setNumber(scanner.next());
                            System.out.println("");
                            phoneBook.addEntry(organization);
                            break;
                        } else {
                            System.out.println("No valid option");
                        }
                    }
                    break;
                case "remove":
                    phoneBook.removeContact();
                    break;
                case "edit":
                    phoneBook.editContact();
                    break;
                case "count":
                    phoneBook.countContact();
                    break;
                case "info":
                    phoneBook.infoContact();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("No valid option");
            }
        }





    }
}
