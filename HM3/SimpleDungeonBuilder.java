import HM3.Dungeon;
import HM3.IDungeonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<String> rooms = new ArrayList<>();
    private List<String> npcs = new ArrayList<>();
    private List<String> traps = new ArrayList<>();
    private Map<String, String> secretPassages = new HashMap<>();

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(String room) {
        rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(String npc) {
        npcs.add(npc);
        return this;
    }

    @Override
    public IDungeonBuilder addTrap(String trap) {
        traps.add(trap);
        return this;
    }

    @Override
    public IDungeonBuilder addSecretPassage(String fromRoom, String toRoom) {
        secretPassages.put(fromRoom, toRoom);
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name, rooms, npcs, traps, secretPassages);
    }
}
