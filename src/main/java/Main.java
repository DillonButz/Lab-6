
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Djon Bon Junzi
 */
public class Main {

    public static void main(String[] args) {
        Scanner createNewScanner = new Scanner(System.in);

        System.out.println("Please enter first LandTract Width: ");
        double firstLandTractWidth = createNewScanner.nextDouble();
        System.out.println("Please enter first LandTract Length: ");
        double firstLandTractLength = createNewScanner.nextDouble();

        System.out.println("Please enter secound LandTract Width: ");
        double SecoundLandTractWidth = createNewScanner.nextDouble();
        System.out.println("Please enter secound LandTract Length: ");
        double SecoundLandTractLength = createNewScanner.nextDouble();

        LandTract firstLandTract = new LandTract(firstLandTractLength, firstLandTractWidth);
        LandTract secoundLandTract = new LandTract(SecoundLandTractLength, SecoundLandTractWidth);

        System.out.println("The values of the first LandTract is: " + firstLandTract.toString());

        System.out.println("The values of the secound LandTract is: " + secoundLandTract.toString());
        
        
        if(firstLandTract.equals(secoundLandTract) == true)
        {
            System.out.println("First Land Track and Secound Land Track have equal areas");
        }else{
            System.out.println("First Land Track and Secound Land Track do not have equal areas.");
        }

    }
}
