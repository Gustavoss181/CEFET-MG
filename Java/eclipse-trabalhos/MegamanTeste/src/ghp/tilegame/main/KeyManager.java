package ghp.tilegame.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Game.getPlayer().dn = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Game.getPlayer().lt = true;
			Game.getPlayer().moveLeft = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Game.getPlayer().rt = true;
			Game.getPlayer().moveLeft = false;
		}
		//----------------------------------------
		if(e.getKeyCode() == KeyEvent.VK_Z) {
			Game.getPlayer().z = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_X && Game.getPlayer().tempoBala >= 10) {
			Game.getPlayer().handAction = 1;
			Game.getPlayer().shot();
			Game.getPlayer().tempoBala = 0;
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Game.getPlayer().dn = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Game.getPlayer().lt = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Game.getPlayer().rt = false;
		}
		//-----------------------------------------------
		if(e.getKeyCode() == KeyEvent.VK_Z) {
			Game.getPlayer().z = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_X) {
			Game.getPlayer().handAction = 0;
		}
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
}
