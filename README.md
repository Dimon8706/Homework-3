These Java files implement a Builder Pattern for creating a Dungeon in a text-based game.

Dungeon.java (​
)
Represents a dungeon with properties like rooms, NPCs, traps, and secret passages.
Has a method showDungeonInfo() to display the dungeon details.
IDungeonBuilder.java (​
)
An interface defining methods for building a dungeon step by step (adding rooms, NPCs, traps, and secret passages).
SimpleDungeonBuilder.java (​
)
Implements IDungeonBuilder to construct a Dungeon object using the builder pattern.
MUDBuilderDemo.java (​
)
A demo class that uses SimpleDungeonBuilder to create a sample dungeon ("Lost Catacombs") and displays its details.
