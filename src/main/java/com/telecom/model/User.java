package com.telecom.model;

/*@Entity
@Table(name = "user")*/
public class User {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO)
	 * 
	 * @Column(name="id")
	 */private Long id;

	/*
	 * @Column(name="name")
	 */private String name;

	/*
	 * @Column(name="mobile")
	 */private Long mobile;

	/*
	 * @Column(name="password")
	 */private String password;

}
