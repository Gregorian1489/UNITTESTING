import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;
import seminars.fourth.book.InMemoryBookRepository;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    private Book book;

    @BeforeEach
    public void setup(){
        Book book = new Book("1", "Book_1", "Pushkin");
    }

    @Test
    void bookServiceTestFindId(){
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        when(bookRepositoryMock.findById("1")).thenReturn(book);
        BookService bookService = new BookService(bookRepositoryMock);
        assertThat(bookService.findBookById("1")).isEqualTo(book);
    }
    @Test
    void  bookServiceTestFindAll(){
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        when(bookRepositoryMock.findById("1")).thenReturn(book);
        BookService bookService = new BookService(bookRepositoryMock);
        assertThat(bookService.findAllBooks().contains(book));
    }
    @Test
    void  bookServiceTestEquals(){
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        when(bookRepositoryMock.findById(anyString())).thenReturn(book);
        BookService bookService = new BookService(bookRepositoryMock);
        assertEquals(bookService.findBookById("1"), book);
    }

}
