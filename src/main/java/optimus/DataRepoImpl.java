package optimus;

import javax.ejb.*;
import java.util.List;

/**
 * Created by biordanov on 11/12/2014.
 */
@Stateless( name = "dataRepo" )
@TransactionManagement( value = TransactionManagementType.CONTAINER )
@TransactionAttribute( value = TransactionAttributeType.REQUIRED )
@LocalBean
public class DataRepoImpl implements DataRepo
{
    @Override
    public List<Integer> getInterestingPoints()
    {
        return null;
    }
}