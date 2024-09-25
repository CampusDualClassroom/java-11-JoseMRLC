package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        redRemote.turnOn();

        System.out.println("Subiendo canal:");
        redRemote.channelUp();
        System.out.println("Canal actual: " + redRemote.channel);
        System.out.println("Subiendo volumen:");
        redRemote.volumeUp();
        System.out.println("Volumen actual: " + redRemote.volume);

        System.out.println("Bajando volumen:");
        for (int i = 0; i < 21; i++) {
            redRemote.volumeDown();
            System.out.println("Volumen actual: " + redRemote.volume);
        }

        System.out.println("Estableciendo canal en 0:");
        redRemote.channelDown();
        System.out.println("Canal actual: " + redRemote.channel);

        System.out.println("Bajando canal:");
        redRemote.channelDown();
        System.out.println("Canal actual: " + redRemote.channel);

        redRemote.turnOff();
        System.out.println("La TV está apagada.");
    }
}