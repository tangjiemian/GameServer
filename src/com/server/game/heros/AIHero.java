package com.server.game.heros;

import com.server.game.heros.controls.HeroBeanControl;
import com.server.game.heros.controls.HeroEquipmentControl;
import com.server.game.heros.controls.HeroEventControl;
import com.server.game.heros.controls.HeroFightControl;
import com.server.game.heros.controls.HeroGameSceneControl;
import com.server.game.heros.controls.HeroGroupControl;
import com.server.game.heros.controls.HeroMessageControl;
import com.server.game.heros.controls.HeroSkillControl;

public abstract class AIHero {
	
	private String ids;
	
	private HeroBeanControl heroBeanControl = new HeroBeanControl(this); //���Կ�����
	
	private HeroEquipmentControl heroEquipmentControl = new HeroEquipmentControl(this);//װ��������
	
	private HeroSkillControl heroSkillControl = new HeroSkillControl(this);//���ܿ�����
	
	private HeroGameSceneControl heroGameSceneControl = new HeroGameSceneControl(this); //��ͼ������

	private HeroGroupControl heroGroupControl = new HeroGroupControl(this); //��ӿ�����
	
	private HeroFightControl heroFightControl = new HeroFightControl(this); //ս��������
	
	private HeroEventControl heroEventControl = new HeroEventControl(this); //�¼�������
	
	private HeroMessageControl heroMessageControl = new HeroMessageControl(this); //��Ϣ������
	
	
	
	public String getIds() {
		return ids;
	}


	public HeroBeanControl getHeroBeanControl() {
		return heroBeanControl;
	}


	public HeroSkillControl getHeroSkillControl() {
		return heroSkillControl;
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
