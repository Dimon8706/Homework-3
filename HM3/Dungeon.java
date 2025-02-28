package HM3;

import java.util.*;
public class Dungeon {
    private String name;
    private List<String> rooms;
    private List<String> npcs;
    private List<String> traps;
    private Map<String, String> secretPassages;

    public Dungeon(String name, List<String> rooms, List<String> npcs, List<String> traps, Map<String, String> secretPassages) {
        this.name = "Lost Catacombs";
        this.rooms = List.of("Ritual Hall", "Abandoned Library", "Dark Crypt", "Cave of the Damned");
        this.npcs = List.of("Necromancer Malazar", "Phantom Guardian", "Fallen Paladin");
        this.traps = List.of("Blood Curse in Dark Crypt", "Cave-in in the Cave of the Damned");
        this.secretPassages = Map.of("Ritual Hall", "Hidden Tomb");
    }

    public void showDungeonInfo() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: " + rooms);
        System.out.println("NPCs: " + npcs);
        System.out.println("Traps: " + traps);
        System.out.println("Secret Passages: " + secretPassages);
    }
}
