package jp.co.junit4.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author みっちー
 *
 */
public class ValidatorUtilityTest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    /**
     * {@link jp.co.junit4.sample.ValidatorUtility#isBlank(java.lang.String)}
     * のためのテスト・メソッド。
     */
    @Test
    public void testIsBlank() {
        System.out.println("testIsBlank");
    }

    /**
     * {@link jp.co.junit4.sample.ValidatorUtility#isInt(java.lang.String)}
     * のためのテスト・メソッド。
     */
    @Test
    public void testIsInt() {
        System.out.println("testIsInt");
    }
}