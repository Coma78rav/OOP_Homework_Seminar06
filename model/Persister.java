package model;

public class Persister{
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public User getUser(){
        return user;
    }
}