//$Id$
package singleton;

public class SingletonDesignPattern {

	private volatile static SingletonDesignPattern singleInstance = null;

	private SingletonDesignPattern() {
	}

	public static SingletonDesignPattern getSingletonInstance() {
		if(singleInstance == null) {
			synchronized(SingletonDesignPattern.class) {
				if(singleInstance == null) {
					singleInstance = new SingletonDesignPattern();
				}
			}
		}
		return singleInstance;
	}

}
