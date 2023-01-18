package dal;

import model.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class TicketManager {
    private Map<String, Integer> ticketPrices;
    private String vehicleType;

    public TicketManager() {
        ticketPrices = new HashMap<>();
        ticketPrices.put(VehicleType.car.toString(), 50);
        ticketPrices.put(VehicleType.van.toString(), 80);
        ticketPrices.put(VehicleType.bus.toString(), 70);
        ticketPrices.put(VehicleType.truck.toString(), 90);
    }

    public int calculateTicket(String vehicleType){
        return ticketPrices.get(vehicleType);
    }
}
