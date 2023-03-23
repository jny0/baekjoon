package boj.자료구조.boj2504;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("(()[[]])([])")
    void t1() {
        assertThat(new Solution().solution("(()[[]])([])")).isEqualTo(28);
    }

    @Test
    @DisplayName("[][]((])")
    void t2() {
        assertThat(new Solution().solution("[][]((])")).isEqualTo(0);
    }
}