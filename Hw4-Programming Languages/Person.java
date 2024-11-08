/**
 * Abstract class of a Person in the library system.
 * Contains the person name and id.
 */

public abstract class Person {
    protected String name;
    protected String id;

    /**
     * Constructs a new Person with the name and ID.
     * @param name The name of the person.
     * @param id The ID of the person.
     */

    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }

     /**
     * Abstract method that describes the person.
     * @return A string describing the person.
     */
    public abstract String describe();
}

/**
 * A class extending the Person class for members.
 */
class Member extends Person{
    public Member(String name, String id){
        super(name, id);
    }

    public String describe(){
        return "Member: " + name;
    }
}

/**
 * A class extending the Person class for staff.
 */

class Staff extends Person{
    public Staff(String name, String id){
        super(name, id);
    }

    public String describe(){
        return "Staff: " + name;
    }

    /**
     * Register members to the library
     */

    public void register_member(Library library, Member member){
        library.register_member(member);
    }

    /**
     * Register books to the library
     */
    public void register_book(Library library, Book book){
        library.register_book(book);
    }
}

