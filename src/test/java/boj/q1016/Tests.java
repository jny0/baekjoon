package boj.q1016;

import boj.q1016.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1, 10")
    void t1() {
        assertThat(new Solution().solution(1, 10)).isEqualTo(7);
    }

    @Test
    @DisplayName("1, 8")
    void t4() {
        assertThat(new Solution().solution(1, 8)).isEqualTo(6);
    }

    @Test
    @DisplayName("15, 15")
    void t2() {
        assertThat(new Solution().solution(15,15)).isEqualTo(1);
    }
    @Test
    @DisplayName("1, 1000")
    void t3() {
        assertThat(new Solution().solution(1, 1000)).isEqualTo(608);
    }
}
