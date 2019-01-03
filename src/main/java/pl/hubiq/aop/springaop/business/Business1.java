package pl.hubiq.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hubiq.aop.springaop.data.Dao1;

@Service
public class Business1 {

    private final Dao1 dao1;

    @Autowired
    public Business1(Dao1 dao1) {
        this.dao1 = dao1;
    }

    public String calculateSomething() {
        //Business logic
        return dao1.retrieveSomething();
    }
}
