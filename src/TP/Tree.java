package TP;

public class Tree {
    public final String lastWatered;
    public final String lastFertilized;
    public final String growth;

    public Tree(String lastWatered1, String lastFertilized1, String growth1) {
        this.lastWatered = lastWatered1;
        this.lastFertilized = lastFertilized1;
        this.growth = growth1;
    }

    public static Tree[] initTreesScan (String filePath, int amount) {
        Tree[] tree = new Tree[amount];
        //TODO tree scanner from file

        for (int i = 0; i < amount; i++) {
            Config allTreeFiles = new Config(filePath + "\\Tree " + i + ".cfg");
            String treeGrowth = allTreeFiles.getProperty("growth");
            String lastFertilized = allTreeFiles.getProperty("lastFertilized");
            String lastWatered = allTreeFiles.getProperty("lastWatered");
            tree[i] = new Tree(lastWatered, lastFertilized, treeGrowth);
        }
        return tree;
    }
}
