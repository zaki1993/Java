
public class Demo {

	public static void main(String[] args) throws Exception {
		Page asd = new Page("gosho", "z2aki e pich 1");
		System.out.println(asd.searchWord("pich"));
		System.out.println(asd.containsDigits());
		ElectronicSecuredNotepad test = new ElectronicSecuredNotepad(15, "Hash%edPasswd123");
		test.addPage(new Page("zaki","asd asd asd asd "));
		test.addPage(new Page("gosho","arehshshsh"));
		test.addPage(new Page("zaasdasdki","asdhssdsdhdshsdsdhsd"));
		test.addPage(new Page("mitko","asd aadrwrg wefe eag asgsd asd asd "));
		test.addPage(new Page("pesho","asd asdgsdg sfhg sdg sasds g asd "));
		test.addPage(new Page("dragan","asd asd d241 12 312g asd asd "));
		test.addPage(new Page("petkan","asd asd12 12321)"));
		test.printAllPagesWithDigits();
		test.printPages();
		test.deleteText(3);
		test.addText("gggggg", 3);
		test.deleteText(6);
		test.addText("-------------", 2);
		test.rewriteText("aaaaaaaaaaaaaaaaaaaaa", 4);
		test.printAllPagesWithDigits();
		test.printPages();
	}

}
