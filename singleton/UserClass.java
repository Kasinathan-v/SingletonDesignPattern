//$Id$
package singleton;

// what problem does singleton design pattern solve?
// unecessary overusage of resources when it can avoided
// unexpected results may occur in shared resources.

// eg: single dataObject(one db connection establishment) is enough for all classes to communicate with DB.
// Database student = getDatabaseInstance();
// student.get("select query");
// Database employee = getDatabaseInstance();
// employee.get("select query");

public class UserClass {

	public static void main(String[] args) {

//		SingletonDesignPattern obj1 = SingletonDesignPattern.getSingletonInstance();
//		SingletonDesignPattern obj2 = SingletonDesignPattern.getSingletonInstance();

		Thread t1 = new Thread (new Runnable() {
			@Override
			public void run() {
				SingletonDesignPattern instance1 = SingletonDesignPattern.getSingletonInstance();
				System.out.println("Instance 1 hash:" + instance1.hashCode());
			}
		});

		Thread t2 = new Thread (new Runnable() {
			@Override
			public void run() {
				SingletonDesignPattern instance2 = SingletonDesignPattern.getSingletonInstance();
				System.out.println("Instance 2 hash:" + instance2.hashCode());
			}
		});
		
		t1.start();
		t2.start();
	}
}
