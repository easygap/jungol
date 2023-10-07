package java5.p51;

import java.util.NavigableSet;
import java.util.TreeSet;

public class HashTableExample {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		treeSet.add("c");
		treeSet.add("ca");

		System.out.println("[c-f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", false, "f", true); // True는 인자값까지 포함 false는 제외
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}