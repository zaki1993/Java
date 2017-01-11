
public class Main {
	public static void main(String[] args){
		Computer toshiba = new Computer();
		toshiba.year = 2_017;
		toshiba.price = 1_800f;
		toshiba.hardDiskMemory = 2_048;
		toshiba.freeMemory = 1_024;
		toshiba.operationSystem = "Windows 8.1 Pro";
		toshiba.isNotebook = true;
		
		Computer acer = new Computer();
		toshiba.year = 2_017;
		toshiba.price = 1_150f;
		toshiba.hardDiskMemory = 1_024;
		toshiba.freeMemory = 1_024;
		toshiba.operationSystem = "Windows 10";
		toshiba.isNotebook = false;
		
		toshiba.useMemory(100);
		acer.changeOperationSystem("Linux - Debian");
		printComputer(toshiba);
		printComputer(acer);
	}
	public static void printComputer(Computer pc){
		System.out.println("Year: " + pc.year + ", Price: " + pc.price +
							", HDM: " + pc.hardDiskMemory + 
							", free memory: " + pc.freeMemory + 
							", OS: " + pc.operationSystem +
							", laptop?: " + pc.isNotebook);
	}
	
}
