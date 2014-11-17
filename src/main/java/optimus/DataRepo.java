package optimus;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by biordanov on 11/12/2014.
 */
@Local
public interface DataRepo
{
    List<Integer> getInterestingPoints();
}