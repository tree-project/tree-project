package TP;

import java.io.File;

public class Tree {
    private final String lastWatered;
    private final String lastFertiized;
    private final int growth;

    public Tree(String lastWatered1, String lastFertilized1, int growth1) {
        this.lastWatered = lastWatered1;
        this.lastFertiized = lastFertilized1;
        this.growth = growth1;
    }

    public Tree initTreesScan (String filePath, int amount) {
        Tree tree = new Tree("2" ,"2", 2);
        //TODO tree scanner from file
        File treeFile = new File(filePath);
        for (int i = 0; i <= amount; i++) {

        }
        return tree;
    }
}
