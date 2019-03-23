package streamExp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student ob) {
		return name.compareTo(ob.getName());
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		final Student std = (Student) obj;
		if (this == std) {
			return true;
		} else {
			return (this.name.equals(std.name) && (this.age == std.age));
		}
	}

	@Override
	public int hashCode() {
		int hashno = 7;
		hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
		return hashno;
	}
}

public class ExpStream {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Mahesh", 12));
		list.add(new Student(2, "Suresh", 15));
		list.add(new Student(3, "Nilesh", 10));

		System.out.println("---Natural Sorting by Name---");
		List<Student> slist = list.stream().sorted().collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));

		System.out.println("---Natural Sorting by Name in reverse order---");
		slist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));

		System.out.println("---Sorting using Comparator by Age---");
		slist = list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));

		System.out.println("---Sorting using Comparator by Age with reverse order---");
		slist = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));

		/*
		 * Map<Integer, String> map = new HashMap<>(); map.put(15, "Mahesh");
		 * map.put(10, "Suresh"); map.put(30, "Nilesh");
		 * 
		 * System.out.println("---Sort by Map Value---");
		 * map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::
		 * getValue)) .forEach(e -> System.out.println("Key: "+ e.getKey()
		 * +", Value: "+ e.getValue()));
		 * 
		 * System.out.println("---Sort by Map Key---");
		 * map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey
		 * )) .forEach(e -> System.out.println("Key: "+ e.getKey() +", Value: "+
		 * e.getValue()));
		 */
		Map<Integer, Student> map = new HashMap<>();
		map.put(1, new Student(1, "Mahesh", 12));
		map.put(2, new Student(2, "Suresh", 15));
		map.put(3, new Student(3, "Nilesh", 10));
		// Map Sorting by Value i.e student's natural ordering i.e by name
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(e -> {
			Integer key = (Integer) e.getKey();
			Student std = (Student) e.getValue();
			System.out.println(
					"Key: " + key + ", value: (" + std.getId() + ", " + std.getName() + ", " + std.getAge() + ")");
		});
	}

	public static void streamOrderEx1() {
		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
			System.out.println("filter: " + s);
			return true;
		}).forEach(s -> System.out.println("forEach: " + s));
	}

	public static void streamOrderEx2() {
		Stream.of("d2", "a2", "b1", "b3", "c").map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		}).anyMatch(s -> {
			System.out.println("anyMatch: " + s);
			return s.startsWith("A");
		});
	}
	
	public static void streamOrderEx3(){
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
//		Stream.of("d2", "a2", "b1", "b3", "c")
//	    .filter(s -> {
//	        System.out.println("filter: " + s);
//	        return s.startsWith("a");
//	    })
//	    .map(s -> {
//	        System.out.println("map: " + s);
//	        return s.toUpperCase();
//	    })
//	    .forEach(s -> System.out.println("forEach: " + s));
	
//		Stream.of("d2", "a2", "b1", "b3", "c")
//	    .sorted((s1, s2) -> {
//	        System.out.printf("sort: %s; %s\n", s1, s2);
//	        return s1.compareTo(s2);
//	    })
//	    .filter(s -> {
//	        System.out.println("filter: " + s);
//	        return s.startsWith("a");
//	    })
//	    .map(s -> {
//	        System.out.println("map: " + s);
//	        return s.toUpperCase();
//	    })
//	    .forEach(s -> System.out.println("forEach: " + s));
	}
	
	
	
	

}
