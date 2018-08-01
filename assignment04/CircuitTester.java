package assignment04;
import java.util.*;

public class CircuitTester{
  public static void main(String[] args){

    ResonantCircuit circuit1 = new ResonantCircuit(3, 5, 7);
    System.out.println("Resonant Circuit Test: ");
    System.out.println("Expected frequency: 3.0");
    System.out.println("Expected bandwidth: 5.0");
    System.out.println("Expected gain: 7.0");
    circuit1.display();
    System.out.println("----------------------------------------");

    ParallelResonantCircuit circuit2 = new ParallelResonantCircuit(6, 6, 6);
    System.out.println("Testing Series Circuit");
    System.out.println("Expected frequency: .16666");
    System.out.println("Expected bandwidth: .027776");
    System.out.println("Expected gain: 0.166666");
    System.out.println("Expected resistance: 6.0");
    System.out.println("Expected capacitance: 6.0");
    System.out.println("Expected inductance: 6.0");
    circuit2.display();
    System.out.println("-------------------------------------------");

    SeriesResonantCircuit circuit3 = new SeriesResonantCircuit(10, 10, 10);
    System.out.println("Expected frequency: .1");
    System.out.println("Expected bandwidth: 1.0");
    System.out.println("Expected gain: 0.1");
    System.out.println("Expected resistance: 10.0");
    System.out.println("Expected capacitance: 10.0");
    System.out.println("Expected inductance: 10.0");
    circuit3.display();
  }
}
