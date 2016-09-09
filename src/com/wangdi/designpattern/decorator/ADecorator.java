package com.wangdi.designpattern.decorator;

public abstract class ADecorator extends AComponent {
	protected AComponent component;
	
	@Override
	public void operation() {
		if(component != null)
			component.operation();
	}
	
	public void setComponent(AComponent component){
		this.component = component;
	}

}
