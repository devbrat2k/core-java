package com.devbrat2k.java21.v21;

public class SwitchPatternMatchWithSealedClass {
    public static void main(String[] args) {
       checkResult(new Pending());
       checkResult(new Timeout());

    }

    private static void checkResult(OtherResult result){
        switch (result) {
            case Pending p -> p.message();
            case Timeout t -> t.message();
        };
    }
}


sealed interface OtherResult permits Pending, Timeout {
    void message();
}

final class Pending implements OtherResult{
    @Override
    public void message() {
        System.out.println("Pending!");
    }
}

final class Timeout implements OtherResult{
    @Override
    public void message() {
        System.out.println("Timeout!");
    }
}

