package com.ChrisFrahm;
import java.util.Scanner;

import static com.ChrisFrahm.Teams.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String favTeam;
        String favTeamInput;
        Teams favTeamEnum = GREEN_BAY_PACKERS;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Who is your favorite team in the NFC North? ");
        favTeam = keyboard.nextLine();
        favTeamInput = favTeam.toUpperCase().substring(0, 3);

        if (favTeamInput.contains("GRE")){
            favTeamEnum = Teams.GREEN_BAY_PACKERS;
        } else if (favTeamInput.contains("PAC")){
            favTeamEnum = Teams.GREEN_BAY_PACKERS;
        } else if (favTeamInput.contains("CHI")){
            favTeamEnum = Teams.CHICAGO_BEARS;
        } else if (favTeamInput.contains("BEA")){
            favTeamEnum = Teams.CHICAGO_BEARS;
        }else if (favTeamInput.contains("DET")){
            favTeamEnum = Teams.DETROIT_LIONS;
        }else if (favTeamInput.contains("LIO")){
            favTeamEnum = Teams.DETROIT_LIONS;
        }else if (favTeamInput.contains("MIN")){
            favTeamEnum = Teams.MINNESOTA_VIKINGS;
        }else if (favTeamInput.contains("VIK")){
            favTeamEnum = Teams.MINNESOTA_VIKINGS;
        } else {
            favTeamEnum = Teams.OTHER;
        }

        printMascot(favTeamEnum);

    }

    public static void printMascot(Teams teams) {
        String mascot = "The team you choose is not in the NFC North";

        switch (teams) {
            case GREEN_BAY_PACKERS:
                mascot = "Packers";
                break;
            case MINNESOTA_VIKINGS:
               mascot = "Vikings";
                break;
            case DETROIT_LIONS:
                mascot = "Lions";
                break;
            case CHICAGO_BEARS:
                mascot = "Bears";
                break;
            default:
                System.out.println("That is not a team in the NFC North.");
        }
        System.out.println("Mascot: " + mascot);

    }
}
