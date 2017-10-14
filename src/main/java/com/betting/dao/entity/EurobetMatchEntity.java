package com.betting.dao.entity;

public class EurobetMatchEntity {

	private int idMatch;
	private Long time;
	private String match;
	private double homeWins;
	private double draw;
	private double awayWins;
	private double under25;
	private double over25;
	private double goal;
	private double noGoal;

	public void setIdMatch(int idMatch) {
		this.idMatch = idMatch;
	}

	public int getIdMatch() {
		return idMatch;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}

	public double getHomeWins() {
		return homeWins;
	}

	public void setHomeWins(double homeWins) {
		this.homeWins = homeWins;
	}

	public double getDraw() {
		return draw;
	}

	public void setDraw(double draw) {
		this.draw = draw;
	}

	public double getAwayWins() {
		return awayWins;
	}

	public void setAwayWins(double awayWins) {
		this.awayWins = awayWins;
	}

	public double getUnder25() {
		return under25;
	}

	public void setUnder25(double under25) {
		this.under25 = under25;
	}

	public double getOver25() {
		return over25;
	}

	public void setOver25(double over25) {
		this.over25 = over25;
	}

	public double getGoal() {
		return goal;
	}

	public void setGoal(double goal) {
		this.goal = goal;
	}

	public double getNoGoal() {
		return noGoal;
	}

	public void setNoGoal(double noGoal) {
		this.noGoal = noGoal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PartitaEntity [idMatch=");
		builder.append(idMatch);
		builder.append(", time=");
		builder.append(time);
		builder.append(", match=");
		builder.append(match);
		builder.append(", homeWins=");
		builder.append(homeWins);
		builder.append(", draw=");
		builder.append(draw);
		builder.append(", awayWins=");
		builder.append(awayWins);
		builder.append(", under25=");
		builder.append(under25);
		builder.append(", over25=");
		builder.append(over25);
		builder.append(", under35=");
		builder.append(goal);
		builder.append(", noGoal=");
		builder.append(noGoal);
		builder.append("]");
		return builder.toString();
	}

}
