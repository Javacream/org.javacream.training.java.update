package appl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public non-sealed class Leaf extends Node {
	
	private static final List<Node> nodes = Collections.unmodifiableList(new ArrayList<>());
	
	@Override
	public List<Node> nodes() {
		return nodes;
	}
}
