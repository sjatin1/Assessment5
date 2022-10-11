package courier.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import courier.dao.CourierDao;

class CourierDaoTest {

	@Test
	void testGetCname1() throws SQLException {
		assertEquals("jatin",CourierDao.getCname("1308031426183"));
	}
	@Test
	void testGetCname2() throws SQLException {
		assertNotEquals("jatin",CourierDao.getCname("null"));
	}

}
