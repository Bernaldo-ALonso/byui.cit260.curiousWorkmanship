/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curiousWorkmanship;

import byui.cit260.curiousWorkmanship.model.Player;

/**
 *
 * @author dnp
 */
public class curiousWorkmanship {
    public static void main(String[] args) {
        Player playerOne = new Player ();
        playerOne.setName ("Fred Flinstone");
        playerOne.setBestTime (7.00);
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
}
