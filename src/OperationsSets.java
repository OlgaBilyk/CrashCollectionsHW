import java.util.HashSet;
import java.util.Set;
public class OperationsSets {
    public Set<Integer> union(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> newSet = new HashSet<>(s1);
        newSet.addAll(s2);
        return newSet;
    }
    public Set<Integer> intersect(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> newSet = new HashSet<Integer>(s1);
        newSet.retainAll(s2);
        return s2;
    }
}
