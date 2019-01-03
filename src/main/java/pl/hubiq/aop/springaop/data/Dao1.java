package pl.hubiq.aop.springaop.data;

import org.springframework.stereotype.Repository;
import pl.hubiq.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething() {
        return "Dao1";
    }
}
