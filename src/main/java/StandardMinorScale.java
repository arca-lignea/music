public class StandardMinorScale extends Scale<StandardTuning> {

    public StandardMinorScale(StandardTuning tuning) {
        super(tuning);

        notes[0] = true;
        notes[2] = true;
        notes[3] = true;
        notes[5] = true;
        notes[7] = true;
        notes[8] = true;
        notes[11] = true;
    }
}
