package com.ocean.demo;

public class DemoService {
    private String prefix;

    private String suffix;

    public DemoService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String say(String text) {
        return String.format("%s , %s , %s", prefix, text, suffix);
    }
}
