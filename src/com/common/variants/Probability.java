package com.common.variants;

/**
 * 机率
 * @author pc
 *
 */
public class Probability {

	private String qualitykey;
	
	private int min; //数值下
	
	private int max; //数值上
	
	private int exe; //执行次数
	
	private int up; //增值机率基数

	public String getQualitykey() {
		return qualitykey;
	}

	public void setQualitykey(String qualitykey) {
		this.qualitykey = qualitykey;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getExe() {
		return exe;
	}

	public void setExe(int exe) {
		this.exe = exe;
	}

	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}
	
	
	
}
