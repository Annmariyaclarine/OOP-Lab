import java.util.Scanner;

public class NestedCPU {

public static void main(String[] args) {
Scanner s= new Scanner(System.in);

CpuClass cpu1=new CpuClass();
CpuClass.ProcessorClass processor = cpu1.new ProcessorClass();
CpuClass.RamClass ram = new CpuClass.RamClass();

System.out.println("Enter the price of CPU: ");
double a=s.nextDouble();
System.out.println("Enter no of cores: ");
double b=s.nextDouble();
System.out.println("Enter the manufacturer of processor: ");
String m=s.next();
System.out.println("Enter the memory of RAM: ");
double d=s.nextDouble();
System.out.println("Enter the manufacturer of ram: ");
String n=s.next();

cpu1.price=a;
processor.cores=b;
processor.manufacturer=m;
ram.memory=d;
ram.manufacturer=n;

System.out.println();
System.out.println("Price of the cpu: "+cpu1.price);
System.out.println("No of core in processor: "+processor.cores);
System.out.println("Name of the manufacturer: "+processor.manufacturer);
System.out.println("Processor cache: "+processor.getCache());

System.out.println("Memory capacity: "+ram.memory+" GB");
System.out.println("Name of the manufacturer of ram: "+ram.manufacturer);
System.out.println("Clock speed of ram: "+ram.getClockSpeed());

}

}

class CpuClass{
double price;

class ProcessorClass{
double cores;
String manufacturer;

double getCache() {
return 4.3;
}
}

static class RamClass{
double memory;
String manufacturer;

double getClockSpeed() {
return 5.5;
}
}
}