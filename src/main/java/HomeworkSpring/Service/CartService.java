package HomeworkSpring.Service;


import java.util.List;

public interface CartService {
    void add(List<Integer> items);
    List<Integer> get();
}
