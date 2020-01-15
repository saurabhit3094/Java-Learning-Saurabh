package dfs;

import java.util.List;

public class DfsImplementation {



}

class GraphNode{

    private int val;
    private List<GraphNode> connections;


    public List<GraphNode> getConnections() {
        return connections;
    }

    public void setConnections(List<GraphNode> connections) {
        this.connections = connections;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}



