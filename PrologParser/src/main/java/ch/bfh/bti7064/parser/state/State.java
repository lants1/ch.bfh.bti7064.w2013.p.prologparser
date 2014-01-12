package ch.bfh.bti7064.parser.state;

public interface State {
	
	public boolean isOutputState();
	
	public State getState(char nextChar);
}
