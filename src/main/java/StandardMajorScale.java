
public class StandardMajorScale extends Scale<StandardTuning> {

    public StandardMajorScale(StandardTuning tuning) {
        super(tuning);

        notes[0] = true;
        notes[2] = true;
        notes[4] = true;
        notes[5] = true;
        notes[7] = true;
        notes[9] = true;
        notes[11] = true;
    }
}
