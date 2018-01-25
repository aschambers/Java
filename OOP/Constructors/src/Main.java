public class Main {
    public static void main(String[] args) {
        // create object from Account class, utilizing constructor function
        Account Alan = new Account("12345", 0.00, "Alan Schambers", "myemail@gmail.com", "(999) 123-4567");

        System.out.println(Alan.getAccountNum());
        System.out.println(Alan.getBalance());
        System.out.println(Alan.getPhone());

        Alan.withdrawal(100.0);
        Alan.deposit(50.0);
        Alan.withdrawal(40.0);

        Account Ryan = new Account();
        System.out.println(Ryan.getAccountNum());



        // vip_person class
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Alan", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
