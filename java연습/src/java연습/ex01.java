package java연습;

import java.util.*;

public class ex01 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(Integer.valueOf(5));
		list1.add(Integer.valueOf(4));
		list1.add(Integer.valueOf(2));
		list1.add(Integer.valueOf(0));
		list1.add(Integer.valueOf(1));
		list1.add(Integer.valueOf(3));

		ArrayList list2 = new ArrayList(list1.subList(1, 4));//인덱스 번호부터 번호까지의 객체반환
		print(list1, list2);

		Collections.sort(list1);//순서재배열(크기별)
		Collections.sort(list2);
		print(list1, list2);

		System.out.println(
				"list1.containsAll(list2):" + list1.containsAll(list2));
		//포함유무
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A");
		print(list1, list2);

		list2.set(3, "AA");//인덱스 위치의 값변경
		print(list1, list2);

		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

		print(list1, list2);

		// list2에서 list1에 포함된 객체들을 삭제한다.
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i)))//get i번째 인덱스 값 호출
				list2.remove(i);
		}
		print(list1, list2);
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}
}
