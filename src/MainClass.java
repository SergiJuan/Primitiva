public class MainClass {
    public static void main(String[] args) {

        Ticket ticket = new Ticket(8);
        System.out.println(ticket);

        int [] blocks = {5, 10, 15, 20, 25, 30, 35, 40, 45};
        Block block = new Block(blocks);
        System.out.println(block);

        System.out.println("");

        ticket.printUsedNumbers();

    }
}