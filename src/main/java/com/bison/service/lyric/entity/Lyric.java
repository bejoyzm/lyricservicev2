package com.bison.service.lyric.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lyric {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String songName;
	private String chorus;
	private ArrayList<String> stanza;
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getChorus() {
		return chorus;
	}
	public void setChorus(String chorus) {
		this.chorus = chorus;
	}
	public ArrayList<String> getStanza() {
		return stanza;
	}
	public void setStanza(ArrayList<String> stanza) {
		this.stanza = stanza;
	}

	
}
