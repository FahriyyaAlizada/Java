package dec21;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i = 25; i < 29; i++) {
			list.add(i);
		}
		for (Integer integer : list) {
			sum += integer;
		}
		System.out.println(sum);
		
		System.out.println("-----------------------------------------------");
		
		Teacher t1 = new Teacher("Katie", "Informatics");
		Teacher t2 = new Teacher("Simon", "English");
		Teacher t3 = new Teacher("Carol", "Math");
		Teacher t4 = new Teacher("Bucky", "Physics");
		
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.add(t4);
		
		for (Teacher teacher : teacherList) {
			System.out.println(teacher);
		}
	}

}
