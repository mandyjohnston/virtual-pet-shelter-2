import java.util.Scanner;
public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter petsPalace = new VirtualPetShelter();
        OrganicCat dragon1=new OrganicCat("Drogon", "Fiery and Fierce",50, 40, 50,50);
        RoboticDog alligator1= new RoboticDog("Akira", "\tSnappy and quick",50, 50);
        OrganicDog dog1= new OrganicDog("Ghost","\tLoyal and affectionate", 50, 60, 60,50);
        RoboticCat cat1 = new RoboticCat("Olenna", "Stealthy and sneaky",50, 70);


        petsPalace.admit(dragon1);
        petsPalace.admit(alligator1);
        petsPalace.admit(dog1);
        petsPalace.admit(cat1);
        String decision = "";
        while (!decision.equalsIgnoreCase("Yes")) {
            System.out.println("Thank you for visiting Pets Palace, \n where we shelter animals \n");
            System.out.println("This is the status of the shelter's pets: \n");
            System.out.println("ORGANIC PETS:");
            System.out.println("Name\t|Hunger\t|Thirst\t|Happiness\t| Maintenance");
            System.out.println("--------|-------|-------|-------|-------|-------");
            System.out.println();
            System.out.println(petsPalace.organicPetStatus());
            System.out.println("ROBOTIC PETS:");
            System.out.println("Name\t|Happiness\t| Maintenance");
            System.out.println("--------|-------|-------|");
            System.out.println(petsPalace.roboticPetStatus());
            System.out.println("\nWhat would you like to do now?\n");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Walk the dogs");
            System.out.println("5. Maintain a pet");
            System.out.println("6. Adopt a pet.");
            System.out.println("7. Admit a pet.");
            System.out.println("8. Quit");
            String optionEntered = input.nextLine();
            if (optionEntered.equals("1")) {
                petsPalace.feedAll();
                System.out.println("You fed all the pets in the shelter food.\n");
            } else if (optionEntered.equals("2")) {
                petsPalace.waterAll();
                System.out.println("You gave all the pets in the shelter water.\n");
            } else if (optionEntered.equals("3")) {
                System.out.println("Choose the pet you would like to play with:");
                System.out.println("ORGANIC PETS:");
                System.out.println(petsPalace.organicOption4Display());
                System.out.println("ROBOTIC PETS:");
                System.out.println(petsPalace.roboticOption4Display());
                String petName = input.nextLine();
                petsPalace.play(petName);
                System.out.println("You had " + petName + " jump through hoops of fire for an hour.\n");}
            else if (optionEntered.equals("4")) {
                petsPalace.walkDogs();
                System.out.println("You walked all the dogs.\n");
            }
            else if (optionEntered.equals("5")) {
                petsPalace.maintainAll();
                System.out.println("You cared for all the pets.\n");
            }
             else if (optionEntered.equals("6")) {
                System.out.println("You've chosen to adopt a pet.");
                System.out.println("Which pet would you like to adopt?\n");
                System.out.println("ORGANIC PETS:");
                System.out.println(petsPalace.organicOption4Display());
                System.out.println("ROBOTIC PETS:");
                System.out.println(petsPalace.roboticOption4Display());
                String petName = input.nextLine();
                if (!petsPalace.doesPetRemain(petName)) {
                    System.out.println("This pet does not exist.");
                } else {
                    petsPalace.adopt(petName);
                    System.out.println("Congrats on adopting your new pet, \n" + petName + "!");
                }

            } else if (optionEntered.equals("7")) {
                System.out.println("What type of pet do you have? Organic Dog, Organic Cat, Robotic Dog or Robotic Cat?: ");
                String newPetType = input.nextLine();
                System.out.println("Enter the name of the pet you're giving to the shelter: ");
                String newPetName = input.nextLine();
                System.out.println("Please describe your pet");
                String newPetDescription = input.nextLine();
                System.out.println("What is their food level on a scale from 1-100 ");
                int newPetFoodLevel = input.nextInt();
                System.out.println("What is their water level on a scale from 1-100 ");
                int newPetWaterLevel = input.nextInt();
                System.out.println("What is their happiness level on a scale from 1-100 ");
                int newPetHappinessLevel = input.nextInt();
                System.out.println("What is their maintenance level on a scale from 1-100 ");
                int newPetMaintenanceLevel = input.nextInt();
                if (newPetType.equals("Organic Dog")) {
                    petsPalace.admit(new OrganicDog(newPetName, newPetDescription,newPetFoodLevel,newPetWaterLevel,newPetHappinessLevel,newPetMaintenanceLevel));
                }
                else if (newPetType.equals("Organic Cat")) {
                    petsPalace.admit(new OrganicCat(newPetName, newPetDescription,newPetFoodLevel,newPetWaterLevel,newPetHappinessLevel,newPetMaintenanceLevel));
                }
                else if (newPetType.equals("Robotic Dog")) {
                    petsPalace.admit(new RoboticDog(newPetName, newPetDescription,newPetHappinessLevel,newPetMaintenanceLevel));}
                else if (newPetType.equals("Robotic Cat")) {
                    petsPalace.admit(new RoboticCat(newPetName, newPetDescription,newPetHappinessLevel,newPetMaintenanceLevel));
                }
                System.out.println("Thank you - your pet will be cared for here");

            } else if (optionEntered.equals("8")) { // OPTION 6
                System.out.println("Are you sure you wish to quit the game?");
                System.out.println("Enter Yes or No");
                decision = input.nextLine();
                if (decision.equalsIgnoreCase("Yes")) {
                    System.out.println("GAME OVER! >:0");
                } else {
                    decision.equalsIgnoreCase("No");
                    System.out.println("Let's take another spin...");
                    System.out.println("Hanging out at the pet shelter is fun!\n");
                }
            }
            petsPalace.tickAll();
        }
        input.close();
    }
}