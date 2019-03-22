package streamExp;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReusingStreams {
	public static void main(String[] args) {
		ep1();
	}

	public static void ep1() {
		// Java 8 streams cannot be reused. As soon as you call any terminal operation
		// the stream is closed
		Stream<String> stream = Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> s.startsWith("a"));

		stream.anyMatch(s -> true); // ok
		stream.noneMatch(s -> true); // exception
	}

	public static void exp2() {
		// alternative to exp1, we create a stream supplier to construct a new stream
		// with all intermediate operations already set up
		Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> s.startsWith("a"));

		streamSupplier.get().anyMatch(s -> true); // ok
		streamSupplier.get().noneMatch(s -> true); // ok
	}

}
