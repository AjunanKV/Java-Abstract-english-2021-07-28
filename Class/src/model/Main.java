package model;

abstract class Template {
    public abstract void Transportation(int car,int bus,int train, int plane,int money);
}
class transportation extends Template{
    @Override
    public void Transportation(int car, int bus, int train, int plane, int money) {
        if(car<=money)
        {
            System.out.println("Xiaoming  can ride car");
        }
        if(bus<=money)
        {
            System.out.println("Xiaoming  can ride bus");
        }
        if(train<=money)
        {
            System.out.println("Xiaoming  can ride train");
        }
        if(plane<=money)
        {
            System.out.println("Xiaoming  can ride plane");
        }
    }
}
public class Main {
    public static void main(String[] args) {
	// write your code here
        int car=500;
        int bus=300;
        int train=400;
        int plane=1000;
        int money=500;
        Template transportation = new transportation();
        transportation.Transportation(car,bus,train,plane,money);
    }
}
