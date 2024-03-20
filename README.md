# SOLID Principles - Assignment 3 - Red Deer Polytechnic CPRO 2221 JAVA EE 

## Overview

This project showcases the application of three SOLID principles - the Interface Segregation Principle (ISP), 
the Open/Closed Principle (OCP), and the Single Responsibility Principle (SRP). These principles are fundamental 
concepts in object-oriented programming that promote code modularity, flexibility, and maintainability.

## Interface Segregation Principle (ISP) in RPG System

### Overview

This part of the project demonstrates the application of the Interface Segregation Principle (ISP) in an RPG system. 
The ISP states that "Clients should not be forced to depend upon interfaces they do not use." It promotes the idea 
that classes should only implement interfaces containing methods relevant to their functionality.

#### Violating ISP

##### Character System Interfaces

- **IBattleActions**: Interface defining any actions that can be done during combat by any character. 

##### Character Classes

- **Warrior.java**: Class implementing the `IBattleActions` interface.
- **Wizard.java**: Class implementing the `IBattleActions` interface.

##### Violations

Within `IBattleActions` is every possible method for an in-combat character including `UseMana`.
The **Warrior.Java** class does not have the ability to use mana, This violates the ISP principle
"Clients should not be forced to depend upon interfaces they do not use." as there is unused methods
within the interface.

#### Solving ISP

##### Character System Interfaces

- **IAttack**: Interface defining the attack methods.
- **IDefend**: Interface defining the defence methods.
- **IManaUser**: Interface defining methods related to mana usage.
- **IItemUser**: Interface defining methods related to item usage.
- **IStaminaUser**: Interface defining methods related to stamina usage.

##### Character Class Interfaces

- **ISpellSword**: Interface extending system interfaces specific to spell sword characters.
- **IWarrior**: Interface extending system interfaces specific to warrior characters.
- **IWizard**: Interface extending system interfaces specific to wizard characters.

##### Character Classes

- **SpellSword.java**: Class implementing the `ISpellSword` interface.
- **Warrior.java**: Class implementing the `IWarrior` interface.
- **Wizard.java**: Class implementing the `IWizard` interface.

##### Conclusion

By adhering to the Interface Segregation Principle, this project promotes code maintainability, 
extensibility, and readability in the RPG system. It ensures that each class implements only the 
interfaces relevant to its role, resulting in a more modular and flexible codebase.


## Open/Closed Principle (OCP) in RPG System

### Overview

This part of the project demonstrates the application of the Open/Closed Principle (OCP) in an RPG system. 
The OCP states that "Software entities (classes, modules, functions, etc.) should be open for extension, 
but closed for modification." It promotes the idea that classes should be easily extendable without 
modifying their source code.

#### Violating OCP

##### Character Class

- **Character**: Class setting which class the character will become based on character type passed.

##### Violations

- **Character** class is creating the object based on a condition passed at time of creation. This
  violates the OCP rule "Software entities (classes, modules, functions, etc.) should be open for
  extension, but closed for modification." as the **Character** class will be edited if new classes
  are to be added.

#### Solving OCP

##### Character Interfaces

- **ICharacter**: Interface defining the basic methods neccessary for Characters.

##### Character Classes

- **SpellSword.java**: Class implementing the `ICharacter` interface for defining Spell Sword Characters.
- **Warrior.java**: Class implementing the `ICharacter` interface for defining Warrior Characters.
- **Wizard.java**: Class implementing the `ICharacter` interface for defining Wizard Characters.

##### Conclusion

By adhering to the Open/Closed Principle, this project promotes code maintainability and extensibility. 
It allows the system to support new characters by simply creating new classes that implement the 
`ICharacter` interface, without modifying existing code. This approach makes the system more robust 
and adaptable to future requirements.

## Single Responsibility Principle (SRP) in RPG System

### Overview

This part of the project demonstrates the application of the Single Responsibility Principle (SRP) in an RPG system. 
The SRP emphasizes that a class should have only one responsibility or reason to change. While it does not 
strictly dictate that classes should perform only one action, it promotes the idea that classes should be 
focused and cohesive, handling a single aspect of functionality. By adhering to SRP, classes become more 
maintainable, flexible, and easier to understand, leading to a more robust and adaptable system architecture.

#### Violating SRP

##### Character Class

- **Character**: Class used to handle character actions and manage its inventory.

##### Violations

- **Character** class violates the SRP principle by handling both character actions and inventory
  management. SRP suggests that classes should have only one reason to change. Combining character
  actions and inventory management in a single class makes it more likely that the class will need
  modification for different reasons, such as changes in character behavior or inventory management
  requirements.

#### Solving SRP

##### Item Record

- **Item**: Record defining the basic properties of an Item object.

##### Classes

- **Character.java**: Class for defining Characters actions.
- **Inventory.java**: Class managing Character inventories as character-owned Item object lists.

##### Conclusion

By adhering to the Single Responsibility Principle (SRP), this project ensures that each class is focused 
on a specific aspect of functionality, reducing coupling and increasing cohesion. This approach enhances 
code maintainability and extensibility by making it easier to understand, modify, and extend individual 
classes without affecting unrelated parts of the system. Ultimately, the application of SRP leads to a 
more robust and adaptable system architecture, better suited to meet evolving requirements and facilitate 
future development.
