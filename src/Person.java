
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person extends Contact {

    String surname;
    String birthday;
    String gender;


    /*public Person(String name, String surname, String birthday, String gender, String number) {
        super(name, number);
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        if (checkBirthday(birthday)) {
            this.birthday = birthday;
        } else {
            System.out.println("No valid birthday");
            this.birthday = "[no birthday]";
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (checkGender(gender)) {
            this.gender = gender;
        } else {
            System.out.println("No valid gender");
            this.gender = "[no gender]";
        }

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

        /*Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Enter the name:");
        person.setName(scanner.nextLine());
        System.out.println("Enter the surname:");
        person.setSurname(scanner.nextLine());
        System.out.println("Enter the birthday:");
        person.setBirthday(scanner.nextLine());
        System.out.println("Enter the gender:");
        person.setGender(scanner.nextLine());
        System.out.println("Enter the number:");
        person.setNumber(scanner.nextLine());

         */


        //PhoneBook listEntry = new PhoneBook();

        //listEntry.addEntry(person);
    }


    private boolean checkPhoneNumber(String number) {

        Pattern pattern = Pattern.compile("[0-9]{8}");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();

    }

    private boolean checkBirthday(String birthday) {

        Pattern pattern = Pattern.compile( "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");
        Matcher matcher = pattern.matcher(birthday);
        return matcher.matches();

    }

    private boolean checkGender(String gender) {

        Pattern pattern = Pattern.compile("[MF]");
        Matcher matcher = pattern.matcher(gender);
        return matcher.matches();

    }


    @Override
    public String toString() {
        return "Name: " + name  + '\n' +
                "Surname: " + surname + '\n' +
                "Birth day: " + birthday + '\n' +
                "Gender: " + gender + '\n' +
                "Number: " + number + '\n';
    }
}
