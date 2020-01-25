public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return  -1;
        }else{
            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion(double kilometerPerHour){
        if (kilometerPerHour < 0 ){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometerPerHour+ " km/h = "+
            toMilesPerHour(kilometerPerHour)+" mi/h");
        }
    }
    public static void printMegaBytesAndKiloBytes(int KiloBytes) {
        if (KiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = KiloBytes / 1024;
            System.out.println(KiloBytes + " KB = " + mb + " MB and " + KiloBytes % 1024 + " KB");
        }
    }
    public static double area(double radius){
        if (radius <0){
            return  -1;
        }else {
            return (Math.PI)*(Math.pow(radius,2));
        }
    }
    public static double area(double x, double y){
        if(x<0 || y<0){
            return  -1;
        }else {
            return x*y;
        }
    }


        }
