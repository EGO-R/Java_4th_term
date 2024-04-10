package org.java4term.pr_7.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        USB usb = new CardAdapter(new MemoryCard());
        usb.connectWithUsbCable();
    }
}
