public class Ticket {
    Block[] ticket;

    public Ticket(int quantity) {
        ticket = new Block[quantity];
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = new Block(6);
        }
    }

    public void printUsedNumbers() {
        int[] allNumbers = new int[ticket.length * 6];

        for (int i = 0; i < ticket.length; i++) {
            System.arraycopy(ticket[i].getNumbers(), 0, allNumbers, 6 * i, ticket[i].getNumbers().length);
        }

        for (int i = 0; i < allNumbers.length; i++) {
            int tmpNumber = allNumbers[i];

            for (int j = 0; j < allNumbers.length; j++) {
                if (tmpNumber == allNumbers[j]) {
                    if (i == j) {
                        System.out.print(allNumbers[i] + ", ");
                    }
                    break;
                }
            }

        }
        System.out.println("");
    }

    private boolean checkExist(int[] allNumbers, int number, int position) {
        for (int i = 0; i < position; i++) {
            if (number == allNumbers[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ticket.length; i++) {
            stringBuilder.append(ticket[i].toString() + "\n");
        }
        return stringBuilder.toString();
    }
}
