package com.server.commonutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.server.handsomegame.heros.AHero;
import com.server.handsomegame.heros.group.FightGroup;

public class GameFightGroupUtils {
	
	/**
	 * 单个队伍敏序
	 * @param group
	 */
	public static  void getGroupOrderBySp(FightGroup group) {
		List<AHero> tempList  = new ArrayList<AHero>();
		tempList.addAll(group.getList());
		Collections.sort(tempList, new Comparator<AHero>() {
            public int compare(AHero hero0, AHero hero1) {
                int hits0 = hero0.getHeroBeanControl().getHeroButeBean().get_sp();
                int hits1 = hero1.getHeroBeanControl().getHeroButeBean().get_sp();
                if (hits1 > hits0) {
                    return 1;
                } else if (hits1 == hits0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
	}
	
	/**
	 * 两个队伍敏序
	 * @param groupone
	 * @param grouptwo
	 * @return
	 */
	public  static List<AHero> getFightOrderBySp(FightGroup groupone,FightGroup grouptwo) {
		List<AHero> tempList  = new ArrayList<AHero>();
		tempList.addAll(groupone.getList());
		tempList.addAll(grouptwo.getList());
		Collections.sort(tempList, new Comparator<AHero>() {
            public int compare(AHero hero0, AHero hero1) {
                int hits0 = hero0.getHeroBeanControl().getHeroButeBean().get_sp();
                int hits1 = hero1.getHeroBeanControl().getHeroButeBean().get_sp();
                if (hits1 > hits0) {
                    return 1;
                } else if (hits1 == hits0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
		return tempList;
	}
	
	/**
	 * 找到当前未使用技能敏序最快的单位
	 * @param group0
	 * @param group1
	 * @return
	 */
	public static AHero getFightCurrentAction(FightGroup group0,FightGroup group1) {
		List<AHero> tempList  = new ArrayList<AHero>();
		tempList.addAll(group0.getList());
		tempList.addAll(group1.getList());
		AHero dataHero = null;
		AHero tempHero = null;
		byte first = 0;
		for(int i=0;i<tempList.size();i++) {
			tempHero = tempList.get(i);
			if(null != tempHero && tempHero.getHeroFightControl().getIsAttack()==0) {
				if(first==0) {
					dataHero = tempHero;
				}else {
					if(tempHero.getHeroBeanControl().getHeroButeBean().getSp() > dataHero.getHeroBeanControl().getHeroButeBean().getSp()) {
						dataHero = tempHero;
					}
				}
			}	
		}
		return dataHero;
	}
	
	/**
	 * 获取指定目标左右相连的第一个单位
	 * @param group
	 * @param hero
	 * @return
	 */
	public  static List<AHero> getDoubleAtBetween(FightGroup group,AHero hero){
		List<AHero> tempList = new ArrayList<AHero>();
		if(hero.getHeroGroupControl().getAtIndex()==0) {
			tempList.add(group.getList().get(1));
		}else if(hero.getHeroGroupControl().getAtIndex()==1) {
			tempList.add(group.getList().get(0));
			tempList.add(group.getList().get(2));
		}else if(hero.getHeroGroupControl().getAtIndex()==2) {
			tempList.add(group.getList().get(1));
			tempList.add(group.getList().get(3));
		}else if(hero.getHeroGroupControl().getAtIndex()==3) {
			tempList.add(group.getList().get(2));
			tempList.add(group.getList().get(4));
		}else if(hero.getHeroGroupControl().getAtIndex()==4) {
			tempList.add(group.getList().get(3));
		}
		return tempList;
	}

}
