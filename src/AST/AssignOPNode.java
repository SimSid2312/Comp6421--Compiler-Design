package AST;

import Visitors.Visitor;

public class AssignOPNode extends Node {
  
	public AssignOPNode(String data){
		super(data);
	}
	
	public AssignOPNode(String data, Node parent){
		super(data, parent);
	}
	
	public AssignOPNode(String data, String type){
		super(data, type);
	}
	
	/**
	 * Every class that may be visited by any visitor needs
	 * to implement the accept method, that calls the appropriate
	 * visit method in the passed visitor, achieving double
	 * dispatch. 
	 * 
	 */
	/*public void accept(Visitor visitor) {
		visitor.visit(this);
	}*/
	/*public void accept(Visitor visitor) {
		for (Node child : this.getChildren())
			child.accept(visitor);
		visitor.visit(this);
	}*/
	
	public void accept(Visitor p_visitor) {
		p_visitor.visit(this);
	}
}
