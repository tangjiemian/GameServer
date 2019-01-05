
package com.server.game.heros.group;

import java.util.ArrayList;
import java.util.List;

import com.server.game.heros.AIHero;

public class MoveGroup {
	
	public static final byte MAXNUMBER = 5;
	
	private AIHero teamer;
	
	private List<AIHero> list;
	
	public AIHero getTeamer() {
		return teamer;
	}
	
	public void setTeamer(AIHero teamer) {
		this.teamer = teamer;
	}
	
	public List<AIHero> getList() {
		return list;
	}
	
	public void setList(List<AIHero> list) {
		this.list = list;
	}
	
	public MoveGroup(AIHero teamer) {
		this.teamer = teamer;
		if(null == list) {
			list = new ArrayList<AIHero>();
		}
		list.add(teamer);
	}
	
	/**
	 * 添加队员
	 * @param member
	 * @return
	 */
	public boolean addMember(AIHero member) {
		if(list.size()<MAXNUMBER && !list.contains(member)) {
			list.add(member);
			return true;
		}
		return false;
	}
	
	/**
	 * 删除队员
	 * @param member
	 * @return
	 */
	public boolean removeMember(AIHero member) {
		return list.remove(member);
	}
	
	/**
	 * 改变队长
	 * @param member
	 * @return
	 */
	public boolean changeTeamer(AIHero member) {
		if(list.contains(member) && member!= teamer) {
			this.teamer = member;
			return true;
		}
		return false;
	}

}
