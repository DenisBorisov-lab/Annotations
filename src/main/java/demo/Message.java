package demo;

import java.lang.reflect.Field;

public class Message {
    @MessageValue
    public static String letter;

    @MessageValue("Twitter")
    public static String sociableClub;

    public static void main(String[] args) throws IllegalAccessException {
        Message message = new Message();
        for (Field field : Message.class.getFields()){
            MessageValue messageValue = field.getAnnotation(MessageValue.class);
            field.set(message, messageValue.value());
        }
        System.out.println(letter);
        System.out.println(sociableClub);
    }
}
