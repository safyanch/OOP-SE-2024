public abstract class LivingThing {
public void breath(){
System.out.println("Living Thing breathing...");
}
public void eat(){
System.out.println("Living Thing eating...");
}
/**
* Abstract method walk()
* We want this method to be implemented by a
* Concrete class.
*/
public abstract void walk();
}