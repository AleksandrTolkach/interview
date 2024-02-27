package by.toukach.sortingalgorithm.sorting;

import java.util.Arrays;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ShakerSort implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) throws Exception {

    int[] ints = new int[]{5, 4, 3, 7, 2, 1, 6, 8};

    int temp = 0;
    int left = 0;
    int right = ints.length - 1;

    while (left <= right) {
      for (int i = left; i < right; i++) {
        if (ints[i] > ints[i + 1]) {
          temp = ints[i];
          ints[i] = ints[i + 1];
          ints[i + 1] = temp;
        }
      }

      left++;

      for (int i = right; i >= left; i--) {
        if (ints[i] < ints[i - 1]) {
          temp = ints[i];
          ints[i] = ints[i - 1];
          ints[i - 1] = temp;
        }
      }

      right--;
    }

    System.out.println("Shaker sort");
    Arrays.stream(ints)
        .forEach(System.out::print);
    System.out.println();
  }
}
