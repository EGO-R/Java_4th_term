package org.java4term.pr_7.adapter;

public class CardAdapter implements USB {
    private MemoryCard memoryCard;

    public CardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        memoryCard.copy();
    }
}
