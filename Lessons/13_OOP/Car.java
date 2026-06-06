public class Car {
    
    public String carName;
    public int year;
    public boolean isRunning = false;

    public void StartCar(){
        System.out.println("Car Started");
        isRunning = true;
    }
    public void StopCar(){
        System.out.println("Car Stopped");
        isRunning = false;
    }
}
