package CarSimulator;

public class Car 
{ 
// quantità di carburante nel serbatoio 
private double gas; 
 // prestazioni della vettura 
private double kmL; 
// si costruisce un'automobile con carburante uguale a zero 
 public Car(double resa) 
 { 
 kmL = resa; 
 gas = 0; 
 } 

 public void drive(double km) 
 { 
 gas = gas - (km / kmL); 
 } 

 public double getGas() 
 { 
 return gas; 
 } 
 
 public void addGas(double rifornimento) 
 { 
 gas = gas + rifornimento; 
 } 
}