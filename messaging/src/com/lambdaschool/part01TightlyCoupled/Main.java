package com.lambdaschool.part01TightlyCoupled;

public class Main

    //The main class always have to have a public static void main.

    // The boilerplate for public static void main in IntelliJ is "psvm" and tab
{

    public static void main(String[] args)
    {
        MyApplication messaging = new MyApplication();
        messaging.send("Hello", "JRMMBA8314");

        // We are going to call a method from the application that's called 'messaging'.
        // From messaging it's going to call 'send'
        // It's going to 2 parameters ( "Hello" the message we want to send, "JRMMBA8314" the person who will recieve the message.)
    }
}
