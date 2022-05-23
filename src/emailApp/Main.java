package emailApp;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Email email1 = new Email("Pouyan", "Kheradmand");
        System.out.println(email1.showInfo());
    }
}
