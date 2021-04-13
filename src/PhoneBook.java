import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addEntry(Contact contact) {
        contacts.add(contact);
        System.out.println("Added Contact!");
    }

    public void infoContact () {
        int i = 1;
        int j = 1;
        for (Contact entry : contacts) {
            System.out.println(i +". " + entry.getName());
            i++;
        }

        System.out.println("Enter index to show info:");
        int index = scanner.nextInt();

        for (Contact entry : contacts) {

            if (index == j) {

                System.out.println(contacts.get(j - 1).toString());

            }

            j++;
        }

    }

    public void countContact() {
        int cont = 0;
        for (Contact entry : contacts) {
            cont++;
        }
        System.out.println(cont + " Contacts");
    }

    public void editContact() {

        int i = 1;
        int j = 1;

        for (Contact entry : contacts) {
            System.out.println(i +". " + entry.getName());
            i++;
        }

        System.out.println("Select a record:");
        int index = scanner.nextInt();

        for (Contact entry : contacts) {

            if (index == j) {

                if (contacts.get(j - 1).getClass().getSimpleName().equals("Person")) {

                    System.out.println("Select a field (name, surname, birth, gender, number):");

                    if (scanner.nextLine().equals("name")) {
                        System.out.println("Enter the name:");
                        String name = scanner.next();
                        contacts.get(j - 1).setName(name);
                        System.out.println("Record updated!");
                        break;
                    }

                    if (scanner.nextLine().equals("surname")) {
                        System.out.print("Enter the surname:");
                        String surname = scanner.next();
                        Person person = (Person) contacts.get(j - 1);
                        person.setSurname(surname);
                        System.out.println("Record updated!");
                        break;
                    }

                    if (scanner.nextLine().equals("birth")) {
                        System.out.println("Enter the birthday:");
                        String birthday = scanner.next();
                        Person person = (Person) contacts.get(j - 1);
                        person.setBirthday(birthday);
                        System.out.println("Record updated!");
                        break;
                    }

                    if (scanner.nextLine().equals("gender")) {
                        System.out.println("Enter the gender:");
                        String gender = scanner.next();
                        Person person = (Person) contacts.get(j - 1);
                        person.setGender(gender);
                        System.out.println("Record updated!");
                        break;
                    }

                    if (scanner.next().equals("number")) {
                        System.out.println("Enter the number:");
                        String number = scanner.next();
                        contacts.get(j - 1).setNumber(number);
                        System.out.println("Record updated!");
                        break;
                    }

                } else {

                    System.out.println("Select a field (name, address, number):");

                    if (scanner.next().equals("name")) {
                        System.out.println("Enter the name:");
                        String name = scanner.next();
                        contacts.get(j - 1).setName(name);
                        System.out.println("Record updated!");
                        break;
                    }

                    if (scanner.nextLine().equals("address")) {
                        System.out.println("Enter the address:");
                        String address = scanner.next();
                        Organization organization = (Organization) contacts.get(j - 1);
                        organization.setAddress(address);
                        System.out.println("Record updated!");
                        break;
                    }

                    if (scanner.nextLine().equals("number")) {
                        System.out.print("Enter the number:");
                        String number = scanner.next();
                        contacts.get(j - 1).setName(number);
                        System.out.println("Record updated!");
                        break;
                    }

                }



            }

            j++;
        }

    }

    public void removeContact() {

        int i = 1;
        int j = 1;

        int indexFlag = 0;

        for (Contact entry : contacts) {
            System.out.println(i +". " + entry.getName());
            i++;
        }

        System.out.println("Enter index to remove:");
        int index = scanner.nextInt();

        contacts.remove(index - 1);

    }

}
