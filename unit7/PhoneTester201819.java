public class PhoneTester201819 {
    public static void main(String[] args) {
        Phone phone0 = new Phone();
        System.out.println(phone0);//A phone charged at 0%
        
        Phone phone37 = new Phone(37);
        System.out.println(phone37);//A phone charged at 37%
        
        Phone phone150 = new Phone(150);
        System.out.println(phone150);//A phone charged at 100%
        
        Phone phone23n = new Phone(-23);
        System.out.println(phone23n);//A phone charged at 0%
        
        phone150.die();//The phone needs to be charged
        System.out.println(phone150);//A phone charged at 0%
        
        phone37.checkEmail();//No new messages
        System.out.println(phone37);//A phone charged at 36%
        
        phone0.checkEmail();//The phone needs to be charged
        System.out.println(phone0);//A phone charged at 0%
        
        Phone phone1 = new Phone(1);
        phone1.checkEmail();//No new messages.
                            //The phone needs to be charged
        System.out.println(phone1);//A phone charged at 0%
        
        phone37 = new Phone(37);
        phone37.charge(10);//Charging...
        System.out.println(phone37);//A phone charged at 47%
        
        phone37 = new Phone(37);
        phone37.charge(100);//Charging...
        System.out.println(phone37);//A phone charged at 100%
        
        phone37 = new Phone(37);
        phone37.charge(-20);//Charging...
        System.out.println(phone37);//A phone charged at 37%
        
        phone37.playGame();
        System.out.println(phone37);//A phone charged at 37%
        Phone phone5 = new Phone(5);
        phone5.playGame();
        System.out.println(phone1);
    }
}