import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {
    @Test
    void solution() {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(1,PermCheck.solution(A));

        int[] B = {1,2,4,5,6,7,8,9,10};
        assertEquals(0,PermCheck.solution(B));

        int[] C = {1,2};
        assertEquals(1,PermCheck.solution(C));

        int[] D = {1,3};
        assertEquals(0,PermCheck.solution(D));

        int[] E = {2,2,2};
        assertEquals(0,PermCheck.solution(E));

        int[] F = {12,1,2,11,7,9,10,3,8,6,5,4};
        assertEquals(1,PermCheck.solution(F));
    }

}