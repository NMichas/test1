package com.example.hello;

/**
 * Simple Hello World command-line application.
 */
public final class App {

    private App() {
    }

    /**
     * Builds the greeting for the given name.
     *
     * @param name the name to greet, or {@code null} for a generic greeting
     * @return the greeting message
     */
    public static String greeting(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, World!";
        }
        return "Hello, " + name.strip() + "!";
    }

    public static void main(String[] args) {
        String name = args.length > 0 ? String.join(" ", args) : null;
        System.out.println(greeting(name));
    }
}
