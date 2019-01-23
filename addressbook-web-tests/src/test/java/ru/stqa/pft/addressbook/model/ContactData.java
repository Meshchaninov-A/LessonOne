package ru.stqa.pft.addressbook.model;

import java.io.File;
import java.util.Objects;

public class ContactData {
  private int id = Integer.MAX_VALUE;
  private String name;
  private String surname;
  private String nickname;
  private String company;
  private String city;
  private String email;
  private String group;
  private String homeTel;
  private String workTel;
  private String mobileTel;
  private String allphones;
  private File pictire;


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData contactData = (ContactData) o;
    return id == contactData.id &&
            Objects.equals(name, contactData.name) &&
            Objects.equals(surname, contactData.surname) &&
            Objects.equals(city, contactData.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, city);
  }

  public ContactData withName(String name) {
    this.name = name;
    return this;
  }

  public String getHomeTel() {
    return homeTel;
  }

  public ContactData withHomeTel(String homeTel) {
    this.homeTel = homeTel;
    return this;
  }

  public String getWorkTel() {
    return workTel;
  }

  public ContactData withWorkTel(String workTel) {
    this.workTel = workTel;
    return this;
  }

  public String getMobileTel() {
    return mobileTel;
  }

  public ContactData withMobileTel(String mobileTel) {
    this.mobileTel = mobileTel;
    return this;
  }

  public ContactData withSurname(String surname) {
    this.surname = surname;
    return this;
  }

  public ContactData withNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  public ContactData withCompany(String company) {
    this.company = company;
    return this;
  }

  public ContactData withCity(String city) {
    this.city = city;
    return this;
  }

  public ContactData withEmail(String email) {
    this.email = email;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public File getPictire() {
    return pictire;
  }

  public ContactData withPictire(File pictire) {
    this.pictire = pictire;
    return this;
  }


  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", city='" + city + '\'' +
            '}';
  }


  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getCity() {
    return city;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }

  public ContactData withAllphones(String allphones) {
    this.allphones = allphones;
    return this;
  }

  public String getAllphones() {
    return allphones;
  }
}
