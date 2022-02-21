package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {

	private Map<String, Integer> ints = new HashMap<>();
	private List<State> states = new ArrayList<>();
	private State current;
	private State initial;
	private String currentEvent;
	private Transition trans;
	
	public Machine build() {
		Machine machine = new Machine(states, ints, initial);
		return machine;
	}

	public StateMachine state(String string) {
		states.stream().filter(state -> state.getName() == string).findFirst().ifPresentOrElse(state -> this.current = state, () -> states.add(this.current = new State(string)));
		return this;
	}

	public StateMachine initial() {
		initial = states.get(states.size() - 1);
		return this;
	}

	public StateMachine when(String string) {
		currentEvent = string;
		return this;
	}

	public StateMachine to(String string) {
		//currentEvent.setTarget(string);
		return this;
		
	}

	public StateMachine integer(String string) {
		ints.put(string,  0);
		return this;
	}

	public StateMachine set(String string, int i) {		
		trans.setSetOperation(true);
		return this;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
