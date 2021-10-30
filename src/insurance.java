public class insurance {
    private int policyid;
    private int clientid;

    public insurance(int clientid, int policyid) {
        this.policyid = policyid;
        this.clientid = clientid;

    }

    public int getpolicyid() {
        return policyid;
    }
    public void setpolicyid(int policyid) {
        this.policyid = policyid;
    }
    public int getclientid() {
        return clientid;
    }
    public void setclientid(int clientid) {
        this.clientid = clientid;
    }
    public String toString() {
        final String s = "Clientid:" + this.getclientid() +
                " policy id: " + this.getpolicyid() ;
        return s;
    }
}
