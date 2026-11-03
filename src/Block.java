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

        block = new int[quantity];

        Random random = new Random();
        for (int i = 0; i < block.length; i++) {
            do {
                block[i] = 0;
            } while (!checkExist(block[i] = random.nextInt(1,49)));

        }


    }

    public Block(int[] block) {
        this.block = block;
    }

    private boolean checkExist(int number) {
        System.out.println("-----------------------------");
        for (int i = 0; i < block.length; i++) {
            System.out.println("[DEBUG]: "+number + "=" + block[i] + " - " + (number == block[i]));
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
            stringBuilder.append(block[i] + ", ");
        }
        return stringBuilder.toString();
    }
}
