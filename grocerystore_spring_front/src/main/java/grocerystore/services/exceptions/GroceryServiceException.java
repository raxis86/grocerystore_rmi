package grocerystore.services.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Created by raxis on 06.01.2017.
 */
public class GroceryServiceException extends ServiceException implements Serializable{
    private static final Logger logger = LoggerFactory.getLogger(GroceryServiceException.class);

    public GroceryServiceException(String message) {
        super(message);
    }

    public GroceryServiceException(String message, Exception e) {
        super(message, e);
    }
}
