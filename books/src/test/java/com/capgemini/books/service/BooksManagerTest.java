/**
 * 
 */
package com.capgemini.books.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.capgemini.books.exceptions.ArrayListIsNullException;
import com.capgemini.books.exceptions.BookAlreadyFoundException;
import com.capgemini.books.exceptions.BookIDCannotBeNegativeException;
import com.capgemini.books.exceptions.BookNameCannotBeNullException;
import com.capgemini.books.exceptions.BookNotFoundException;
import com.capgemini.books.exceptions.PriceIsNotValidException;
import com.capgemini.books.model.Books;

/**
 * @author The Wonder Land
 *
 */
class BooksManagerTest {
	
	private BooksManager bm;
	ArrayList<Books> bookList1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		bm = new BooksManager();
		bookList1 = new ArrayList<Books>();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		bm = null;
		bookList1 = null;
	}
	
	/**
	 * Testing addBooks method 
	 */
	@Test
	@DisplayName("Testing addBooks")
	void testAddBooks() {
		bm.addBooks(1234, "Eragon", 500);
		assertFalse(bm.bookList.isEmpty());
		assertEquals(1, bm.bookList.size());
	}
	
	/**
	 * Testing Multiple Inputs
	 */
	@Nested
	class RepeatedTests{
		@DisplayName("Test Multiple Inputs")
		@RepeatedTest(value = 2, name = "Repeat Test"
				+ "{currentRepitition} of {"
				+ "totalRepitition}")
		void testMultipleInputs() {
			bm.addBooks(1234, "Eragon", 500);
			assertFalse(bm.bookList.isEmpty());
			assertEquals(1, bm.bookList.size());
		}
	}
	
	/**
	 * Testing Read Operation
	 */
	@Test
	@DisplayName("Test Read Operation")
	void testReadOperations() {
		bookList1 = bm.addBooks(1234, "Eragon", 500.0);
		assertEquals(1234, bookList1.get(0).getbId());
		assertEquals("Eragon", bookList1.get(0).getbName());
		assertEquals(500.0, bookList1.get(0).getPrice());
	}
	
	/**
	 * Testing Update Operation
	 */
	@Test
	@DisplayName("Test Update Operation")
	void testUpdateOperation() {
		bookList1 = bm.addBooks(1234, "Eragon", 500.0);
		bookList1.get(0).setbName("Brisingr");
		bookList1.get(0).setPrice(600.0);
		assertEquals(1234, bookList1.get(0).getbId());
		assertEquals("Brisingr", bookList1.get(0).getbName());
		assertEquals(600.0, bookList1.get(0).getPrice());
	}
	
	/**
	 * Testing Delete Operation
	 */
	@Test
	@DisplayName("Test Delete Opeartion")
	void testDeleteOperation() {
		bm.addBooks(1234, "Eragon", 500.0);
		assertEquals(1, bm.bookList.size());
		bm.bookList.remove(0);
		assertTrue(bm.bookList.isEmpty());
	}
	
	/**
	 * Testing Custom Exceptions
	 * @throws BookAlreadyFoundException 
	 * @throws PriceIsNotValidException 
	 * @throws BookNameCannotBeNullException 
	 * @throws BookIDCannotBeNegativeException 
	 */
	@Test
	@DisplayName("Read Operation Method "
			+ "Should Throw ArrayListIsNullException")
	@Disabled
	void shouldThrowArrayListIsNullException() throws BookIDCannotBeNegativeException, BookNameCannotBeNullException, PriceIsNotValidException, BookAlreadyFoundException {
		
		bm.addBooks(1235, "Eragon", 500.0);
		bm.bookList.remove(0);
		Assertions.assertThrows(ArrayListIsNullException.class, 
				() -> {
					bm.displayBooks(bm.bookList, 1235);
				});
	}
	
	@Test
	@DisplayName("Validate Book ID Method "
			+ "Should Throw BookIDCannotBeNegativeException")
	@Disabled
	void shouldThrowBookIDCannotBeNegativeException() throws 
	BookIDCannotBeNegativeException{
		Assertions.assertThrows(BookIDCannotBeNegativeException.class, 
				() -> {
					bm.addBooks(-45, "Eragon", 500.0);
				});
	}
	
	@Test
	@DisplayName("Validate Book Name Method "
			+ "Should Throw BookNameCannotBeNullException")
	@Disabled
	void shouldThrowBookNameCannotBeNullException() throws
	BookNameCannotBeNullException{
		Assertions.assertThrows(BookNameCannotBeNullException.class, 
				() -> {
					bm.addBooks(1234, "", 500.0);
				});
	}
	
	@Test
	@DisplayName("Validate Book Price Method "
			+ "Should Throw PriceIsNotValidException"
			+ " for Price - 0")
	@Disabled
	void shouldThrowPriceIsNotValidException() throws 
	PriceIsNotValidException{
		Assertions.assertThrows(PriceIsNotValidException.class, 
				() -> {
					bm.addBooks(1234, "Eragon", 0);
				});
	}
	
	@Test
	@DisplayName("Validate Book Price Method "
			+ "Should Throw PriceIsNotValidException"
			+ " for Negative Prices")
	@Disabled
	void shouldThrowPriceIsNotValidExceptionForNegativePrice() throws 
	PriceIsNotValidException {
		Assertions.assertThrows(PriceIsNotValidException.class, 
				() -> {
					bm.addBooks(1234, "Eragon", -10);
				});
	}
	
	@Test
	@DisplayName("Dupliacte Add "
			+ "Should Throw BookAlreadyFoundException")
	@Disabled
	void shouldThrowBookAlreadyFoundException() throws 
	BookAlreadyFoundException, 
	BookIDCannotBeNegativeException, 
	BookNameCannotBeNullException, PriceIsNotValidException {
		bm.addBooks(1234, "Eragon", 500.0);
		Assertions.assertThrows(BookAlreadyFoundException.class, 
				() -> {
					bm.addBooks(1234, "Eragon", 500.0);
				});
	}
	
	@Nested
	@Disabled
	class BookNotFoundExceptionsTest{
		
		@DisplayName("Any Find Operation "
				+ "Should Throw BookNotFoundException")
		void shouldThrowBookNotFoundException() throws BookIDCannotBeNegativeException, BookNameCannotBeNullException, PriceIsNotValidException, BookAlreadyFoundException {
			bm.addBooks(1234, "Eragon", 500.0);
			Assertions.assertThrows(BookNotFoundException.class, 
					() -> {
						bm.displayBooks(bm.bookList, 1235);
					});
		}
		
		void shouldThrowBookNotFoundException1() {
			Assertions.assertThrows(BookNotFoundException.class, 
					() -> {
						bm.updateBook(bm.bookList, 1235,
								"Brisingr", 550.0);
					});
		}
		
		void shouldThrowBookNotFoundException2() {
			Assertions.assertThrows(BookNotFoundException.class, 
					() -> {
						bm.deleteBook(bm.bookList, 1235);
					});
		}
		
	}
		
}
