package logic;

import java.util.Arrays;

public class ChunkShift {

  private static final int RENDER_RADIUS = 1;
  private static int[][] chunks;

  public ChunkShift() {
    chunks = new int[2*RENDER_RADIUS + 1][2*RENDER_RADIUS + 1];

    for (int i = 0; i < chunks.length; i++) {
      for (int j = 0; j < chunks.length; j++) {
        chunks[i][j] = 3*i + j + 1;
      }
    }
  }


  public void shift(int xShift, int yShift) {
    int[][] newChunks = new int[2*RENDER_RADIUS + 1][2*RENDER_RADIUS + 1];
    for (int x = 0; x < chunks.length; x++) {
      for (int y = 0; y < chunks.length; y++) {
        if (coordsWithinRenderRadius(x - xShift, y - yShift)) {
          newChunks[y][x] = chunks[x - xShift][y - yShift];
        }
      }
    }
    chunks = newChunks;
  }

  public boolean coordsWithinRenderRadius(int x, int y) {
    return (
    0 <= x && x < chunks.length &&
    0 <= y && y < chunks.length
    );
  }

  public void printChunks() {
    for (int i = 0; i < chunks.length; i++) {
      for (int j = 0; j < chunks.length; j++) {
        System.out.print("[" + chunks[j][i] + "] ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }
  
}