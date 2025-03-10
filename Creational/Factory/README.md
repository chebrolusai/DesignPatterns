<h1 align="center">Factory Design Pattern</h1>

## Problem
The problem usually arises when you have similar type of classes and often objects from the class are have to be created usually based on some type of logic. Sometimes, you really do not know what object you might create down the line as it is decided at run time or by some external factor.

## Issues
The straightforward approach is to add the creational logic when ever we think is required. There are some known issues with this
1. You duplicate the creation logic when dealing with a lot of classes. Different logics would require this duplication at multiple places.
2. Those objects are all related, we really are not making use of that. Meaning, you only have a handfull of decisions to make at that point.
3. God forbid, you add a new class. Good luck adding statements everywhere possible.
 
## Factory pattern
Teh factory pattern is known but handling such creation logic. You keep all the creation of similarly related classes ( tied by some interface ) at this one place, and call this for your object creation. The only reason this class needs to change is when you add or remove a class, which is fine.

## Implementation
1. Understand which types of objects can be grouped together, and tie them to an interface
2. Factory can be a Singleton class or expose a static method, you really only need one object of this at any point.
3. Expose a method to create the object for you, logic can be added on which object to create, but the return type would be that of the common Interface of those classes.

## Note
Altough this is good, there are nasty sides of this. Always adding and removing classes needs some maintenance. If the object creation is complex or if the objects are in turn not very similar, this design pattern can be a bit overwhelming to handle.
There are definitely better ways to handle such problems, but yeah just sharing my thoughts.
