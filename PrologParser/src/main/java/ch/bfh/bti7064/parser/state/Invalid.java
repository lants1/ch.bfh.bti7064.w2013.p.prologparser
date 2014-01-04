package ch.bfh.bti7064.parser.state;

public class Invalid implements State{

	public State getState(char nextChar){
		return this;
	}
}
