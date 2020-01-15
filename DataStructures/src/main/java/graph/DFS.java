package graph;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.GraphImpl;

import java.util.List;

public class DFS {

    public static void main(String[] args) {
       Graph graph = new GraphImpl();

       Math.max(3,4);

//       Math.random()
    }
}

class GraphNode{
    List<GraphNode> adjacentNode;
    int val;

    GraphNode(int val){
        this.val = val;
    }
}
