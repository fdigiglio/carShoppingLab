import java.util.Scanner; 
public class CarShopping {    
    
    private static Scanner in = new Scanner(System.in);    
    public static void main(String[] args)    {
              int totalCost = 0;       
              totalCost += base();       
              totalCost += automaticWindows();   
              totalCost += keyLessEntry();
              totalCost += onStarSystem();
              totalCost += lockBraKes();
              totalCost += steeringWheel();
              totalCost += sunroof();
              totalCost += coldWeatherPackage();
              totalCost += gpsNavSys();
              totalCost += blackRims();
              totalCost += coldAirIntake();
              totalCost += turboCharger();


              //TODO: call methods that you write for each feature       
              //TODO: print the total cost of the vehicle    
              System.out.println("****** CAR TOTAL " + totalCost + "******");
            }   
    public static int base()    {      
        System.out.println("Our inventory:");       
        System.out.println("Model 1 - $15,000");       
        System.out.println("Model 2 - $24,000");       
        System.out.println("Model 3 - $40,000");       
        System.out.println("Which base model did the customer choose?" + " (enter full model name) > ");       
        String model = in.nextLine();       
        if(model.equalsIgnoreCase("Model 1")){
            return 15000; 
        } else if(model.equalsIgnoreCase("Model 2")){
            return 24000;
        } else if(model.equalsIgnoreCase("Model 3")){
            return 40000;
        } else {
            return 0;
        }          
    }   
    
    public static int automaticWindows(){      
        System.out.print("Automatic Windows for $500? (y/n) > "); 
        String autoWindows = in.nextLine();
        if(autoWindows.equalsIgnoreCase("y") || autoWindows.equalsIgnoreCase("yes")){
            return 500;
        } else {
            return 0;
        }
        
    }

    public static int keyLessEntry(){
        System.out.println("Remote keyless entry for $1000? (y/n) > ");
        String keyEntry = in.nextLine();
        
        if(keyEntry.equalsIgnoreCase("y") || keyEntry.equalsIgnoreCase("yes")){
            return 1000;
        } else {
            return 0;
        }
    }

    public static int onStarSystem(){
        System.out.println("OnStar System for $1000? (y/n) > ");
        String starSystem = in.nextLine();

        if(starSystem.equalsIgnoreCase("y") || starSystem.equalsIgnoreCase("yes")){
            return 1000;
        } else {
            return 0;
        }
    }

    public static int lockBraKes(){
        System.out.println("Anti-lock Brakes (ABS) for $500? (y/n) > ");
        String abs = in.nextLine();

        if(abs.equalsIgnoreCase("y") || abs.equalsIgnoreCase("yes")){
            return 500;
        } else {
            return 0;
        }
    }

    public static int steeringWheel(){
        System.out.println("Telescoping steering wheel/adjustable pedals for $1000? (y/n) > ");
        String steeringWheel = in.nextLine();

        if(steeringWheel.equalsIgnoreCase("y") || steeringWheel.equalsIgnoreCase("yes")){
            return 1000;
        } else {
            return 0;
        }
    }

    public static int sunroof(){
        System.out.println("Sunroof for $800? (y/n) > ");
        String sunroof = in.nextLine();

        if(sunroof.equalsIgnoreCase("y") || sunroof.equalsIgnoreCase("yes")){
            return 800;
        } else {
            return 0;
        }
    }

    public static int coldWeatherPackage(){
        System.out.println("Cold Weather Package (Heated seats/windshield heater) for $1500? (y/n) > ");
        String weatherPack = in.nextLine();
    
        if(weatherPack.equalsIgnoreCase("y") || weatherPack.equalsIgnoreCase("yes")){
            return 1500;
        } else {
            return 0;
        }
    }

    public static int gpsNavSys(){
        System.out.println("GPS Navigation System for $750? (y/n) > ");
        String gpsNav = in.nextLine();
    
        if(gpsNav.equalsIgnoreCase("y") || gpsNav.equalsIgnoreCase("yes")){
            return 750;
        } else {
            return 0;
        }
    }
    
    public static int blackRims(){
        System.out.println("Black rims for $500? (y/n) > ");
        String rims = in.nextLine();
    
        if(rims.equalsIgnoreCase("y") || rims.equalsIgnoreCase("yes")){
            return 500;
        } else {
            return 0;
        }
    }

    public static int coldAirIntake(){
        System.out.println("Cold air intake for $350? (y/n) > ");
        String cAI = in.nextLine();

        if(cAI.equalsIgnoreCase("y") || cAI.equalsIgnoreCase("yes")){
            return 350;
        } else {
            return 0;
        }

    }

    public static int turboCharger(){
        System.out.println("Turbo charger for $2000? (y/n) > ");
        String turboCharger = in.nextLine();

        if(turboCharger.equalsIgnoreCase("y") || turboCharger.equalsIgnoreCase("yes")){
            return 2000;
        } else {
            return 0;
        }

    }

}