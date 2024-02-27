package by.toukach.sortingalgorithm.sorting;

import java.util.Arrays;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) throws Exception {

    int[] ints = new int[]{5, 4, 3, 2, 1};

    int n = ints.length;
    int temp = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1; j++) {
        if ((ints[j + 1]) < ints[j]) {
          temp = ints[j];
          ints[j] = ints[j + 1];
          ints[j + 1] = temp;
        }
      }
    }

    System.out.println("Bubble sort:");
    Arrays.stream(ints)
        .forEach(System.out::print);
    System.out.println();
  }
}
