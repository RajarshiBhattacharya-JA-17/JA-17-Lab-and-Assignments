/**
 * 
 */
package com.capgemini.author.model;

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
class AuthorTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Author author;
	static Author author1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		author = new Author("Rj", "rj@gmail.com", 'm');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		author = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		author1 = new Author();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		author1 = null;
	}
	
	/**
	 * Test method for {@link com.capgemini.author.model.Author#Author()}.
	 */
	@Test
	void testAuthor() {
		assertEquals(new Author(), author1);
	}

	/**
	 * Test method for {@link com.capgemini.author.model.Author#getName()}.
	 */
	@Test
	void testGetName() {
		assertEquals("Rj", author.getName());
	}

	/**
	 * Test method for {@link com.capgemini.author.model.Author#getEmail()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("rj@gmail.com", author.getEmail());
	}

	/**
	 * Test method for {@link com.capgemini.author.model.Author#getGender()}.
	 */
	@Test
	void testGetGender() {
		assertEquals('m', author.getGender());
	}

	/**
	 * Test method for {@link com.capgemini.author.model.Author#Author(java.lang.String, java.lang.String, char)}.
	 */
	@Test
	void testAuthorStringStringChar() {
		fail("Not yet implemented");
	}

}
