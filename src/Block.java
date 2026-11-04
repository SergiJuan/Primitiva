import java.util.Random;

public class Block {
    int quantity;
    int[] block;

    public Block(int quantity) {
        if (quantity < 6) {
            this.quantity = 6;
        } else if (quantity > 49) {
            this.quantity = 49;
        } else {
            this.quantity = quantity;
        }

        block = new int[this.quantity];

        Random random = new Random();
        for (int i = 0; i < block.length; i++) {
            do {
                block[i] = random.nextInt(1, 50);
            } while (checkExist(block[i], i));
        }


    }

    public Block(int[] block) {
        this.block = block;
    }

    private boolean checkExist(int number, int position) {
        for (int i = 0; i < position; i++) {
            if (number == block[i]) {
                return true;
            }
        }
        return false;
    }

    public int[] getNumbers() {
        return block;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < block.length; i++) {
            if (i == block.length - 1) {
                stringBuilder.append(block[i] + "");
            } else {
                stringBuilder.append(block[i] + ", ");
            }
        }
        return stringBuilder.toString();
    }
}
