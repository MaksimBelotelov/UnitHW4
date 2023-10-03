package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;


class BookServiceTest {
    BookRepository bookRepositoryMock;
    BookService bookService;

    @BeforeEach
    void init() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    void testFindById() {
        when(bookRepositoryMock.findById("2")).thenReturn(new Book("2", "Book2", "Author2"));

        Book myBook = bookService.findBookById("2");

        verify(bookRepositoryMock).findById("2");
        assertEquals("2", myBook.getId());
        assertEquals("Book2", myBook.getTitle());
    }

    @Test
    void testFindAll() {
        List<Book> expected = Arrays.asList(new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2"), new Book("3", "Book3", "Author3"));

        when(bookRepositoryMock.findAll()).thenReturn(expected);

        List<Book> books = bookService.findAllBooks();

        verify(bookRepositoryMock).findAll();
        assertEquals(expected, books);
    }
}