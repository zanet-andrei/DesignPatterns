package exo6;

import java.util.ArrayList;

public class EvaluationsIterator implements Iterator{

    private ArrayList<Integer> evaluations;
    private int position;

    public EvaluationsIterator(ArrayList<Integer> evaluations) {
        this.evaluations = evaluations;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < evaluations.size();
    }

    @Override
    public Object next() {
        return evaluations.get(position++);
    }
}
