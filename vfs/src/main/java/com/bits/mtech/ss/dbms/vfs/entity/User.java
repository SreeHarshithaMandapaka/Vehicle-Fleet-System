package com.bits.mtech.ss.dbms.vfs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	private @Id @GeneratedValue Long id;
}
