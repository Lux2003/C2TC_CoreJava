package com.tnsif.dayfour;

public class Person {
	public String personName;
	public int personAge;
	public String personCity;
	public String getPersonName() 
	{ 
		return personName; 
		}
	public void setPersonName(String personName)
	{
		this.personName = personName;
		}
public int getPersonAge() {
		return personAge;
		}
public void setPersonAge(int personAge)
{ 
	this.personAge = personAge;
	}
public String getPersonCity()
{
	return personCity; 
	} 
public void setPersonCity(String personCity)
{
this.personCity = personCity;
}
public Person()
{
	System.out.println("Default Constructor");
	}
public Person(String personName, int personAge, String personCity)
{
	System.out.println("Parameterized Constructor");
	this.personName = personName;
	this.personAge = personAge;
		this.personCity = personCity; 
		}
}


