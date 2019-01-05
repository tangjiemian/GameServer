package com.server.game.heros.controls;

import com.server.game.heros.AIHero;
import com.server.net.packet.request.FuckPaket;

public class HeroFightControl {
	
	private AIHero owner;
	
	private FuckPaket  fuckPaket; //攻击指令
	
	private int isAttack = 0; //当前回合是否已主动攻击
	
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
	 * 主动攻击目标
	 */
	public void attackTarget() {
		
		
	}
	
	/**
	 * 被目标攻击
	 */
	public void targetFore() {
		
		
	}
	
	
}
