package com.server.handsomegame.heros.controls;

import com.server.calendarenet.packet.request.FuckPaket;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.heros.group.GameFight;

public class HeroFightControl {
	
	private AHero owner;
	
	private GameFight gameFight;
	
	private FuckPaket  fuckPaket; //����ָ��
	
	private int isAttack = 0; //��ǰ�غ��Ƿ�����������
	
	public HeroFightControl(AHero owner) {
		this.owner = owner;
	}

	public AHero getOwner() {
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

	public GameFight getGameFight() {
		return gameFight;
	}

	public void setGameFight(GameFight gameFight) {
		this.gameFight = gameFight;
	}
	
	/**
	 * ����Ŀ��
	 * @param gameFight
	 */
	public void  fuckTarget(GameFight gameFight) {
		owner.getHeroGroupControl().crateFightGroup();
		for(AHero hero : owner.getHeroGroupControl().getFightGroup().getList()) {
			hero.getHeroFightControl().bindCruentFight(gameFight);
		}
	}
	
	
	/**
	 * ��Ŀ�깥��
	 * @param gameFight
	 */
	public void  forceFuckTarget(GameFight gameFight) {
		owner.getHeroGroupControl().crateFightGroup();
		for(AHero hero : owner.getHeroGroupControl().getFightGroup().getList()) {
			hero.getHeroFightControl().bindCruentFight(gameFight);
		}
	}
	
	/**
	 * ������ǰս��
	 * @param gameFight
	 */
	public void bindCruentFight(GameFight gameFight) {
		this.gameFight  = gameFight;
	}
	
	
	
}
