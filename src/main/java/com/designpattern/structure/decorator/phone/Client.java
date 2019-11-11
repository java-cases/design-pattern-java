package com.designpattern.structure.decorator.phone;

public class Client {

    public static void main(String[] args) {

        //普通手机
        Phone phone=new IPhone();
        phone.call();
        System.out.println("====================");

        //使用装饰类 -->增加了彩铃功能
        PhoneDecorator ringPhone=new RingPhoneDecorator(phone);
        ringPhone.call();
        System.out.println("====================");

        //使用装饰类 -->增加了听音乐的功能
        PhoneDecorator musicPhone=new MusicPhoneDecorator(phone);
        musicPhone.call();
        System.out.println("====================");

        //装饰类可以组合 -->先响铃-->接电话-->接完电话后，就听音乐
        //装饰类的特点
        PhoneDecorator musicRingPhone=new MusicPhoneDecorator(new RingPhoneDecorator(phone));
        musicRingPhone.call();
        System.out.println("===========================");

        PhoneDecorator ringMusicPhone= new RingPhoneDecorator(new MusicPhoneDecorator(phone));
        ringMusicPhone.call();
    }
}
