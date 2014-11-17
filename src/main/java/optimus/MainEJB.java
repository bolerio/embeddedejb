package optimus;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 * Created by biordanov on 11/17/2014.
 */
@Singleton @Lock(LockType.READ)
public class MainEJB
{
    public void go(final Runnable runme)
    {
        runme.run();
    }
}
