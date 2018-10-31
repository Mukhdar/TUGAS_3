import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("MUKHDAR");
		arls.add("MUSTAFA");
		arls.add("ACO");
		System.out.println(arls);
		//menghapus
		arls.remove("MUKHDAR");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("INDAH");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("MUKHDAR"))
			System.out.println(" ada MUKHDAR");
		else{
			System.out.println("tak ada MUKHDAR");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
