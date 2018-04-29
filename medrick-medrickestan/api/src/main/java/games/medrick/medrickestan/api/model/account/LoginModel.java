package games.medrick.medrickestan.api.model.account;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public class LoginModel {
    private String udid;
    private int clientVersion;
    private short market;

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public int getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(int clientVersion) {
        this.clientVersion = clientVersion;
    }

    public short getMarket() {
        return market;
    }

    public void setMarket(short market) {
        this.market = market;
    }
}
