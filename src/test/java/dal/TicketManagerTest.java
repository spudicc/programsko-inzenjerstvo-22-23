package dal;

import model.Engine;
import model.Vehicle;
import model.VehicleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {

    @Test
    void calculateTicketShouldReturn50ForCarVehicle() {
        TicketManager ticketManager = new TicketManager();
        Vehicle vehicle = new Vehicle(Engine.gas, 30, VehicleType.car);
        assertEquals(50, ticketManager.calculateTicket(vehicle.getVehicleType().toString()));
    }
}