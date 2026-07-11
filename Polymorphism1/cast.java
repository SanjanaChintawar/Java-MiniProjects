// notification system

// parent class
class Notification{
    public void send(){
        System.out.println("Sending Notification...");
    }
}

// child classes
class EmailNotification extends Notification{
    @Override
    public void send(){
        System.out.println("Sending Email Notification");
    }
}
class SMSNotification extends Notification{
    @Override
    public void send(){
        System.out.println("Sending SMS Notification");
    }
}
class PushNotification extends Notification{
    @Override
    public void send(){
        System.out.println("Sending Push Notification");
    }
}


// main clas

public class cast {
    public static void main(String[] args){

        Notification[] notifications = {new EmailNotification(), new PushNotification(), new SMSNotification()};

        for(Notification n : notifications){
            n.send();
        }
        
    }
}
