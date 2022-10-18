package by.itstep.gulik.model.logic;

import by.itstep.gulik.model.entity.abstracts.Transport;

public class GasStation {
    public static int calcTotalOil (Transport[] transports) {
        int total = 0;

        for (Transport transport: transports) {
            total += transport.getTank();
        }

        return total;
    }
}
