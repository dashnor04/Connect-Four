package spw4.gameConnectFour;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.junit.jupiter.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
    class GameImplTest {

        private GameImpl g;
        @BeforeEach
        public void beforeEach() {
            g = new GameImpl();
            g.initialize();
        }
        @Test
        public void testInitialize() {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    assertEquals(0, g.board[i][j]);
                }
            }
        }
        @Test
        public void testPlaceToken() {
            g.placeToken(0);
            assertEquals(1, g.board[5][0]);
            g.placeToken(0);
            assertEquals(2, g.board[4][0]);
        }

        @Test
        public void testOutOfBoundInput() {
            assertThrows(IndexOutOfBoundsException.class, () -> {
                g.placeToken(10);
            });
        }


}
