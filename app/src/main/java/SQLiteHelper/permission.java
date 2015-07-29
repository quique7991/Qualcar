package SQLiteHelper;

/**
 * Created by quique on 7/28/15.
 */
public class permission {
    int id;

    // setters
    public void setId(int id) {
        this.id = id;
    }

    // getters
    public long getId() {
        return this.id;
    }


    public boolean equals(permission other_obj) {
        if (other_obj == null) return false;
        if (other_obj == this) return true;
        permission o = (permission) other_obj;
        return o.id == this.id;
    }
}
