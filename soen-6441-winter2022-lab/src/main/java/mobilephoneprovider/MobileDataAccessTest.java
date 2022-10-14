package mobilephoneprovider;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MobileDataAccessTest {

	@Test
	void testGrantAccessActiveAccount1() {
		MobileUser testUser = new MobileUser("test", "test", 123, true, 1, 1);
		assertEquals(MobileDataAccess.grantAccess(testUser), true);
	}

	@Test
	void testGrantAccessActiveAccount2() {
		MobileUser testUser = new MobileUser("test", "test", 123, true, 1, 0);
		assertEquals(MobileDataAccess.grantAccess(testUser), true);
	}

	@Test
	void testGrantAccessActiveAccount3() {
		MobileUser testUser = new MobileUser("test", "test", 123, true, 0, 1);
		assertEquals(MobileDataAccess.grantAccess(testUser), true);
	}

	@Test
	void testGrantAccessActiveAccount4() {
		MobileUser testUser = new MobileUser("test", "test", 123, true, 0, 0);
		assertEquals(MobileDataAccess.grantAccess(testUser), false);
	}

	@Test
	void testGrantAccessInactivatedAccount1() {
		MobileUser testUser = new MobileUser("test", "test", 123, false, 1, 1);
		assertEquals(MobileDataAccess.grantAccess(testUser), false);
	}

	@Test
	void testGrantAccessInactivatedAccount2() {
		MobileUser testUser = new MobileUser("test", "test", 123, false, 1, 1);
		assertEquals(MobileDataAccess.grantAccess(testUser), false);
	}

	@Test
	void testGrantAccessInactivatedAccount3() {
		MobileUser testUser = new MobileUser("test", "test", 123, false, 1, 1);
		assertEquals(MobileDataAccess.grantAccess(testUser), false);
	}

	@Test
	void testGrantAccessInactivatedAccount4() {
		MobileUser testUser = new MobileUser("test", "test", 123, false, 1, 1);
		assertEquals(MobileDataAccess.grantAccess(testUser), false);
	}

}
