/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

        @Test void appHasAGreeting() {
            Library classUnderTest = new Library();
            assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");


            Graph<String> test = new Graph<>();
            Vertex<String> vertex = test.addNode("A");
            assertTrue(test.map.containsKey(vertex));


            Vertex<String> vertexTwo = test.addNode("B");
            test.addEdge(vertex,vertexTwo);
            assertEquals(vertexTwo , test.getNeighbors(vertex).get(0));


            List<Vertex<String>> resultTwo = new ArrayList<>();
            resultTwo.add(vertexTwo);
            assertEquals(resultTwo , test.getNeighbors(vertex));

            assertEquals(2,test.getSize());

            Graph<String> oneNodeGraph = new Graph<>();
            Vertex<String> vertexThree = oneNodeGraph.addNode("A");

            ArrayList<Vertex<String>> resultThree = new ArrayList<>();
            resultThree.add(vertexThree);
            assertEquals(resultThree, oneNodeGraph.getNodes());

            Graph<String> emptyGraph = new Graph<>();
            assertNull(emptyGraph.getNodes());


            Graph<String> graph = new Graph();

            Vertex vertex1= graph.addNode("Pandora");
            Vertex vertex2= graph.addNode("Arendelle");
            Vertex vertex3= graph.addNode("Metroville");
            Vertex vertex4= graph.addNode("Monstroplolis");
            Vertex vertex5= graph.addNode("Narnia");
            Vertex vertex6= graph.addNode("Naboo");



            graph.addEdge(vertex1,vertex2);
            graph.addEdge(vertex2,vertex3);
            graph.addEdge(vertex3,vertex4);
            graph.addEdge(vertex4,vertex5);
            graph.addEdge(vertex5,vertex6);


            List<Vertex> breadthFirst =graph.breadthFirst(vertex1);

            assertEquals("Pandora",breadthFirst.get(0).value);
            assertEquals("Arendelle",breadthFirst.get(1).value);
            assertEquals("Metroville",breadthFirst.get(2).value);
            assertEquals("Monstroplolis",breadthFirst.get(3).value);
            assertEquals("Narnia",breadthFirst.get(4).value);
            assertEquals("Naboo",breadthFirst.get(5).value);
        }
//    @Test
//    public void depthFirstOneVertex(){
//
//        Graph graph = new Graph();
//
//        graph.addNode("A");
//
//        assertEquals("[A]", graph.depthFirst("A").toString());
//    }


    }



