package weiboclient4j.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;

/**
 * @author Hover Ruan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RateLimitStatus {
    private int ipLimit;
    private String limitTimeUnit;
    private int remainingIpHits;
    private int remainingUserHits;
    private Date resetTime;
    private int resetTimeInSeconds;
    private int userLimit;
    private int apiRateLimits;

    public int getIpLimit() {
        return ipLimit;
    }

    public void setIpLimit(int ipLimit) {
        this.ipLimit = ipLimit;
    }

    public String getLimitTimeUnit() {
        return limitTimeUnit;
    }

    public void setLimitTimeUnit(String limitTimeUnit) {
        this.limitTimeUnit = limitTimeUnit;
    }

    public int getRemainingIpHits() {
        return remainingIpHits;
    }

    public void setRemainingIpHits(int remainingIpHits) {
        this.remainingIpHits = remainingIpHits;
    }

    public int getRemainingUserHits() {
        return remainingUserHits;
    }

    public void setRemainingUserHits(int remainingUserHits) {
        this.remainingUserHits = remainingUserHits;
    }

    public Date getResetTime() {
        return resetTime;
    }

    public void setResetTime(Date resetTime) {
        this.resetTime = resetTime;
    }

    public int getResetTimeInSeconds() {
        return resetTimeInSeconds;
    }

    public void setResetTimeInSeconds(int resetTimeInSeconds) {
        this.resetTimeInSeconds = resetTimeInSeconds;
    }

    public int getUserLimit() {
        return userLimit;
    }

    public void setUserLimit(int userLimit) {
        this.userLimit = userLimit;
    }

    public int getApiRateLimits() {
        return apiRateLimits;
    }

    public void setApiRateLimits(int apiRateLimits) {
        this.apiRateLimits = apiRateLimits;
    }
}
