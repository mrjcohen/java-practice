package day07_scanner_operator;

public class PreAndPostIncrement2 {
	public static void main(String[] args) {
		
		int messages = 10;
		messages++;
		++messages;
		System.out.println("messages: " + messages);				//12
		
		
		int readMessages = --messages;
		System.out.println("readMessages: " + readMessages);		//11
		System.out.println("messages: " + messages);				//11
		

		int unreadMessages = readMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);	//11
		System.out.println("readMessages: " + readMessages);		//10
		
		
		int total = unreadMessages++ - readMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);	//12
		System.out.println("readMessages: " + readMessages);		//9
		System.out.println("total: " + total);						//1
		
		
		
		
		int count = 20;
		int count2 = 10;
		
		int totalCount = ++count + --count2;						
		
		System.out.println("count: " + count);						//21
		System.out.println("count2: " + count2);					//9
		System.out.println("totalCount: " + totalCount);			//30
		
		
		//                      21 gets passed then its 22                  22 gets passed to ++count so its 23   ->  so myCount is 21+23 = 44
		int myCount     =                 count++                   +                    ++count;						    
		
		System.out.println("count: " + count);						//23
		System.out.println("myCount: " + myCount);					//44
		
		
		int number = 21;
		int myNumber = ++number + number++;   						//22 + 22 = 44
		System.out.println(myNumber);
		System.out.println(number);             					//23
	
	}
}

