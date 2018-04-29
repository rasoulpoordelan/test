package games.medrick.medrickestan.api.model.account;

public class LoginViaUsername {
    private String userName;
    private String password;
    private int clientVersion;
    private short market;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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