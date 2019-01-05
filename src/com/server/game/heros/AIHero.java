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
	
	private HeroBeanControl heroBeanControl = new HeroBeanControl(this); //属性控制器
	
	private HeroEquipmentControl heroEquipmentControl = new HeroEquipmentControl(this);//装备控制器
	
	private HeroSkillControl heroSkillControl = new HeroSkillControl(this);//技能控制器
	
	private HeroGameSceneControl heroGameSceneControl = new HeroGameSceneControl(this); //地图控制器

	private HeroGroupControl heroGroupControl = new HeroGroupControl(this); //组队控制器
	
	private HeroFightControl heroFightControl = new HeroFightControl(this); //战斗控制器
	
	private HeroEventControl heroEventControl = new HeroEventControl(this); //事件管理器
	
	private HeroMessageControl heroMessageControl = new HeroMessageControl(this); //消息管理器
	
	
	
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
