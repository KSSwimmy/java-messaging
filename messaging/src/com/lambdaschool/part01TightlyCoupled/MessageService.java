package com.lambdaschool.part01TightlyCoupled;

public class MessageService
        // this class has 2 methods
{
    public void sendMessage(String message, String address) //method 1 - to send a message
    {
        // "sout + tab" is the shortcut for System.out.println()
        System.out.println("For " + address + ": " + message);
    }
    public String readMessage() //method 2 to recieve or read a message
    {
        return ("Not Implemented");
    };

}
