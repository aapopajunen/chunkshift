package main;

import logic.ChunkShift;

public class Main {

  private final ChunkShift chunkShift = new ChunkShift();

  private void run() {
      chunkShift.printChunks();
      chunkShift.shift(-1,-1);
      chunkShift.printChunks();
      chunkShift.shift(1,1);
      chunkShift.printChunks();
      chunkShift.shift(1,1);
      chunkShift.printChunks();
  }

  public static void main(String[] args) {
    new Main().run();
  }

}