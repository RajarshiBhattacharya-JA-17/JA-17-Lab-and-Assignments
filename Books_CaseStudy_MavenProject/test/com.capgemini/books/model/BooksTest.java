/**
 * 
 */
package com.capgemini.books.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rajarshi
 *
 */
class BooksTest {

	/**
	 * @throws java.lang.Exception
	 */
	
	static Books book;
	static Books book1;
	static int bId = 1234;
	static String bName = "Eragon";
	static double bPrice = 500;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		book = new Books(bId, bName, bPrice);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		book = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		book1 = new Books();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
	}

	/**
	 * Test method for {@link com.capgemini.books.model.Books#Books()}.
	 */
	@Test
	void testBooks() {
		assertEquals(new Books(), book1);
	}

	/**
	 * Test method for {@link com.capgemini.books.model.Books#Books(int, java.lang.String, double)}.
	 */
	@Test
	void testBooksIntStringDouble() {
		assertEquals(new Books(bId, bName, bPrice), book);
	}

	/**
	 * Test method for {@link com.capgemini.books.model.Books#getbId()}.
	 */
	@Test
	void testGetbId() {
		assertEquals(bId, book.getbId());
	}
	
	/**
	 * Test method for {@link com.capgemini.books.model.Books#setbId()}.
	 */
	@Test
	void testSetbId() {
		book1.setbId(1235);
		assertEquals(1235, book1.getbId());
	}

	/**
	 * Test method for {@link com.capgemini.books.model.Books#getbName()}.
	 */
	@Test
	void testGetbName() {
		assertEquals(bName, book.getbName());
	}
	
	/**
	 * Test method for {@link com.capgemini.books.model.Books#setbName()}.
	 */
	@Test
	void testSetbName() {
		book1.setbName("Brisingr");
		assertEquals("Brisingr", book1.getbName());
	}

	/**
	 * Test method for {@link com.capgemini.books.model.Books#getPrice()}.
	 */
	@Test
	void testGetPrice() {
		assertEquals(bPrice, book.getPrice());
	}
	
	/**
	 * Test method for {@link com.capgemini.books.model.Books#setPrice()}.
	 */
	@Test
	void testSetPrice() {
		book1.setPrice(550);
		assertEquals(550, book1.getPrice());
	}

}
