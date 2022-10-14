import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Quiz1 {

	public static void main(String[] args) {
		Function<String, Integer> stringToInteger = Integer::parseInt;

		List<List<Object>> list = new ArrayList<>();

		List<Object> newList = list.stream()

				// add missing line here

				.collect(Collectors.toList());
	}

}
