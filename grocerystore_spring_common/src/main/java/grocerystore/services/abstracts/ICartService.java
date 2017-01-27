package grocerystore.services.abstracts;

import grocerystore.domain.models.Grocery_model;
import grocerystore.services.exceptions.CartServiceException;
import grocerystore.domain.models.servicemodels.Cart;

/**
 * Created by raxis on 29.12.2016.
 */
public interface ICartService {
    public void addToCart(Cart cart, Grocery_model groceryModel) throws CartServiceException;
    public void removeFromCart(Cart cart, Grocery_model groceryModel) throws CartServiceException;
}
