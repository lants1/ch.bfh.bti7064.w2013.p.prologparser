package ch.bfh.bti7064.parser.state;

public interface State {
	
	public State getState(char nextChar);
}
