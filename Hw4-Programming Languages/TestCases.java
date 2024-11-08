import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCases {

    private Library library;
    private Book fictionBook;
    private Book nonFictionBook;
    private Member member;
    private Staff staff;

    @BeforeEach
    void setUp() {
        library = new Library();
        fictionBook = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        nonFictionBook = new NonFiction("A Brief History of Time", "Stephen Hawking", "0987654321");
        member = new Member("Alice", "M001");
        staff = new Staff("Bob", "S001");
    }

    // Tests for Book class (Fiction and NonFiction)
    @Test
    void testFictionBook() {
        assertEquals("Fiction: The Great Gatsby by F. Scott Fitzgerald", fictionBook.describe());
        assertFalse(fictionBook.is_checked_out);
        fictionBook.check_out();
        assertTrue(fictionBook.is_checked_out);
        fictionBook.return_book();
        assertFalse(fictionBook.is_checked_out);
    }

    @Test
    void testNonFictionBook() {
        assertEquals("NonFiction: A Brief History of Time by Stephen Hawking", nonFictionBook.describe());
        assertFalse(nonFictionBook.is_checked_out);
        nonFictionBook.check_out();
        assertTrue(nonFictionBook.is_checked_out);
        nonFictionBook.return_book();
        assertFalse(nonFictionBook.is_checked_out);
    }

    // Tests for Person class (Member and Staff)
    @Test
    void testMember() {
        assertEquals("Member: Alice", member.describe());
    }

    void testStaff() {
        assertEquals("Staff: Bob", staff.describe());
    }

    void setUp() {
        library = new Library();
        fiction = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        nonFiction = new NonFiction("A Brief History of Time", "Stephen Hawking", "0987654321");
        member = new Member("Alice", "M001");
        staff = new Staff("Bob", "S001");
    }
    @Test
    void testAddBook() {
        library.addBook(fiction);
        library.addBook(nonFiction);
        assertEquals(2, library.books.size());
    }

    @Test
    void testAddMember() {
        library.register_member(member);
        assertEquals(1, library.members.size());
    }
}

