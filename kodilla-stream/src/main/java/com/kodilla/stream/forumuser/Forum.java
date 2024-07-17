package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "Janusz", 'M', "11/04/2020", 18));
        listOfUsers.add(new ForumUser(2, "Matiusz", 'M', "11/04/2021", 180));
        listOfUsers.add(new ForumUser(3, "Daniel", 'M', "11/04/1990", 11));
        listOfUsers.add(new ForumUser(4, "Michał", 'M', "12/05/1987", 182));
        listOfUsers.add(new ForumUser(5, "Kasia", 'F', "11/04/2022", 2));
        listOfUsers.add(new ForumUser(6, "Maz", 'M', "11/04/2004", 3));
        listOfUsers.add(new ForumUser(7, "Janusz", 'M', "11/02/2000", 0));
        listOfUsers.add(new ForumUser(8, "Mateusz", 'M', "11/01/2010", 9));
        listOfUsers.add(new ForumUser(9, "Czesław", 'M', "11/09/2020", 13));
        listOfUsers.add(new ForumUser(10, "Agata", 'F', "11/02/2020", 11));
    }
        public List<ForumUser> getListOfUsers() {
        return new ArrayList<>(listOfUsers);
        }

    }

