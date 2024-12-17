package rest.model;

public class PreferenceVote {
    private int listNumber;
    private String candidateName;
    private int voteCount;

    public PreferenceVote(int listNumber, String candidateName, int voteCount) {
        this.listNumber = listNumber;
        this.candidateName = candidateName;
        this.voteCount = voteCount;
    }

    public int getListNumber() {
        return listNumber;
    }

    public void setListNumber(int listNumber) {
        this.listNumber = listNumber;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
