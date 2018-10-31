
public class mainStackFloat {

	public static void main(String[] args) {
		stackFloat sf = new stackFloat();
		sf.cetak();
		
		sf.push(6.24f);
		sf.cetak();
		
		sf.push(9.5f);
		sf.cetak();
		
		sf.push(8.9f);
		sf.cetak();
		
		Float out = sf.pop();
		System.out.println(out);
		sf.cetak();
		
		Float out1 = sf.pop();
		System.out.println(out1);
		sf.cetak();
		
		Float out2 = sf.pop();
		System.out.println(out2);
		sf.cetak();
		
	}

}
