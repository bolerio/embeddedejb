package optimus;

import javax.naming.*;
import javax.ejb.embeddable.EJBContainer;
import java.util.Properties;

/**
 * Created by biordanov on 11/11/2014.
 */
public class Main
{
    public static void main(String [] argv)
    {
        Properties p = new Properties();
        try
        {
            final Context context = EJBContainer.createEJBContainer(p).getContext();
            MainEJB mainEJB = (MainEJB)context.lookup("java:global/embeddedejb/MainEJB");
            mainEJB.go(new Runnable() {
                public void run()
                {
                    Context initCtx = null;
                    try
                    {
                        Properties p = new Properties();
                        p.put("java.naming.factory.initial", "org.apache.openejb.client.LocalInitialContextFactory");
                        initCtx = new InitialContext(p);
                        DataRepo repo = (DataRepo)initCtx.lookup("java:comp/env/ejb/TheRepo");
                    }
                    catch (NamingException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
    }
}