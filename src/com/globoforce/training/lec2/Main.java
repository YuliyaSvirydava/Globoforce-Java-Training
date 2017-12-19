package com.globoforce.training.lec2;

public class Main {
    public static void main(String[] args) {
        Nominee nominee = new Nominee("Polina");
        Award award = new Award(500);
        Nominator nominator = new Nominator("Noel");
        nominator.nominate(nominee, award);
    }
}
