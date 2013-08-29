JavaKatas
=========

Cix is learning Java, and Test Driven Development.  Wish me luck

Kata1 - Bubble Sorter
=====================
## Strategy versus Template / Bubble Sort ##

Create a bubble sorter that is capable of sorting the following: 

- Integers.
- Floating point decimals.
- Strings that are numbers.

In the first go-around, don't worry about duplication. Just make a bubble sorter that sorts each of the types.

In the second go-around, use the Template Method. http://en.wikipedia.org/wiki/Template_method_pattern

Finally, use the Strategy Pattern to implement a comparison and swap operation with a strategy interface. http://en.wikipedia.org/wiki/Strategy_pattern

The goal here is to understand the differences and tradeoffs between Inheritance (template) and Composition (strategy).

## Builder Pattern

Create a builder that will create various types of bikes.

Bikes can come in three varieties:
- FixedGearBicycle: base speed of 2
- MountainBicycle: base speed of 1
- RacingBicycle: base speed of 3

You can add parts to these bicycles that will modify the bicycle's speed statistic.

Each of those varieties can have three different types of tires:
- WindBreakTire: speed + 3
- SkinnyTire: speed + 2
- FatTire: speed + 1

Each of the bike varieties can also have three different types of handlebars:
- RolloverHandlebar: speed + 1
- BullhornHandlebar: speed + 1
- StraightHandlebar: speed - 1

Create an interface that allows for simple building of all these bike varieties. The goal here is to implement a way to create customized objects without knowing too much about the internal details of these objects.
*Cix Note*:Bubble sorter is a simple application that takes a list of numbers, and steps through it one element at a time, compairing that element to the next element.  If it is greater than the next element it switches places with the element, if not it does nothing.  Then it moves on to the next element and does the same.  This program will go through this process over and over until such a time where it doesn't have to switch any elements in the array.  Thus it is sorted.
