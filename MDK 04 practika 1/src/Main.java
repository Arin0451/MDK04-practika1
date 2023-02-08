public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("");

        Phone phone1 = new Phone("82346879641", "WHATTAPHONk2", 451);
        Phone phone2 = new Phone("82347435745", "IphoneProMax1923", 100);
        Phone phone3 = new Phone("81759243695", "Chel203", 666);
        System.out.println("");

        phone1.receiveCall("Даня");
        System.out.println(phone1.GetNumber());
        phone2.receiveCall("Кто то");
        System.out.println(phone2.GetNumber());
        phone3.receiveCall("Ты КТо");
        System.out.println(phone3.GetNumber());
        System.out.println("");

        phone1.receiveCall("Даня", "82346879641");
        phone2.receiveCall("Кто то", "82347435745");
        phone3.receiveCall("Ты КТо", "81759243695");
        System.out.println("");

        String[] nums = new String[]{"82346879641", "82347435745", "81759243695"};
        Phone.sendMessage(nums);
        System.out.println("");
        System.out.println("");

        System.out.println("Задание 2");

        System.out.println("");
        Person nn = new Person();
        Person Arin = new Person("Прус Данила Александрович", 17);
        Arin.move(Arin.fullName);
        Arin.talk(Arin.fullName);
    }
}