package exo6;

public class EvaluationsIteratorArray implements Iterator {

    private Integer[] evaluations;
    private int position;

    public EvaluationsIteratorArray(Integer[] evaluations) {
        this.evaluations = evaluations;
    }

    @Override
    public boolean hasNext() {
        return !(position >= evaluations.length || evaluations[position] == null);
    }

    @Override
    public Object next() {
        return evaluations[position++];
    }
}
