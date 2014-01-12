package ch.bfh.bti7064.parser.state;

public class Invalid implements State{

	private boolean isOutputState = false;
	
	public boolean isOutputState() {
		return isOutputState;
	}
	
	public State getState(char nextChar){
		return this;
	}
}
