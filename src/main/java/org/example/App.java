/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Gabriel Fernandez
 */

package org.example;
import java.util.Scanner;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Only strings for yes are required, since any choice that
        // is not yes is considered to be no
        String y = "y";
        String yes = "yes";

        // Prompt initial question
        System.out.println("Is the car silent when you turn the key?");
        Scanner noiseIn = new Scanner(System.in);
        String noise = noiseIn.next();

        // If the user selects yes, prompt them with the battery question
        if (y.equals(noise.toLowerCase()) ||
                yes.equals(noise.toLowerCase())) {
            System.out.println("Are the battery terminals corroded?");
            Scanner batteryIn = new Scanner(System.in);
            String battery = batteryIn.next();

            // If the user selects yes for the battery question, tell them
            // they need to clean the terminals; exit
            if (y.equals(battery.toLowerCase()) ||
                    yes.equals(battery.toLowerCase())) {
                System.out.println("You'll have to do something about that corrosion.\n"
                                    + "Clean the terminals and try starting again.");
            }
            // If the user selects no for battery question, tell them the
            // cables may be damaged and need replacing; exit
            else {
                System.out.println("The battery cables may be damaged.\n"
                                    + "Replace cables and try again.");
            }
        }
        // If the user selects no for the noise question, prompt them with
        // the slicking question
        else {
            System.out.println("Does the car make a slicking noise?");
            Scanner slickIn = new Scanner(System.in);
            String slick = slickIn.next();

            // If the user selects yes for the slick question, tell them
            // they need to replace the battery; exit
            if (y.equals(slick.toLowerCase()) ||
                    yes.equals(slick.toLowerCase())) {
                System.out.println("That noise might mean you need a new battery.\n"
                                    + "You should replace the battery.");
            }
            // If the user selects no for the slick question, prompt them with
            // the crank question
            else {
                System.out.println("Does the car crank up but fail to start?");
                Scanner crankIn = new Scanner(System.in);
                String crank = crankIn.next();

                // If the user says yes to the crank question, tell them that there
                // may be an issue with their spark plugs; exit
                if (y.equals(crank.toLowerCase()) ||
                        yes.equals(crank.toLowerCase())) {
                    System.out.println("That might mean your spark plugs aren't connected properly.\n"
                                        + "You should check your spark plug connections.");
                }
                // If the user says no to the crank question, prompt them with the
                // engine question
                else {
                    System.out.println("Does the engine start and then die?");
                    Scanner engineIn = new Scanner(System.in);
                    String engine = engineIn.next();

                    // If the user selects yes for the engine question, prompt them with
                    // the fuel question
                    if (y.equals(engine.toLowerCase()) ||
                            yes.equals(engine.toLowerCase())) {
                        System.out.println("Does your car have fuel injection?");
                        Scanner fuelIn = new Scanner(System.in);
                        String fuel = fuelIn.next();

                        // If the user selects yes to the fuel question, tell them to
                        // get their car in for a service; exit
                        if (y.equals(fuel.toLowerCase()) ||
                                yes.equals(fuel.toLowerCase())) {
                            System.out.println("That doesn't sound good.\n"
                                            + "Get it in for service.");
                        }
                        // If the user selects no to the fuel question, tell them there
                        // may be an issue with their choke; exit
                        else {
                            System.out.println("There may be a problem with the choke.\n"
                                    + "Check to ensure the choke is opening and closing.");
                        }
                    }
                    // If the user selected no to the engine question, that means there
                    // isn't an issue with their car, so tell them they are dumb; exit
                    else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
