package streamExp;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExpCollect {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));
		List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());

		System.out.println(filtered); // [Peter, Pamela]

		Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));

		personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

		// the summarizing collectors return a special built-in summary statistics
		// object. So we can simply determine min, max and arithmetic average age of the
		// persons as well as the sum and count.
		Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.age));

		System.out.println(averageAge); // 19.0

		IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(p -> p.age));

		System.out.println(ageSummary);

		// join into a single string
		String phrase = persons.stream().filter(p -> p.age >= 18).map(p -> p.name)
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

		System.out.println(phrase);

		// stream elements to a map
		Map<Integer, String> map = persons.stream()
				.collect(Collectors.toMap(p -> p.age, p -> p.name, (name1, name2) -> name1 + ";" + name2));

		System.out.println(map);
	}
}
