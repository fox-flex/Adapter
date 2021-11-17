package user.adapted_user;

import lombok.AllArgsConstructor;
import user.facebook.FacebookUser;

import java.util.Date;

@AllArgsConstructor
public class AdaptedFacebookUser implements User {
    private final FacebookUser user;

    public AdaptedFacebookUser(String email, String userCountry, Date userActiveTime) {
        this.user = new FacebookUser(email, userCountry, userActiveTime);
    }

    @Override
    public String getEmail() {
        return this.user.getEmail();
    }

    @Override
    public String getCountry() {
        return this.user.getUserCountry();
    }

    @Override
    public Date getTime() {
        return this.user.getUserActiveTime();
    }
}
