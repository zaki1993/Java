
public class Demo {

	public static void main(String[] args) {
		Car fiat = new Car("Fiat", 1996, "White");
		Car ferari = new Car("Ferari", 2010, "Cyan");
		Person zaki = new Person("zaki", 20, 10);
		Person gosho = new Person("gosho", 30, 30);
		CarShop zavod = new CarShop(100);
		
		zavod.addCar(fiat);
		zavod.addCar(ferari);
		zavod.showAllCarsInTheShop();
		zavod.sellNextCar(zaki);
		zavod.sellNextCar(gosho);
		zavod.showAllCarsInTheShop();
		
		zaki.printOwnedCarsInfo();
		gosho.printOwnedCarsInfo();
	}

}
