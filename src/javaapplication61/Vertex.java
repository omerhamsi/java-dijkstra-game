
package javaapplication61;
 
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
 
public class Vertex implements Comparable<Vertex> {
 
 private String name;
 private List<Edge> adjacenciesList;
 private boolean visited;
 private Vertex predecessor;
 private JLabel labelpredecceor;
 private double distance = Double.MAX_VALUE;
 JLabel label=new javax.swing.JLabel();
 public Vertex(JLabel label) {
 //this.name = name;
 this.label=label;
 this.adjacenciesList = new ArrayList<>();
 }
 
 public void addNeighbour(Edge edge) {
 this.adjacenciesList.add(edge);
 }

    public JLabel getLabel() {
        return label;
    }

    public JLabel getLabelpredecceor() {
        return labelpredecceor;
    }

    public void setLabelpredecceor(JLabel labelpredecceor) {
        this.labelpredecceor = labelpredecceor;
    }
 
 public String getName() {
 return name;
 }
 
 public void setName(String name) {
 this.name = name;
 }
 
 public List<Edge> getAdjacenciesList() {
 return adjacenciesList;
 }
 
 public void setAdjacenciesList(List<Edge> adjacenciesList) {
 this.adjacenciesList = adjacenciesList;
 }
 
 public boolean isVisited() {
 return visited;
 }
 
 public void setVisited(boolean visited) {
 this.visited = visited;
 }
 
 public Vertex getPredecessor() {
 return predecessor;
 }
 
 public void setPredecessor(Vertex predecessor) {
 this.predecessor = predecessor;
 }
 
 public double getDistance() {
 return distance;
 }
 
 public void setDistance(double distance) {
 this.distance = distance;
 }
 
 @Override
 public String toString() {
 return this.name;
 }
 
 @Override
 public int compareTo(Vertex otherVertex) {
 return Double.compare(this.distance, otherVertex.getDistance());
 }
}