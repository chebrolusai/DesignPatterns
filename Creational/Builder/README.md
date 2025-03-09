<h1 align="center">Builder Design Pattern</h1>

## Problem
If there is a class, where building its object is quite complex. It can get overwhelming on the client side, primarily due to its parameters and creation process

## Issues
- The Class has a lot of objects, which the clients need to be aware of - even if some were optional.
- You kind of need to keep track of which order the parameters needs to be passed. Creating multiple constructors within the class is not a feasible approach
- Even if some parameters are optional and you have no intention to set them, you have to pass them mostly, atleast NULL.
 
## Builder pattern
The builder pattern solve this, or atleast tries to make things better for such situations. It allows building an object step by step and has a method to return the actual final object.
It takes in the mandatory parameters, while you can modify the optional ones with the public methods. It can also set default values for optional ones.

## Implementation
- A good practice is to name the Builder class as "TargetClass"Builder
- The main class constructor is private ( what's the use if it was public lol ), accepting the Builder class object
- The builder class has a public constructor with the mandatory parameters
- The builder class has public methods to set optional parameters, all with the return type of the Builder class ( for step by step building )
- Finally, it has a Build() methos to create and return the actual main object

On a side note, keep in mind that the Builder class must be nested within the main class as a STATIC class with a public constructor. 
The idea is that <i>"If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together"</i>

Finally, the builder class calls the private constuctor of the main class and passes itself.
