package com.tony.java.interfacePolymorphism;

public class interfacePolymorphismTest {
    
    public static void main(String[] args) {
        GoogleMini googleMini = new GoogleMini();
        AlarmClock alarmClock = new AlarmClock();
        IPhone iPhone = new IPhone();
        alarmTest(iPhone);
        alarmTest(googleMini);
        alarmTest(alarmClock);
        
    }
    
    private static void alarmTest(Alarm i){
        i.alarm();
    }
}
