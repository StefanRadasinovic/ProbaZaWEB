package beans;

import enums.Gender;
import enums.Role;

public class User {

    private String username;
    private String password;
    private String name;
    private String surname;
    private Gender gender;
    private String birthDate;
    private Role role;
    private boolean deleted;
    
    public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public User(String username, String password, String name,String surname, Gender gender, String birthDate, Role role) {
        super();
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname=surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.role = role;
        this.deleted=false;
    }

    public User() {}


}