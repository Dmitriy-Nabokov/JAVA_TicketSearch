import org.example.Ticket;
import org.example.TicketManager;
import org.example.TicketRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TicketManagerTest {

    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    Ticket ticket1 = new Ticket(1, "VKO", "LED", 300, 100);
    Ticket ticket2 = new Ticket(2, "DME", "KZN", 400, 130);
    Ticket ticket3 = new Ticket(3, "DME", "LED", 270, 95);
    Ticket ticket4 = new Ticket(4, "SVO", "LED", 350, 110);
    Ticket ticket5 = new Ticket(5, "VKO", "SVX", 370, 210);
    Ticket ticket6 = new Ticket(6, "DME", "IKT", 550, 570);
    Ticket ticket7 = new Ticket(7, "DME", "LED", 250, 105);
    Ticket ticket8 = new Ticket(8, "SVO", "LED", 320, 115);
    Ticket ticket9 = new Ticket(9, "DME", "LED", 310, 98);


    @Test
    public void testSortSomeTickets() {   // Найдется нескольких билетов

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = {ticket7, ticket3, ticket9};
        Ticket[] actual = manager.findAll("DME", "LED");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortOneTicket() {      // Найдется 1 билет

        manager.add(ticket2);

        Ticket[] expected = {ticket2};
        Ticket[] actual = manager.findAll("DME", "KZN");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortNoneTickets() {    // Билеты не найдены

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("LED", "KZN");

        Assertions.assertArrayEquals(expected, actual);
    }
}
