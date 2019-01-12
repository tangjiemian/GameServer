package com.server.handsomegame.heros.controls;

import com.common.variants.Point;
import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.scenes.CScene;
import com.server.handsomegame.scenes.FScene;
import com.server.handsomegame.scenes.NScene;

public class HeroGameSceneControl {
	
	private AHero owner;
	
	private NScene nScene; // ��ǰ��ͼ
	
	private CScene cScene; // ��ǰ����
	
	private FScene fScene; // ��ǰս��
	
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
	 * ����ͨ�ó�������
	 * @param x
	 * @param y
	 */
	public void setNscenePoint(int x,int y) {
		
	}
	
	/**
	 * ���ø�����������
	 * @param x
	 * @param y
	 */
	public void setCscenePoint(int x,int y) {
		
	}
	
}
