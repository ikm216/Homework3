import java.util.*;

/**
 * Library class to represnt a library system
 * Provides methods to add, list, and manage the system.
 */

public class Library {
    protected List<Book> books;
    protected List<Member> members;
    protected List<Staff> staffs;

     /**
     * Constructs a new Library using empty lists for books, members, and staff.
     */

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
        staffs = new ArrayList<>();
    }
    /**
     * Adds a book to the library.
     * @param book The book to add.
     */

    public void register_book(Book book){
        books.add(book);
    }
    /**
     * Adds a member to the library.
     * @param member The book to add.
     */

    public void register_member(Member member){
        members.add(member);
    }

     /**
     * Lists all books in the library.
     */
    public void List_books(){
        System.out.println("Books currently in the library");
        for (Book book : books){
            System.out.println(book.describe());
        }
    }
     /**
     * Lists all members in the library.
     */

    public void List_members(){
        System.out.println("Members");
        for (Member member : members){
            System.out.println(member.describe());
        }
    }

     /**
     * Lists all staff in the library.
     */

    public void List_staff(){
        System.out.println("Staff");
        for (Staff staff : staffs){
            System.out.println(staff.describe());
        }
    }
}
