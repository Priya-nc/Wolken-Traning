package com.wolken.amazon.entity;


	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.NamedQueries;
	import javax.persistence.NamedQuery;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	import lombok.ToString;

	@Getter
	@Setter
	@Entity
	@Table(name="amazon")
	@ToString
	@NoArgsConstructor
	@AllArgsConstructor
	@NamedQueries({
		@NamedQuery(name="getbyemail", query="from LoginEntity where email=:email"),
		@NamedQuery(name="updatePassword",query="update LoginEntity set password=:password where email=:email")
	})
	public class LoginEntity {
		@Id
		private String email;
		private String password;
	}

