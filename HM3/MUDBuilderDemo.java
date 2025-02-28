import HM3.Dungeon;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Lost Catacombs")
                .addRoom("Ritual Hall")
                .addRoom("Abandoned Library")
                .addRoom("Dark Crypt")
                .addRoom("Cave of the Damned")
                .addNPC("Necromancer Malazar")
                .addNPC("Phantom Guardian")
                .addNPC("Fallen Paladin")
                .addTrap("Blood Curse in Dark Crypt")
                .addTrap("Cave-in in the Cave of the Damned")
                .addSecretPassage("Ritual Hall", "Hidden Tomb")
                .build();

        dungeon.showDungeonInfo();
    }
}
