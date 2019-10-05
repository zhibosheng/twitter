package io.ascending.training.model;

public class Fellow {
    private long id;
    private long fellowee_id;
    private long fellower_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFellowee_Id() {
        return fellowee_id;
    }

    public void setFellowee_Id(long fellowee_id) {
        this.fellowee_id = fellowee_id;
    }

    public long getFellower_Id() {
        return fellower_id;
    }

    public void setFellower_Id(long fellower_id) {
        this.fellower_id = fellower_id;
    }
}
