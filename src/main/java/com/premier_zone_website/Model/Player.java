package com.premier_zone_website.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pl_data")
public class Player {

    @Id
    @Column(name = "player_name", unique = true)
    private  String player_name;
    private  String nation;
    private String pos;
    private Integer age;
    private Integer mp;
    private Double starts;
    private  Double minutes;
    private Integer gls;
    private Integer ast;
    private Integer ga;
    private Integer pk;
    private Integer crdy;
    private Integer crdr;
    private Double xg;
    private Double xag;
    private String team;

    public Player() {
    }

    public Player(String player_name, String nation, String pos, Integer age, Integer mp, Double starts, Double minutes, Integer gls, Integer ast, Integer ga, Integer pk, Integer crdy, Integer crdr, Double xg, Double xag, String team) {
        this.player_name = player_name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.minutes = minutes;
        this.gls = gls;
        this.ast = ast;
        this.ga = ga;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Double getStarts() {
        return starts;
    }

    public void setStarts(Double starts) {
        this.starts = starts;
    }

    public Double getMinutes() {
        return minutes;
    }

    public void setMinutes(Double minutes) {
        this.minutes = minutes;
    }

    public Integer getGls() {
        return gls;
    }

    public void setGls(Integer gls) {
        this.gls = gls;
    }

    public Integer getAst() {
        return ast;
    }

    public void setAst(Integer ast) {
        this.ast = ast;
    }

    public Integer getGa() {
        return ga;
    }

    public void setGa(Integer ga) {
        this.ga = ga;
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public Integer getCrdy() {
        return crdy;
    }

    public void setCrdy(Integer crdy) {
        this.crdy = crdy;
    }

    public Integer getCrdr() {
        return crdr;
    }

    public void setCrdr(Integer crdr) {
        this.crdr = crdr;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getXag() {
        return xag;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
