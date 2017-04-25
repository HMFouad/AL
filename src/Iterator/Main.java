package Iterator;

public class Main {

	public static void main(String[] args) {
		NameRespository namesRespository = new NameRespository();
		
		for (Iterator iter = namesRespository.getIterator(); iter.hasnext();){
			String name = (String)iter.next();
			System.out.println("Name: " + name);
		}

	}

}
