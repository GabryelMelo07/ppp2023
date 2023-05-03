package apresentacao;

import negocio.CommandBtnAFifa23;
import negocio.CommandBtnAStreetFighter;
import negocio.CommandBtnBFifa23;
import negocio.CommandBtnBStreetFighter;
import negocio.Fifa23;
import negocio.Joystick;
import negocio.StreetFighter;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("================ FIFA 23 ================");
        Joystick joystick1 = new Joystick();
        joystick1.setBotao(0, new CommandBtnAFifa23(new Fifa23())); // Define o botão A no slot 0 (Jogo FIFA23)
        joystick1.setBotao(1, new CommandBtnBFifa23(new Fifa23())); // Define o botão B no slot 1
        
        joystick1.pressOnButton(0); // Jogador começa a correr.
        joystick1.pressOffButton(0); // Jogador para de correr.
        
        joystick1.pressOnButton(1); // Jogador toca a bola.
        joystick1.pressOffButton(1); // Jogador termina de tocar a bola.

        
        System.out.println("================ STREET FIGHTER ================");
        Joystick joystick2 = new Joystick();
        joystick2.setBotao(0, new CommandBtnAStreetFighter(new StreetFighter())); // Jogo StreetFighter
        joystick2.setBotao(1, new CommandBtnBStreetFighter(new StreetFighter()));

        joystick2.pressOnButton(0); // Personagem executa um chute alto.
        joystick2.pressOffButton(0); // Personagem terminou de executar um chute alto.
        
        joystick2.pressOnButton(1); // Personagem executa um soco.
        joystick2.pressOffButton(1); // Personagem terminou de executar um soco.

    }

}