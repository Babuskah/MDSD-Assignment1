package main.metamodel;

public class Transition {
	private State target;
	private String event;
	private boolean setOperation;
	private boolean incrementOperation;
	private boolean decrementOperation;
	private Object operationVariableName;
	private Object conditionVariableName;
	private Integer conditionComparedValue;
	private boolean conditionEqual;
	private boolean conditionGreaterThan;
	private boolean conditionLessThan;
	
	public Transition(String event) {
		super();
		this.event = event;
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}

	public boolean hasSetOperation() {
		return setOperation;
	}

	public boolean hasIncrementOperation() {
		return incrementOperation;
	}

	public boolean hasDecrementOperation() {
		return decrementOperation;
	}

	public Object getOperationVariableName() {
		return operationVariableName;
	}

	public boolean isConditional() {
		return conditionEqual || conditionGreaterThan || conditionLessThan;
	}

	public Object getConditionVariableName() {
		return conditionVariableName;
	}

	public Integer getConditionComparedValue() {
		return conditionComparedValue;
	}

	public boolean isConditionEqual() {
		return conditionEqual;
	}

	public boolean isConditionGreaterThan() {
		return conditionGreaterThan;
	}

	public boolean isConditionLessThan() {
		return conditionLessThan;
	}

	public boolean hasOperation() {
		return setOperation || incrementOperation || decrementOperation;
	}
	
	public void setTarget(State target) {
		this.target = target;
	}
	
	public void setSetOperation(boolean setOperation) {
		this.setOperation = setOperation;
	}

	public void setIncrementOperation(boolean incrementOperation) {
		this.incrementOperation = incrementOperation;
	}

	public void setDecrementOperation(boolean decrementOperation) {
		this.decrementOperation = decrementOperation;
	}

	public void setOperationVariableName(Object operationVariableName) {
		this.operationVariableName = operationVariableName;
	}

	public void setConditionVariableName(Object conditionVariableName) {
		this.conditionVariableName = conditionVariableName;
	}

	public void setConditionComparedValue(Integer conditionComparedValue) {
		this.conditionComparedValue = conditionComparedValue;
	}

	public void setConditionEqual(boolean conditionEqual) {
		this.conditionEqual = conditionEqual;
	}

	public void setConditionGreaterThan(boolean conditionGreaterThan) {
		this.conditionGreaterThan = conditionGreaterThan;
	}

	public void setConditionLessThan(boolean conditionLessThan) {
		this.conditionLessThan = conditionLessThan;
	}

}
