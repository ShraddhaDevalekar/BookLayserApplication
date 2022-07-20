
public class BookService {
	                             //100      corejava      250
	public int addBookService(int bookID,String title,double price) throws ClassNotFoundException
	
		{ System.out.println("Service Layer");
		System.out.println(bookID+title+price);
			String grade="";
			
			 if(price<=300)
			 {
				 grade="C";
					 }
			 else if(price<=600)
			 {
				 grade="B";
			 }
			 else {
				 grade="A";
				 
				
			    }
			 
			 BookBean bookBean=new BookBean();
			        bookBean.setBookId(bookID);
			        bookBean.setTitle(title);
			        bookBean.setPrice(price);
			        bookBean.setGrade(grade);
			 
			        //Send data to DAO Layer 
			        BookDAO bookDAO =new BookDAO();
			        int k=bookDAO.addBook(bookBean);
			return k;
			
			
		}
	 
	
	

}
