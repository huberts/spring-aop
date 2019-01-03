package pl.hubiq.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hubiq.aop.springaop.data.Dao2;

@Service
public class Business2 {

    private final Dao2 dao2;

    @Autowired
    public Business2(Dao2 dao2) {
        this.dao2 = dao2;
    }

    public String calculateSomething() {
        //Business logic
        return dao2.retrieveSomething();
    }
}
