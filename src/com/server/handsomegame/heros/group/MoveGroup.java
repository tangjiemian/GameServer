
package com.server.handsomegame.heros.group;

import java.util.ArrayList;
import java.util.List;

import com.server.handsomegame.heros.AHero;

/**
 * 移动组
 * @author pc
 *
 */
public class MoveGroup {
	
	public static final byte MAXNUMBER = 5;
	
	private AHero teamer;
	
	private List<AHero> list;
	
	public AHero getTeamer() {
		return teamer;
	}
	
	public void setTeamer(AHero teamer) {
		this.teamer = teamer;
	}
	
	public List<AHero> getList() {
		return list;
	}
	
	public void setList(List<AHero> list) {
		this.list = list;
	}
	
	public MoveGroup(AHero teamer) {
		this.teamer = teamer;
		if(null == list) {
			list = new ArrayList<AHero>();
		}
		list.add(teamer);
	}
	
	/**
	 * 添加队员
	 * @param member
	 * @return
	 */
	public boolean addMember(AHero member) {
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
	public boolean removeMember(AHero member) {
		return list.remove(member);
	}
	
	/**
	 * 改变队长
	 * @param member
	 * @return
	 */
	public boolean changeTeamer(AHero member) {
		if(list.contains(member) && member!= teamer) {
			this.teamer = member;
			return true;
		}
		return false;
	}

}
