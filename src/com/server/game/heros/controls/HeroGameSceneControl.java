package com.server.game.heros.controls;

import com.server.game.beans.Point;
import com.server.game.heros.AIHero;
import com.server.game.scenes.CScene;
import com.server.game.scenes.FScene;
import com.server.game.scenes.NScene;

public class HeroGameSceneControl {
	
	private AIHero owner;
	
	private NScene nScene; // 当前地图
	
	private CScene cScene; // 当前副本
	
	private FScene fScene; // 当前战斗
	
	
	private Point nPoint;
	
	private Point cPoint;	
	
	public HeroGameSceneControl(AIHero owner) {
		this.owner = owner;
	}

	
	public AIHero getOwner() {
		return owner;
	}




	public NScene getnScene() {
		return nScene;
	}

	public void setnScene(NScene nScene) {
		this.nScene = nScene;
	}

	public CScene getcScene() {
		return cScene;
	}

	public void setcScene(CScene cScene) {
		this.cScene = cScene;
	}

	public FScene getfScene() {
		return fScene;
	}

	public void setfScene(FScene fScene) {
		this.fScene = fScene;
	}
	
	
}
