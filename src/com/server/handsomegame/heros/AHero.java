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
	
	private HeroBeanControl heroBeanControl = new HeroBeanControl(this); //属性控制器
	
	private HeroEquipmentControl heroEquipmentControl = new HeroEquipmentControl(this);//装备控制器
	
	private HeroMagicControl heroMagicControl = new HeroMagicControl(this);//技能控制器
	
	private HeroGameSceneControl heroGameSceneControl = new HeroGameSceneControl(this); //地图控制器

	private HeroGroupControl heroGroupControl = new HeroGroupControl(this); //组队控制器
	
	private HeroFightControl heroFightControl = new HeroFightControl(this); //战斗控制器
	
	private HeroEventControl heroEventControl = new HeroEventControl(this); //事件管理器
	
	private HeroMessageControl heroMessageControl = new HeroMessageControl(this); //消息管理器
	
	
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
