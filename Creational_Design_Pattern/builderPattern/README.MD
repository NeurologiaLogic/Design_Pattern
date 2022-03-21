Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

When to Use Builder Pattern

1. When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
2. When an increase in the number of constructor parameters leads to a large list of constructors
3. When client expects different representations for the object that's constructed

example of builder pattern linking:
calculator.add(12).substract(3).multiply(5).calculate();
result of calculator = 12 - 3 = 9 * 5 = 45;