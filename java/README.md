Modern Java In Action
===============

Attention:  I have no rights to this source code, it is copied here for convenience.
The current source code will deploy and run on Java 11 and 17.  Java 8 currently has a few bugs, so the caveat emptor.

This repository contains all the source code for the examples and quizzes in the book Java 8 in Action: Lambdas, Streams and functional-style programming.

You can purchase the book here: [http://manning.com/urma/](http://manning.com/urma/) or on Amazon

The source code for all examples can be found in the directory [src/main/java/lambdasinaction](https://github.com/java8/Java8InAction/tree/master/src/main/java/lambdasinaction)

* Chapter 1: Java 8: why should you care?
* Chapter 2: Passing code with behavior parameterization
* Chapter 3: Lambda expressions
* Chapter 4: Working with Streams
* Chapter 5: Processing data with streams
* Chapter 6: Collecting data with streams
* Chapter 7: Parallel data processing and performance
* Chapter 8: Refactoring, testing, debugging
* Chapter 9: Default methods
* Chapter 10: Using Optional as a better alternative to null
* Chapter 11: CompletableFuture: composable asynchronous programming
* Chapter 12: New Date and Time API
* Chapter 13: Thinking functionally
* Chapter 14: Functional programming techniques
* Chapter 15: Blending OOP and FP: comparing Java 8 and Scala
* Chapter 16: Conclusions and "where next" for Java
* Appendix A: Miscellaneous language updates
* Appendix B: Miscellaneous library updates
* Appendix C: Performing multiple operations in parallel on a Stream
* Appendix D: Lambdas and JVM bytecode
We will update the repository as we update the book. Stay tuned!

### Compile/Run the examples
Using maven:

$ mvn compile

$ cd target/classes

$ java lambdasinaction/chap1/FilteringApples

Alternatively you can compile the files manually inside the directory src/main/java

You can also import the project in your favorite IDE:

* In IntelliJ use "File->Open" menu and navigate to the folder where the project resides. 
  Set the Sources root to the src/main/java folder.  Note: this is not standard, but intelliJ will be happier 
  and not get confused with the Scala project.

* In Eclipse use "File->Import->Existing Maven Projects" (also modify "Redundant super interfaces" to report as Warnings instead of Errors

* In Netbeans use "File->Open Project" menu