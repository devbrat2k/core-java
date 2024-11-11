package com.devbrat2k.java21.v21;

public class SwitchPatternMatchingEx {
    public static void main(String[] args) {

        Number o = null;
        String formatted = switch (o) {
            case Integer i when i > 10 -> String.format("a large Integer %d", i);
            case Integer i             -> String.format("a small Integer %d", i);
            case Long l                -> String.format("a Long %d", l);
            default                    -> o.toString();
        };
    }
}
