package task.E20160803.task.abstract_interface;

public abstract class Person implements IAnimal {
	
	protected String name;
	protected int age;
	private String color;
	@Override
	public abstract void run();
	// protected����
	protected abstract boolean sleep();
	// ˽�з���
	private void fun(){}

}
