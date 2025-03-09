<h1 align="center">Prototype Design Pattern</h1>

## Problem
At times, you do not want to get into the trouble of creating a new object, the change you want to make is maybe minor and you do not want to go through the object creation process. At the same time, you want other attributes to remain the same. You want to create multiple objects but the creation logic for it is quite expensive.

## Issues
Although when we clone we assume that the objects are exactly the same but we might run into some issues. When you manually duplicate them:
1. You might forget to copy some of the required things, especially if it is very large
2. More important point - You DO NOT have access to private members. If you do not have getters and setters for an attibute, you are locked. One of the possible things are "Assumed/Computed data" like the current date. You would not want to pass on the current date. That can be done automatically. But want if i want the dates in my new object to be exact ?
 
## Prototype pattern
This is exactly where you need the prototype design pattern. This kind of solves the two main issues mentioned. It is kind of straight forward as well.

## Implementation
1. The Class must implement Cloneable
2. This clone method must be implemented within the class itself
3. The copying logic must also exist here itself

So, if you know some object creation is expensive and you want to make minor changes, keeping most of the functionality as it is, this is probably the way to go.

