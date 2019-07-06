package day49_inheritance02;

public class BarnesAndNobles {
	public static void main (String[] args) {
		
		//parent class "Book" is encapsulated (private) so they must be written using the setter
		EBook ebook = new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		//parent class "Book" is encapsulated (private) so they must be read using the getter
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getPages());
		System.out.println(ebook.getPrice());
		System.out.println(ebook.getSize());
		System.out.println(ebook.getType());
		
		//getter and setters are used in this method since the variable are private
		ebook.readEBook(10);
		
		
		
		AudioBook abook = new AudioBook();
		abook.setTitle("OCA Preperation");
		abook.setAuthor("Jeanne");
		abook.setNarrator("Marufjon");
		
		abook.listen();
		
		
		
		PaperBack pb = new PaperBack();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		
		System.out.println(pb.toString());
			
		
	}

}
