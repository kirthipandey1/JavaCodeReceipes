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
   
Chapter 2 - Function Package

   -> Consumer interface (accept method)
   
      1. IntConsumer (void accept(int x))
      2. DoubleConsumer (void accept(double x))
      3. LongConsumer (void accept(long x))
      4. BiConsumer (void accept(T t,U u))
      
   -> Supplier interface (get method)
   
		1. IntSupplier (int getAsInt())
		2. DoubleSupplier (double getAsDouble())
		3. LongSupplier (long getAsLong())
		4. BooleanSupplier (boolean getAsBoolean())
   
   -> Predicate interface (test method)
   
   -> Function interface (apply method)
		
		1. IntFunction (R apply(int Value))
		2. DoubleFunction (R apply (double value))
		3. LongFunction (R apply(long value))
		4. ToIntFunction (int applyAsInt(T value))
		5. ToDoubleFunction (double applyAsDouble(T value))
		6. ToLongFunction (long applyAsLong(T value))
		7. DoubleToIntFunction (int applyAsInt(double value))
		8. DoubleToLongFunction (long applyAsLong(double value))
		9. intToDoubleFunction (double applyAsDouble(int value))
		10. intToLongFunction (long applyAsLong(int value))
		11. LongToDoubleFunction (double applyAsDouble(long value))
		12. LongToIntFunction (int applyAsInt(long value))
		13. BiFunction (R apply(T t,U u)
		14. ToIntBiFunction (int applyAsInt(T t,U u))
		15. ToDoubleBiFunction (double applyAsDouble(T t, U u))
		16. ToLongBiFunction (long applyAsLong(T t, U u))
 
 Chapter 3 - Streams
 
 	-> Create Streams 
 		
 		-> Using Stream.of(T... values), Stream.of(T t)
 		
 		-> Arrays.stream(T[] array)
 		
 		-> Stream.iterate(T seed, UnaryOperator<T> f)
 		
 		-> Stream.generate(Supplier<T> s)
 		
 		-> Collections.stream()
 		
 	-> Range and RangeClosed
 		
 		-> IntStream.range(), LongStream.range() (Doesn't include last value)
 		
 		-> IntStream.rangeClosed(), LongStream.rangeClosed() (includes last value)
 		
 Note :
 			If we try to print int [] as stream it will only show address. But use below way to print:
 			
 			     ->  IntStream.of(array).forEach(a-> System.out.print(a+" "));
 			     
 			     ->  Arrays.stream(array).forEach(a->System.out.print(a+" "));
 			     
 			     
 Reduce methods:
 
 1. average()      optionalDouble
 
 2. count()        long
 
 3. max()          OptionalInt
 
 4. min()          OptionalInt
 
 5. sum()          int
 
 6. summaryStatistics   IntSummaryStatistics
 
 7. collect()           R
 
 8. reduce            int,optionalInt
 		