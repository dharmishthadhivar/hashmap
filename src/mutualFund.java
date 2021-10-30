public class mutualFund {
    private int mfid;
    private int clientid;


    public mutualFund(int mfid, int clientid) {
        this.mfid = mfid;
        this.clientid = clientid;

    }


    public int getmfid() {
        return mfid;
    }
    public void setmfid(int mfid) {
        this.mfid = mfid;
    }
    public int getclientid() {
        return clientid;
    }
    public void setclientid(int clientid) {
        this.clientid = clientid;
    }
    public String toString() {
        final String s = "Clientid:" + this.getclientid() +
                " mfid: " + this.getmfid() ;
        return s;
    }


}
