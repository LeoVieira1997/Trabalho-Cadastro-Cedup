public class FirstExercise {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(3000);
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int megaBytes = kiloBytes/1024;
        if (kiloBytes < 0){
            System.out.println("Invalid value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes % 1024 + " KB");
        }
    }
}
