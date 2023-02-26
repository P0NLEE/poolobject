/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.*;

/**
 * @author Bilal Azar El Mourabit
 *
 */
public class ReusablePoolTest {

	/* Objeto de la clase que se va a tester */
	ReusablePool reusablePool = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reusablePool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		reusablePool = null;
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		if (reusablePool == null) {
			assert ReusablePool.getInstance() != null : "Debe devolverse objetos en caso de que el Pool sea nulo";
		} else {
			assert ReusablePool.getInstance() != null : "Devuelve objetos en caso de que el Pool no este vacios";
		}

	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		reusablePool = null;
		try {
			reusablePool.acquireReusable();
			fail("An exception should have been thrown");
		} catch (NotFreeInstanceException e) {
			assertTrue(true);
		}

	}

	/**
	 * Test method for
	 * {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		reusablePool = ReusablePool.getInstance();
		Reusable r = reusablePool.acquireReusable();
		try {
			//Comprobamos que no se lanza excepcion
			reusablePool.releaseReusable(r);
			
		}catch(NotFreeInstanceException e) {
			fail("No debería haber devuelto la excepcion");
		}
		finally {
			assertTrue(true); 
		}
	}

}
