package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = this.setDepartment();
        this.password = this.randomPassword(this.defaultPasswordLength);
        System.out.println("your password is " + this.password);
        String var10001 = firstName.toLowerCase();
        this.email = var10001 + "." + lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
    }

    private String setDepartment() {
        System.out.println("New Employee: " + this.firstName + " " + this.lastName + "\nDepartment Code: \n1 for Sale\n2 for Development\n3 for Accounting\n0 for none\n Please Enter Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "Development";
        } else {
            return depChoice == 3 ? "Accounting" : "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for(int i = 0; i < length; ++i) {
            int rand = (int)(Math.random() * (double)passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public String showInfo() {
        return "Display Name: " + this.firstName + " " + this.lastName + "\nCompany Email: " + this.email + "\nMailbox Capacity: " + this.mailboxCapacity + "mb";
    }
}