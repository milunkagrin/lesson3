package dom4;

public class Application {
    public static void main(String[] args) {
         MessageStore zin = new MessageStore();

         User user = new User("Вася", "Иванов", "mail");           // не уверена, что я правильно поняла, как это все должно работать, но 
         Message m1 = new Message(1, "hello", user );              // сообщения записываются в массив.
         Message m2 = new Message(2, "hello", user );
         Message m3 = new Message(3, "hello", user );
         Message m4 = new Message(4, "hello", user );


        zin.Add(m1);
        zin.Add(m2);
        zin.Add(m3);
        zin.Add(m4);

        System.out.println(user.name);
        System.out.println(zin.message[1].messageld + " " + zin.message[1].text);


    }
        
}













