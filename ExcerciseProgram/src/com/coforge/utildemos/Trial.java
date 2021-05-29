package com.coforge.utildemos;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Trial {
	public static void main(String[] args) {
		Consumer<String> c = (t) -> {// Consumer is predefined functional interface having one method
			System.out.println(t.toUpperCase());
		};
		c.accept("hello");

		Consumer<Integer> c1 = (num) -> {// Consumer is predefined functional interface having one method
			System.out.println(num + 2);
		};
		c1.accept(20);

		Supplier<Integer> sup = () -> {// supplier id predefined functional interface here
			return 10;

		};
		System.out.println(sup.get());
		Supplier<String> sup1 = () -> {
			return "supplier";
		};
		System.out.println(sup1.get());

		BiConsumer<Integer, Integer> calc = (x, y) -> System.out.println("sum " + (x + y));
		calc.accept(10, 30);
		
		
		Predicate<String> pr=(name)->name.length()>6 ;
		System.out.println(pr.test("heloo"));
		
		
		BiPredicate<Integer,String> br=(num,name)->{
			if(name.length()>6 && num>10)
				return true;
			return false;
		};
		System.out.println(br.test(18,"Heloo"));
	}

}
