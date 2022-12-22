import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Le fichier .jar (Java archive) est un fichier éxécutable sur n'importe quelle OS (sous un JRE).
        // Steps dans intelIj:
        // 1. Configuration step:
        // Go to File menu => Project Structure => Artifacts => click ADD => Choose JAR => Choose "From modules with dependencies" =>
        // Shoose the main class => Click "OK"
        // 2. Create the build step: Go To Build menu => Choose "Build Artifacts"
        // Step 3: run the artifact jar with the following command (You must be in the same directory):
        // java -jar FILE_NAME.jar args1 args2 ... agrsN

        if (args.length == 0)
            System.out.println("Hello world!");
        else
            System.out.println("hello " + args[0]);
    }


}