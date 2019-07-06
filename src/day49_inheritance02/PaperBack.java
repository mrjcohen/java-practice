package day49_inheritance02;

public class PaperBack extends Book{
	
	private int pages;

	public String toString() {
		return "Title: "+getTitle() +" | Author: "+ getAuthor() +" | Price: $"+ getPrice() +" | Type: "+ getType() +" | Number of Pages: "+ pages;
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
