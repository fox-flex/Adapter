package user.adapted_user;

import user.twitter.TwitterUser;

import java.util.Date;

public class AdaptedTwitterUser implements User {
    private final TwitterUser user;

    public AdaptedTwitterUser(String email, String userCountry, Date userActiveTime) {
        this.user = new TwitterUser(email, userCountry, userActiveTime);
    }

    @Override
    public String getEmail() {
        return this.user.getUserMail();
    }

    @Override
    public String getCountry() {
        return this.user.getCountry();
    }

    @Override
    public Date getTime() {
        return this.user.getGetLastActiveTime();
    }
}

