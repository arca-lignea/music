
public class Scale<T extends Tuning> {

    protected final T tuning;
    protected final boolean[] notes;

    public Scale(T tuning)
    {
        this.tuning = tuning;
        this.notes = new boolean[tuning.getNumIncrements()];
    }

    public boolean[] getNotes() {
        return notes;
    }
}
