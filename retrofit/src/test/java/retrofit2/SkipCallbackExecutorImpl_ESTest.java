/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 11 11:11:26 GMT 2022
 */

package retrofit2;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.annotation.Annotation;

import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class SkipCallbackExecutorImpl_ESTest extends SkipCallbackExecutorImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    SkipCallbackExecutorImpl skipCallbackExecutorImpl0 = new SkipCallbackExecutorImpl();
    Object object0 = new Object();
    boolean boolean0 = skipCallbackExecutorImpl0.equals(object0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Undeclared exception!
    assertThrows(NullPointerException.class, () -> {
      SkipCallbackExecutorImpl.ensurePresent(null);
    });
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    SkipCallbackExecutorImpl skipCallbackExecutorImpl0 = new SkipCallbackExecutorImpl();
    Class<? extends Annotation> class0 = skipCallbackExecutorImpl0.annotationType();
    assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    SkipCallbackExecutorImpl skipCallbackExecutorImpl0 = new SkipCallbackExecutorImpl();
    String string0 = skipCallbackExecutorImpl0.toString();
    assertEquals("@retrofit2.SkipCallbackExecutor()", string0);
  }
}
