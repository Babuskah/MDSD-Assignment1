package main.metamodel;


import java.util.List;
import java.util.Map;

public class Machine {
	
	private State initialState;
	private List<State> states;
	private Map<String, Integer> ints;
	
	public Machine(List<State> states, Map<String, Integer> ints, State initialState) {
		super();
		this.states = states;
		this.initialState = initialState;
		this.ints = ints;
	}

	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		return states.stream().filter(state -> state.getName() == string).findFirst().orElse(null);
	}

	public int numberOfIntegers() {
		return ints.size();
	}

	public boolean hasInteger(String string) {
		return ints.containsKey(string);
	}
	
	public Map<String, Integer> getInts() {
		return ints;
	}

}
