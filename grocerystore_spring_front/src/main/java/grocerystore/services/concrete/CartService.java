package grocerystore.services.concrete;

import grocerystore.domain.models.Grocery_model;
import grocerystore.services.abstracts.ICartService;
import grocerystore.services.exceptions.CartServiceException;
import grocerystore.domain.models.servicemodels.Cart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

/**
 * Created by raxis on 29.12.2016.
 * Класс для работы с корзиной покупок
 */
@Service
public class CartService implements ICartService {
    private static final Logger logger = LoggerFactory.getLogger(CartService.class);

    /**
     * Добавление продукта в корзину по коду продукта
     * @param cart - объект корзина
     * @param groceryModel - продукт
     */
    @Override
    @Secured("ROLE_USER")
    public void addToCart(Cart cart, Grocery_model groceryModel) throws CartServiceException {
        if(groceryModel !=null){
            cart.addItem(groceryModel,1);
        }
        else {
            throw new CartServiceException("Невозможно добавить продукт в корзину!");
        }
    }

    /**
     * Удаление продукта из корзины по коду продукта
     * @param cart Cart of groceries
     * @param groceryModel grocery
     */
    @Override
    @Secured("ROLE_USER")
    public void removeFromCart(Cart cart, Grocery_model groceryModel) throws CartServiceException {
        if(groceryModel !=null){
            cart.removeItem(groceryModel);
        }
        else {
            throw new CartServiceException("Невозможно удалить продукт из корзины!");
        }
    }

}
