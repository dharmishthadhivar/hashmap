public class fixediposit {

    private int typeOfFDId;
    private int clientid;
    public fixediposit(int clientid, int typeOfFDId) {
        this.typeOfFDId = typeOfFDId;
        this.clientid = clientid;

    }
    public int gettypeOfFDId() {
        return typeOfFDId;
    }
    public void settypeOfFDId(int typeOfFDId) {
        this.typeOfFDId = typeOfFDId;
    }
    public int getclientid() {
        return clientid;
    }
    public void setclientid(int clientid) {
        this.clientid = clientid;
    }
    public String toString() {
        final String s = "Clientid:" + this.getclientid() +
                " type of FD: " + this.gettypeOfFDId() ;
        return s;
    }

}
