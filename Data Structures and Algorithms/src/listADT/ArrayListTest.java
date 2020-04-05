package listADT;
//import scoreBoard.ScoreBoardEntry;

public class ArrayListTest 
{
	public static void main(String[] args) 
	{
		test_integer();
		test_string();
		//test_scoreboardentry();
	}
	
//	TO BE IMPLEMENTED
//	private static void test_scoreboardentry() 
//	{
//		ArrayList<ScoreBoardEntry> board_list = new ArrayList<ScoreBoardEntry>(ScoreBoardEntry.class, 10);
//		
//		System.out.println("\nAdd element at position already in use:");
//		string_list.add_element(0, "Luca");
//		string_list.add_element(1, "Jannik");		
//		System.out.println(string_list);
//		
//		System.out.println("\nAdd element at position already in use:");
//		string_list.add_element(1, "Laura");
//		System.out.println(string_list);
//		
//		System.out.println("\nAdd element at new position (last index + 1):");
//		string_list.add_element(3, "Corinna");	
//		System.out.println(string_list);
//		
//		System.out.println("\nRemove element at position 1:");
//		string_list.remove_element(1);
//		System.out.println(string_list);
//		
//		System.out.println("\nSet elements at all positions:");
//		string_list.set_element(0, "Ben");
//		string_list.set_element(1, "Luca");
//		string_list.set_element(2, "Jane");
//		System.out.println(string_list);
//		
//		System.out.println("\nGet element at position 0:");
//		System.out.println(string_list.get_element(0));
//		
//		System.out.println("\nGet ArrayList size:");
//		System.out.println(string_list.size());
//		
//		System.out.println("\nFinal ArrayList:");
//		System.out.println(string_list);
//		
//	}

	public static void test_string() 
	{
		ArrayList<String> string_list = new ArrayList(String.class, 1);
		
		System.out.println("\nAdd first two elements:");
		string_list.add_element(0, "Luca");
		string_list.add_element(1, "Jannik");		
		System.out.println(string_list);
		
		System.out.println("\nAdd element at position already in use:");
		string_list.add_element(1, "Laura");
		System.out.println(string_list);
		
		System.out.println("\nAdd element at new position (last index + 1):");
		string_list.add_element(3, "Corinna");	
		System.out.println(string_list);
		
		System.out.println("\nRemove element at position 1:");
		string_list.remove_element(1);
		System.out.println(string_list);
		
		System.out.println("\nSet elements at all positions:");
		string_list.set_element(0, "Ben");
		string_list.set_element(1, "Luca");
		string_list.set_element(2, "Jane");
		System.out.println(string_list);
		
		System.out.println("\nGet element at position 0:");
		System.out.println(string_list.get_element(0));
		
		System.out.println("\nGet ArrayList size:");
		System.out.println(string_list.size());
		
		System.out.println("\nFinal ArrayList:");
		System.out.println(string_list);
	}
	
	public static void test_integer() 
	{
		ArrayList<Integer> integer_list = new ArrayList(Integer.class, 1);
		
		System.out.println("\nAdd first two elements:");
		integer_list.add_element(0, 1);
		integer_list.add_element(1, 2);		
		System.out.println(integer_list);
		
		System.out.println("\nAdd element at position already in use:");
		integer_list.add_element(1, 3);
		System.out.println(integer_list);
		
		System.out.println("\nAdd element at new position (last index + 1):");
		integer_list.add_element(3, 4);	
		System.out.println(integer_list);
		
		System.out.println("\nRemove element at position 1:");
		integer_list.remove_element(1);
		System.out.println(integer_list);
		
		System.out.println("\nSet elements at all positions:");
		integer_list.set_element(0, 3);
		integer_list.set_element(1, 2);
		integer_list.set_element(2, 1);
		System.out.println(integer_list);
		
		System.out.println("\nGet element at position 0:");
		System.out.println(integer_list.get_element(0));
		
		System.out.println("\nGet ArrayList size:");
		System.out.println(integer_list.size());
		
		System.out.println("\nFinal ArrayList:");
		System.out.println(integer_list);
	}
}
