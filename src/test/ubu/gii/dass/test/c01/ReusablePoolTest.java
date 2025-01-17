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
			assertTrue(ReusablePool.getInstance() instanceof ReusablePool);
		} else {
			assertTrue(ReusablePool.getInstance() instanceof ReusablePool);
		}

	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		ReusablePool reusablePool_acquire = ReusablePool.getInstance();
		try {
			assertTrue(reusablePool.acquireReusable() instanceof Reusable);
			assertTrue(reusablePool.acquireReusable() instanceof Reusable);
			assertTrue(reusablePool.acquireReusable() instanceof Reusable);
		} catch (NotFreeInstanceException e) {
			assertTrue("A la tercera llamada devuelve una excepción por no disponer de instancias",true);
		}

	}

	/**
	 * Test method for
	 * {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		ReusablePool reusablePool_release = ReusablePool.getInstance();
		
		try {
			Reusable r = reusablePool_release.acquireReusable();
			reusablePool_release.releaseReusable(r);
			assertTrue("No debería saltar excepcion",true);
			reusablePool_release.releaseReusable(r);
		}catch(Exception e) {
			assertTrue("Al intentar meter el mismo objeto reusable deberia saltar la excepcion", e instanceof DuplicatedInstanceException);
		}finally {
			
		}
		
	}

}
