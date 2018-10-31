
public class mainStackString {
	public static void main(String[]args) {
		stackString ss = new stackString();
		ss.cetak();
		
		ss.push("MUKHDAR");
		ss.cetak();
		
		ss.push("HASMAN");
		ss.cetak();
		
		ss.push("MUMU");
		ss.cetak();
		
		String out1 = ss.pop();
		System.out.println(out1);
		ss.cetak();
		
		String out2 = ss.pop();
		System.out.println(out2);
		ss.cetak();
		
		String out3 = ss.pop();
		System.out.println(out3);
		ss.cetak();

		String out6 = ss.pop();
		System.out.println(out6);
		ss.cetak();
		
	}

}
