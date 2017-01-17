
public class Main {
	public static void main(String[] args){
		Computer toshiba = new Computer(2_017, 1_800f, 2_048, 1_024, "Windows 8.1 Pro");
		
		Computer acer = new Computer(2_017, 1_150f, 1_024, 1_024);
		
		toshiba.useMemory(100);
		acer.changeOperationSystem("Linux - Debian");
		int biggerPrice = toshiba.comparePrice(acer);
		if(biggerPrice == 0){
			System.out.println("Equal prices!");
		}
		else if(biggerPrice == 1){
			System.out.println("Toshiba has bigger price!");
		}
		else{
			System.out.println("Acer has bigger price!");
		}
	}
}
