package service;

import model.Persister;
import model.User;

public class PersisterService {

    Persister persister;

    public Persister createPersister(User user){
        this.persister = new Persister(user);
        return persister;
    }

    public void save(){
        System.out.println("Save user: " + persister.getUser().getName());
    }
}