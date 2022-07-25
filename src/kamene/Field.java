package kamene;

import java.util.*;

public class Field {
    private Tile[][] field;

    public Field() {
        field = new Tile[4][4];
        int number = 0;
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                field[row][column] = new Tile(number);
                number++;
            }
        }
        initializeField();
    }

    private void initializeField() {
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            int action = random.nextInt(4);
            if (action == 0) {
                pressW();
            } else if (action == 1) {
                pressS();
            } else if (action == 2) {
                pressA();
            } else {
                pressD();
            }
        }
    }

    public void pressW() {
        int emptyTileRow = 0;
        int emptyTileColumn = 0;

        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                if (field[row][column].getNumber() == 0) {
                    emptyTileRow = row;
                    emptyTileColumn = column;
                }
            }
        }

        if (emptyTileRow + 1 < field.length) {
            swapTiles(emptyTileRow, emptyTileColumn, emptyTileRow + 1, emptyTileColumn);
        }
    }

    public void pressA() {
        int emptyTileRow = 0;
        int emptyTileColumn = 0;

        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                if (field[row][column].getNumber() == 0) {
                    emptyTileRow = row;
                    emptyTileColumn = column;
                }
            }
        }

        if (emptyTileColumn + 1 < field[emptyTileRow].length) {
            swapTiles(emptyTileRow, emptyTileColumn, emptyTileRow, emptyTileColumn + 1);
        }
    }

    public void pressS() {
        int emptyTileRow = 0;
        int emptyTileColumn = 0;

        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                if (field[row][column].getNumber() == 0) {
                    emptyTileRow = row;
                    emptyTileColumn = column;
                }
            }
        }

        if (emptyTileRow > 0) {
            swapTiles(emptyTileRow, emptyTileColumn, emptyTileRow - 1, emptyTileColumn);
        }
    }

    public void pressD() {
        int emptyTileRow = 0;
        int emptyTileColumn = 0;

        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                if (field[row][column].getNumber() == 0) {
                    emptyTileRow = row;
                    emptyTileColumn = column;
                }
            }
        }

        if (emptyTileColumn > 0) {
            swapTiles(emptyTileRow, emptyTileColumn, emptyTileRow, emptyTileColumn - 1);
        }
    }

    private void swapTiles(int row1, int column1, int row2, int column2) {
        Tile temp = field[row1][column1];

        field[row1][column1] = field[row2][column2];
        field[row2][column2] = temp;
    }

    public void printField() {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                Tile tile = field[row][column];
                System.out.print(tile.getNumber());
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}

