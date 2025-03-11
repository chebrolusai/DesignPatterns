<h1 align="center">Singleton Design Pattern</h1>

## Problem
There are at times you have to restrict the creation or usage of a particular class. Meaning, we do not want it to be exploited by being created more than once. At the same time, you want complete control over that object creation. In runtime you need to ensure only one instance at any point exists. The idea is it needs to be kind of stateless, meaning it should behave the same for any invoker, which is why we would like only one instance.

## Issues
1. To restrict the above usecase, you need additional logic in your application, which can get complex.
2. You might want to expose only static methods that you need in some class and use only them ( but it is still not controlling object creation )
3. Using some kind of proxy, or an intermediate to achive this is also not feasible in the long run.


## Singleton pattern
The Singleton design pattern primarily solves the issue of ensuring that only one instance of a specific class exists throughout an application, providing a single, global point of access to that instance. There are a decent number of good examples for this like Loggers for example.
This about it, why do you want multiple instances of a Logger? it does the same thing. At the same time, once you decide a single instance is enough, you enforce it.

## Implementation
1. Constructor must be private, or else bro come on.
2. Expose a method to return the object of the singleton class - this object is returned to every caller, everyone works with the same object. Please make this method static.
3. You will need the object of the class as a static data member of the class itself
4. There is lazy and eager, with their own usecases. Eager will not have the check in the code, you create the object at the beginning and return that each time someone asks. My code shows Lazy.

## Note/funny question
Why does singleton even exist if we could simply create a class and have only static methods in it, keeping it completely stateless? Apprently, saw this on stackoverflow - static methods are much harder to test.
