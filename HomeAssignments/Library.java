package week2.HomeAssignments;


	public class Library {
		public String addBook(String BookTitle) {
			System.out.println("Book added successfully");
			return BookTitle;
		}
		public void issueBook() {
			System.out.println("Book issued successfully");
		}
		public static void main(String[] args) {
			Library lb=new Library();
			lb.addBook("Money");
			lb.issueBook();
		}

		}

