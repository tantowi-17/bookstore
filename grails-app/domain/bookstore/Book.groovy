package bookstore

class Book {
    String name
    String address
    String email

    static constraints = {
        email email: true
    }
}
