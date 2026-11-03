public class Ticket {
    Block[] ticket;

    public Ticket(int quantity) {
        ticket = new Block[quantity];
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = new Block(6);
        }
    }

    public void printUsedNumbers() {
        // TODO (b -- III
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
