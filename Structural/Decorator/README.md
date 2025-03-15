<h1 align="center">Decorator Pattern</h1>

## Problem
You have a core functionality and it could be some base object or process, but you want to add additional features without modifying the existing code. The key requirement is that this should be dpne at runtime, meaning you should be able to add layers with extra behaviors without altering the original implementation.

## Issues
- Stupid approach is to modify the base class once you decided the changes. But what if it is some third party class ?
- Another approach is to derive sub classes with the addition. Makes sense, but not managable and a disaster if you think about it. If you have a base blackCoffee, you might create classes like blackCoffeeWithSugar, blackCoffeeWithMilk, blackCoffeeWithMilkAndSugar. There are way too many combinations and imagine if it is not just black coffee - you have latte, cappuccino and so many other options
- Even if you find a way to handle this with the traditional inheritance, you have to decide all this during the compile time. Handling this dynamically during runtime is extremely hard

## Decorator Design Pattern
This pattern allows you to dynamically add functionality at run time. All this tries to do is to wrap up the original object, add something to it and return. It is simple, yet effective. The best way to get its usecase is toppings on a pizza, or customizing your coffee.

## Implementation
- You need to define a base interface for the main type of classes ( base classes )
- You then create an abstract class which is a wrapper over these base classes, usually called the decorator. It must have the object of the base class as a data member.
- You then extend from this abstract class and create your toppings/add ons or anything required. This is like layers, and you are not restricted anymore by single inheritance from some base class
- The point is, you would want to treat all possible combinations as a single type. This is where polymorphism stands out and helps achieve our use case.

## Note
Keep in mind that each decorator will have one additional thing to do on top of something.Also, Too many decorators can introduce overhead, as each call passes through multiple wrapper objects. If you need runtime flexibility, use decorator pattern. But if you already know the features at compile-time and are limited, subclassing might be fine.
