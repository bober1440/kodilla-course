package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int postQuantity;



    public ForumUser(final int id, final String username, final char sex, final String birthdayDate,
                     final int postQuantity) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthdayDate = LocalDate.parse (birthdayDate, dateTimeFormatter);
        this.postQuantity = postQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postQuantity=" + postQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id && sex == forumUser.sex &&
                postQuantity == forumUser.postQuantity && username.equals(forumUser.username)
                && birthdayDate.equals(forumUser.birthdayDate);
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + username.hashCode();
        result = 31 * result + sex;
        result = 31 * result + birthdayDate.hashCode();
        result = 31 * result + postQuantity;
        return result;
    }
}
