package com.server.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.server.game.heros.AIHero;
import com.server.game.heros.group.FGroup;

public class FGroupUtils {
	
	/**
	 * 单个队伍敏序
	 * @param group
	 */
	public  void getGroupOrderBySp(FGroup group) {
		List<AIHero> tempList  = new ArrayList<AIHero>();
		tempList.addAll(group.getList());
		Collections.sort(tempList, new Comparator<AIHero>() {
            public int compare(AIHero hero0, AIHero hero1) {
                int hits0 = hero0.getHeroControl().getHeroButeBean().get_sp();
                int hits1 = hero1.getHeroControl().getHeroButeBean().get_sp();
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
	public  List<AIHero> getFightOrderBySp(FGroup groupone,FGroup grouptwo) {
		List<AIHero> tempList  = new ArrayList<AIHero>();
		tempList.addAll(groupone.getList());
		tempList.addAll(grouptwo.getList());
		Collections.sort(tempList, new Comparator<AIHero>() {
            public int compare(AIHero hero0, AIHero hero1) {
                int hits0 = hero0.getHeroControl().getHeroButeBean().get_sp();
                int hits1 = hero1.getHeroControl().getHeroButeBean().get_sp();
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
	public AIHero getFightCurrentAction(FGroup group0,FGroup group1) {
		List<AIHero> tempList  = new ArrayList<AIHero>();
		tempList.addAll(group0.getList());
		tempList.addAll(group1.getList());
		AIHero dataHero = null;
		AIHero tempHero = null;
		byte first = 0;
		for(int i=0;i<tempList.size();i++) {
			tempHero = tempList.get(i);
			if(null != tempHero && tempHero.getIsAttack() ==0) {
				if(first==0) {
					dataHero = tempHero;
				}else {
					if(tempHero.getHeroControl().getHeroButeBean().getSp() > dataHero.getHeroControl().getHeroButeBean().getSp()) {
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
	public  List<AIHero> getDoubleAtBetween(FGroup group,AIHero hero){
		List<AIHero> tempList = new ArrayList<AIHero>();
		if(hero.getAtIndex()==0) {
			tempList.add(group.getList().get(1));
		}else if(hero.getAtIndex()==1) {
			tempList.add(group.getList().get(0));
			tempList.add(group.getList().get(2));
		}else if(hero.getAtIndex()==2) {
			tempList.add(group.getList().get(1));
			tempList.add(group.getList().get(3));
		}else if(hero.getAtIndex()==3) {
			tempList.add(group.getList().get(2));
			tempList.add(group.getList().get(4));
		}else if(hero.getAtIndex()==4) {
			tempList.add(group.getList().get(3));
		}
		return tempList;
	}

}
