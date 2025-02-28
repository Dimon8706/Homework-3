package HM3;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(String room);
    IDungeonBuilder addNPC(String npc);
    IDungeonBuilder addTrap(String trap);
    IDungeonBuilder addSecretPassage(String fromRoom, String toRoom);
    Dungeon build();
}
