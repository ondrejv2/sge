// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package dant.test.rmi;

public final class CodebaseTestImpl_Stub
    extends java.rmi.server.RemoteStub
    implements dant.test.rmi.CodebaseTest, java.rmi.Remote
{
    private static final java.rmi.server.Operation[] operations = {
	new java.rmi.server.Operation("void doSomething()"),
	new java.rmi.server.Operation("void doSomething(java.lang.String)")
    };
    
    private static final long interfaceHash = 1853430110301379584L;
    
    private static final long serialVersionUID = 2;
    
    private static boolean useNewInvoke;
    private static java.lang.reflect.Method $method_doSomething_1;
    
    static {
	try {
	    java.rmi.server.RemoteRef.class.getMethod("invoke",
		new java.lang.Class[] {
		    java.rmi.Remote.class,
		    java.lang.reflect.Method.class,
		    java.lang.Object[].class,
		    long.class
		});
	    useNewInvoke = true;
	    $method_doSomething_1 = dant.test.rmi.CodebaseTest.class.getMethod("doSomething", new java.lang.Class[] {java.lang.String.class});
	} catch (java.lang.NoSuchMethodException e) {
	    useNewInvoke = false;
	}
    }
    
    // constructors
    public CodebaseTestImpl_Stub() {
	super();
    }
    public CodebaseTestImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of doSomething()
    public void doSomething()
	throws java.rmi.RemoteException
    {
			String codebase = System.getProperty ("java.rmi.server.codebase", "");
			
	try {
	    if (useNewInvoke) {
		ref.invoke(this, $method_doSomething_1, new java.lang.Object[] {codebase}, 3082155412933025001L);
	    } else {
		java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 1, interfaceHash);
		try {
		    java.io.ObjectOutput out = call.getOutputStream();
		    out.writeObject(codebase);
		} catch (java.io.IOException e) {
		    throw new java.rmi.MarshalException("error marshalling arguments", e);
		}
		ref.invoke(call);
		ref.done(call);
	    }
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}