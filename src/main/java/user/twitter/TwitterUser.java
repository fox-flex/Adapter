package user.twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor @Getter
public class TwitterUser {
    private String userMail, country;
    private Date getLastActiveTime;
}
