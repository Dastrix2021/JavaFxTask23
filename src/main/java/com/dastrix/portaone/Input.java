package com.dastrix.portaone;

public final class Input {
    private final String text;
    private Input(String text) {
        this.text = text;
    }
    public static Input valueOf(String text) {
        String t = text.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "")
                .replaceAll("\n", " ");
        return new Input(t);
    }
    public String getText() {
        return text;
    }
}
