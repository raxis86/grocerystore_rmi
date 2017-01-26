package grocerystore.services.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


/**
 * Created by raxis on 13.01.2017.
 */
//@Service("userDetailsService")
//@Service
public class UserDetailsServiceImpl {
    private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    private UserDetailsService userDetailsService;

    public UserDetailsService getUserDetailsService() {
        return userDetailsService;
    }

    public void setUserDetailsService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
}
