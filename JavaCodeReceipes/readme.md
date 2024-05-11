Java Code Recipes.

Chapter 1 - Basics

   -> Lambda Expressions
 
   -> Method References 
   
   1.object::instanceMethod   
   2.Class:staticMethod  
   3.Class::instanceMethod
 
 Note : Junit should always be added in classpath 
 
   -> Static Methods
   1. sorted(Comparator.naturalOrder()) 
   2. sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())
 
 