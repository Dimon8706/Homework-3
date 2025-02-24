# Week 2 Homework: Advanced Creational Patterns – Builder & Prototype

## Overview

In Week 2, we explored two advanced Creational Patterns: **Builder** and **Prototype**. These patterns help solve the challenges of constructing complex objects and efficiently replicating similar objects, respectively. In this homework, you will apply what you've learned by implementing these patterns in the context of our project. You may choose one or more of the following tasks.

## Assignments

### Assignment 1: Implement a Builder for a Complex Object

**Task:**  
- Create an interface (e.g., `IDungeonBuilder`) for constructing a **Dungeon** object.  
- The Dungeon should have the following attributes:
  - **Name:** A string representing the dungeon's name.
  - **Rooms:** A list of `Room` objects.
  - **NPCs:** A list of `NPC` objects (or a subset, such as a boss monster).
- Implement a concrete builder class (e.g., `SimpleDungeonBuilder`) that allows step-by-step configuration:
  - Methods like `setDungeonName(String name)`, `addRoom(Room room)`, and `addNPC(NPC npc)`.
  - A `build()` method that returns the final `Dungeon` object.
- Create a demo class (`MUDBuilderDemo.java`) to show how to use your builder.  
- **Extra Credit:** Enhance your builder to support optional features (e.g., adding traps, treasure rooms, or secret passages).

**Deliverables:**  
- `IDungeonBuilder.java`
- `SimpleDungeonBuilder.java`
- `Dungeon.java` (the product class)
- `MUDBuilderDemo.java` demonstrating the builder in action

---

### Assignment 2: Implement a Prototype for Cloning Objects

**Task:**  
- Choose one or more entities (e.g., `Room` or `NPC`) and modify them to implement a **Cloneable** interface (e.g., `CloneableGameEntity`).
- Define a method `cloneEntity()` that returns a copy of the object.
- Ensure that the cloning process copies the essential fields (for example, for `Room`: name and description; for `NPC`: name, description, and optionally, health).
- Write a demo class (`MUDPrototypeDemo.java`) that:
  - Creates a “prototype” instance of your chosen entity.
  - Clones it multiple times.
  - Optionally, modify a cloned instance to show that it is a separate copy.
- **Extra Credit:** Implement deep cloning if your entity contains nested objects (like a list of items).

**Deliverables:**  
- Updated entity classes (e.g., `Room.java` and/or `NPC.java`) with a `cloneEntity()` method.
- `CloneableGameEntity.java` (interface or abstract class)
- `MUDPrototypeDemo.java` demonstrating the cloning functionality

---

### Assignment 3: Combine Builder and Prototype (Advanced)

**Task:**  
- Implement a **Builder** for a complex object (e.g., a **Dungeon**), as described in Option 1.
- Additionally, add a **Prototype** method to one of the entities used in the Dungeon (e.g., `Room`) so that once the Dungeon is built, you can quickly clone a template Room to add multiple similar rooms.
- Write a demo class that:
  - Uses your builder to create a basic Dungeon.
  - Then uses the Prototype pattern to clone one of the rooms several times, adding the clones to the Dungeon.
- **Extra Credit:** Allow slight modifications on clones (e.g., append “Clone #” to the room’s name).

**Deliverables:**  
- The files from Option 1 and Option 2, integrated.
- A demo class (e.g., `MUDCombinedDemo.java`) showing how a built object can be extended using prototypes.

---

## General Requirements

- **Documentation:**  
  Comment your code to explain key steps, especially where the Builder and Prototype patterns are implemented.
- **Testing:**  
  Ensure your code compiles and runs. Provide sample output (via console screenshots or text) demonstrating that your Builder assembles the object correctly and that your Prototype method produces distinct copies.
- **Submission:**  
  Upload all relevant `.java` files to your GitHub repository (or as specified by your instructor) along with a short README that explains your approach and how to run your demos.

## Grading Criteria

- **Completeness:** All required files and tasks are implemented.
- **Correctness:** The Builder and Prototype patterns function as described.
- **Code Quality:** Clear, maintainable, and well-documented code.
- **Creativity:** Extra credit work (e.g., additional optional features, deep cloning) is appreciated.

---

**Good luck, and have fun exploring advanced object creation techniques with Builder and Prototype!**
