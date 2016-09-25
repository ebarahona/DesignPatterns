package com.wangdi.designpattern.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setDescription("prototype");
		
		ConcretePrototype prototype1 = (ConcretePrototype) prototype.clone();
		prototype1.setDescription("new 1");
		
		ConcretePrototype prototype2 = (ConcretePrototype) prototype.clone();
		prototype2.setDescription("new 2");
		
		prototype.show();
		prototype1.show();
		prototype2.show();
		
		System.out.println(prototype == prototype1);
		System.out.println(prototype.getDescription() == prototype1.getDescription());
		
		System.out.println("\n--------concretePrototype2----------\n");
		
		ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
		concretePrototype2.setDescription("concrete prototype2");
		
		ConcretePrototype2 prototype5 = concretePrototype2.clone();
		prototype5.setDescription("new 5");
		
		ConcretePrototype2 prototype6 = concretePrototype2.clone();
		prototype6.setDescription("new 6");
		
		concretePrototype2.show();
		prototype5.show();
		prototype6.show();
		
		System.out.println(concretePrototype2 == prototype5);
		System.out.println(concretePrototype2.getDescription() == prototype5.getDescription());
		
		System.out.println("\n--------reference----------\n");
		
		ConcretePrototypeWithReference prototypeWithReferencec = new ConcretePrototypeWithReference();
		prototypeWithReferencec.setDescriptionNumber(0);
		
		ConcretePrototypeWithReference prototype3 = prototypeWithReferencec.clone();
		prototype3.setDescriptionNumber(3);
		
		ConcretePrototypeWithReference prototype4 = prototypeWithReferencec.clone();
		prototype4.setDescriptionNumber(4);
		
		prototypeWithReferencec.show();
		prototype3.show();
		prototype4.show();
		
		System.out.println(prototypeWithReferencec == prototype3);
		System.out.println(prototypeWithReferencec.getDescription() == prototype3.getDescription());
		
System.out.println("\n--------reference Deep Clone----------\n");
		
		ConcretePrototypeWithReferenceDeepClone deepPrototype = new ConcretePrototypeWithReferenceDeepClone();
		prototypeWithReferencec.setDescriptionNumber(0);
		
		ConcretePrototypeWithReferenceDeepClone prototype7 = deepPrototype.clone();
		prototype7.setDescriptionNumber(3);
		
		ConcretePrototypeWithReferenceDeepClone prototype8 = deepPrototype.clone();
		prototype8.setDescriptionNumber(4);
		
		deepPrototype.show();
		prototype7.show();
		prototype8.show();
		
		System.out.println(deepPrototype == prototype7);
		System.out.println(deepPrototype.getDescription() == prototype7.getDescription());
	}

}
