package com.server.handsomegame.heros;

import com.server.handsomegame.heros.controls.HeroBeanControl;
import com.server.handsomegame.heros.controls.HeroEquipmentControl;
import com.server.handsomegame.heros.controls.HeroEventControl;
import com.server.handsomegame.heros.controls.HeroFightControl;
import com.server.handsomegame.heros.controls.HeroGameSceneControl;
import com.server.handsomegame.heros.controls.HeroGroupControl;
import com.server.handsomegame.heros.controls.HeroMagicControl;
import com.server.handsomegame.heros.controls.HeroMessageControl;

public abstract class AHero {
	

	
	private String orid;
	
	private HeroBeanControl heroBeanControl = new HeroBeanControl(this); //���Կ�����
	
	private HeroEquipmentControl heroEquipmentControl = new HeroEquipmentControl(this);//װ��������
	
	private HeroMagicControl heroMagicControl = new HeroMagicControl(this);//���ܿ�����
	
	private HeroGameSceneControl heroGameSceneControl = new HeroGameSceneControl(this); //��ͼ������

	private HeroGroupControl heroGroupControl = new HeroGroupControl(this); //��ӿ�����
	
	private HeroFightControl heroFightControl = new HeroFightControl(this); //ս��������
	
	private HeroEventControl heroEventControl = new HeroEventControl(this); //�¼�������
	
	private HeroMessageControl heroMessageControl = new HeroMessageControl(this); //��Ϣ������
	
	
	public String getOrid() {
		return orid;
	}


	public void setOrid(String orid) {
		this.orid = orid;
	}


	public HeroBeanControl getHeroBeanControl() {
		return heroBeanControl;
	}


	public HeroMagicControl getHeroMagicControl() {
		return heroMagicControl;
	}


	public HeroEquipmentControl getHeroEquipmentControl() {
		return heroEquipmentControl;
	}

	
	
	public HeroGameSceneControl getHeroGameSceneControl() {
		return heroGameSceneControl;
	}


	public HeroGroupControl getHeroGroupControl() {
		return heroGroupControl;
	}


	public HeroFightControl getHeroFightControl() {
		return heroFightControl;
	}


	public HeroEventControl getHeroEventControl() {
		return heroEventControl;
	}


	public HeroMessageControl getHeroMessageControl() {
		return heroMessageControl;
	}


	
	
	
}
