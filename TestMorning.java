import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class Person implements Comparable<Person>{
	int age;
	String name;
	Person(String name,int age){
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return name +" : "+age;
	}
	@Override
	public int compareTo(Person p) {
		return this.age -p.age;
	}
}
class PersonComparator implements Comparator<Person>{
	public int compare(Person p1,Person p2) {
		return p2.age-p1.age;
	}
}

public class TestMorning {

	public static void main(String[] args) {

		TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
		
		tree.add(new Person("윤",37));
		tree.add(new Person("박",53));
		tree.add(new Person("래",22));
		
		for(Person p : tree)
			System.out.println(p);
		
		
		
//--------------------------------------------
/*class Num{
	int num;
	public Num(int num) {
		this.num=num;
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	@Override
	public int hashCode() {
		return num%3;
	}
	@Override
	public boolean equals(Object ob) {
		if(this.num==((Num)ob).num)
			return true;
		else
		return false;
	}
}

public class TestMorning {

	public static void main(String[] args) {
		
		HashSet<Num> set = new HashSet<>();
		
		set.add(new Num(7755));
		set.add(new Num(7799));
		set.add(new Num(7755));
		
		System.out.println(set.size());*/
		
		
	//------------------------------------------------	
	
//		List<String> list = new LinkedList<>();
//		
//		list.add("toy");
//		list.add("box");
//		list.add("robot");
//		
//		
//		for(String e : list)
//			System.out.print(e.toString()+'\t');
//			System.out.println();
//			
//		for(Iterator<String> itr = list.iterator();itr.hasNext();)
//			System.out.print(itr.next()+'\t');
//			System.out.println();
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i)+'\t');
//			}System.out.println();
			
	//-----------------------------------------------------------------------
//		HashMap<Integer,String> map= new HashMap<>();
//		map.put(45, "brown");
//		map.put(37, "james");
//		map.put(23, "martine");
//		
//		Set<Integer> ks = map.keySet();
//		
//		for(Integer n : ks)
//			System.out.print(n.toString()+'\t');
//		System.out.println();
//		
//		
//		for(Iterator<Integer> itr = ks.iterator();itr.hasNext();)
//			System.out.print(map.get(itr.next())+'\t'); 
			//여기서 get운  public V get(Object key) {
	        //Node<K,V> e;
	       // return (e = getNode(hash(key), key)) == null ? null : e.value;
	    

//			System.out.println();
//		
//		
//		for(Integer n : ks)
//			System.out.print(map.get(n)+'\t');
	}
	

}
