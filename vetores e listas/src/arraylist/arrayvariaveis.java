package arraylist;

import java.util.Scanner;

public class arrayvariaveis {

    public static void listas() {
        String[] titulos_rpgs = new String[]{
                "\"The Witcher 3: Wild Hunt\"\n" +
                        "\"Final Fantasy VII\"\n" +
                        "\"Chrono Trigger\"\n" +
                        "\"Persona 5 Royal\"\n" +
                        "\"The Elder Scrolls V: Skyrim\"\n" +
                        "\"Dark Souls\"\n" +
                        "\"Mass Effect 2\"\n" +
                        "\"Dragon Quest XI\"\n" +
                        "\"Undertale\"\n" +
                        "\"Fire Emblem: Three Houses\"\n" +
                        "\"Kingdom Hearts II\"\n" +
                        "\"Divinity: Original Sin 2\"\n" +
                        "\"Xenogears\"\n" +
                        "\"Planescape: Torment\"\n" +
                        "\"Shin Megami Tensei III: Nocturne\"\n" +
                        "\"Bloodborne\"\n" +
                        "\"Pokemon HeartGold/SoulSilver\"\n" +
                        "\"Baldur's Gate II: Shadows of Amn\"\n" +
                        "\"Suikoden II\"\n" +
                        "\"Final Fantasy VI\"\n" +
                        "\"Disco Elysium\"\n" +
                        "\"Ni no Kuni: Wrath of the White Witch\"\n" +
                        "\"Octopath Traveler\"\n" +
                        "\"Persona 4 Golden\"\n" +
                        "\"Chrono Cross\"\n" +
                        "\"Tales of Berseria\"\n" +
                        "\"Star Ocean: The Second Story\"\n" +
                        "\"The Legend of Heroes: Trails in the Sky\"\n" +
                        "\"Ys VIII: Lacrimosa of Dana\"\n" +
                        "\"EarthBound\"\n" +
                        "\"Dragon Age: Origins\"\n" +
                        "\"Secret of Mana\"\n" +
                        "\"Fallout: New Vegas\"\n" +
                        "\"Valkyria Chronicles\"\n" +
                        "\"Xenoblade Chronicles\"\n" +
                        "\"Final Fantasy XIV Online\"\n" +
                        "\"Grandia II\"\n" +
                        "\"Fire Emblem: Awakening\"\n" +
                        "\"Tales of Symphonia\"\n" +
                        "\"Shadow Hearts: Covenant\"\n" +
                        "\"The Legend of Zelda: Breath of the Wild\"\n" +
                        "\"Monster Hunter: World\"\n" +
                        "\"South Park: The Stick of Truth\"\n" +
                        "\"Cyberpunk 2077\"\n" +
                        "\"The Outer Worlds\"\n" +
                        "\"Pillars of Eternity II: Deadfire\"\n" +
                        "\"Secret of Evermore\"\n" +
                        "\"Blue Reflection\"\n" +
                        "\"The Banner Saga\"\n" +
                        "\"Persona 3 FES\""
        };

        String[] titulos_animes = new String[]{
                "\"Death Note\"\n" +
                        "\"Naruto\"\n" +
                        "\"One Piece\"\n" +
                        "\"Dragon Ball Z\"\n" +
                        "\"Attack on Titan\"\n" +
                        "\"Fullmetal Alchemist: Brotherhood\"\n" +
                        "\"Naruto: Shippuden\"\n" +
                        "\"Sword Art Online\"\n" +
                        "\"One Punch Man\"\n" +
                        "\"Tokyo Ghoul\"\n" +
                        "\"My Hero Academia\"\n" +
                        "\"Hunter x Hunter\"\n" +
                        "\"Fairy Tail\"\n" +
                        "\"Bleach\"\n" +
                        "\"Dragon Ball\"\n" +
                        "\"Naruto\"\n" +
                        "\"Naruto: Shippuden\"\n" +
                        "\"One Piece\"\n" +
                        "\"Attack on Titan\"\n" +
                        "\"Death Note\"\n" +
                        "\"Sword Art Online\"\n" +
                        "\"Tokyo Ghoul\"\n" +
                        "\"One Punch Man\"\n" +
                        "\"My Hero Academia\"\n" +
                        "\"Hunter x Hunter\"\n" +
                        "\"Fairy Tail\"\n" +
                        "\"Bleach\"\n" +
                        "\"Dragon Ball\"\n" +
                        "\"Naruto\"\n" +
                        "\"Naruto: Shippuden\"\n" +
                        "\"One Piece\"\n" +
                        "\"Attack on Titan\"\n" +
                        "\"Death Note\"\n" +
                        "\"Sword Art Online\"\n" +
                        "\"Tokyo Ghoul\"\n" +
                        "\"One Punch Man\"\n" +
                        "\"My Hero Academia\"\n" +
                        "\"Hunter x Hunter\"\n" +
                        "\"Fairy Tail\"\n" +
                        "\"Bleach\"\n" +
                        "\"Dragon Ball\"\n" +
                        "\"Naruto\"\n" +
                        "\"Naruto: Shippuden\"\n" +
                        "\"One Piece\"\n" +
                        "\"Attack on Titan\"\n" +
                        "\"Death Note\"\n" +
                        "\"Sword Art Online\"\n" +
                        "\"Tokyo Ghoul\"\n" +
                        "\"One Punch Man\"\n" +
                        "\"My Hero Academia\"\n" +
                        "\"Hunter x Hunter\"\n" +
                        "\"Fairy Tail\"\n" +
                        "\"Bleach\"\n" +
                        "\"Dragon ball\"\n"

        };
        System.out.println("por favor digite 1 para lista de animes ou 2 para rpgs");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();

        switch (valor) {
            case 1:
                for (int a = 0; a < titulos_rpgs.length; a++) {
                    System.out.println(titulos_rpgs[a]);
                }
                break;
            case 2:
                for (int b = 0; b < titulos_animes.length; b++) {
                    System.out.println(titulos_animes[b]);
                }
                break;

        }

    }

}
