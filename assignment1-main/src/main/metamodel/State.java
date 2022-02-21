package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private List<Transition> trans = new ArrayList<>();
	private String name;
	
	public State(String name) {
		super();
		this.name = name;
	}

	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return trans;
	}

	public Transition getTransitionByEvent(String string) {
		return trans.stream().filter(trans -> trans.getEvent() == string).findFirst().orElse(null);
	}

}
