package com.server.handsomegame.heros.controls;

import com.common.variants.Point;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.scenes.CScene;
import com.server.handsomegame.scenes.FScene;
import com.server.handsomegame.scenes.NScene;

public class HeroGameSceneControl {
	
	private AHero owner;
	
	private NScene nScene; // 当前地图
	
	private CScene cScene; // 当前副本
	
	private FScene fScene; // 当前战斗
	
	private Point nPoint;
	
	private Point cPoint;	
	
	public AHero getOwner() {
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
	
	public Point getnPoint() {
		return nPoint;
	}

	public Point getcPoint() {
		return cPoint;
	}

	public HeroGameSceneControl(AHero owner) {
		this.owner = owner;
	}

	/**
	 * 设置通用场景坐标
	 * @param x
	 * @param y
	 */
	public void setNscenePoint(int x,int y) {
		
	}
	
	/**
	 * 设置副本场景坐标
	 * @param x
	 * @param y
	 */
	public void setCscenePoint(int x,int y) {
		
	}
	
}
