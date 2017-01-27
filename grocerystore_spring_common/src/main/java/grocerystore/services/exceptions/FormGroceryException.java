package grocerystore.services.exceptions;

import grocerystore.domain.models.servicemodels.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by raxis on 06.01.2017.
 */
public class FormGroceryException extends BusinessLogicException {
    private static final Logger logger = LoggerFactory.getLogger(FormGroceryException.class);

    public FormGroceryException(Message message) {
        super(message);
    }
}
