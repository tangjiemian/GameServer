package com.server.game.heros.controls;

import com.server.game.heros.AIHero;
import com.server.net.packet.request.FuckPaket;

public class HeroFightControl {
	
	private AIHero owner;
	
	private FuckPaket  fuckPaket; //����ָ��
	
	private int isAttack = 0; //��ǰ�غ��Ƿ�����������
	
	public HeroFightControl(AIHero owner) {
		this.owner = owner;
	}

	public AIHero getOwner() {
		return owner;
	}


	public FuckPaket getFuckPaket() {
		return fuckPaket;
	}

	public void setFuckPaket(FuckPaket fuckPaket) {
		this.fuckPaket = fuckPaket;
	}

	public int getIsAttack() {
		return isAttack;
	}

	public void setIsAttack(int isAttack) {
		this.isAttack = isAttack;
	}
	
	/**
	 * ��������Ŀ��
	 */
	public void attackTarget() {
		
		
	}
	
	/**
	 * ��Ŀ�깥��
	 */
	public void targetFore() {
		
		
	}
	
	
}
